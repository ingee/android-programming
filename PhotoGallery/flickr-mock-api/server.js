const jsonServer = require('json-server')
const chokidar = require('chokidar')
const path = require('path')

const resJsonPath = path.join(__dirname, 'res.json')
const routesJsonPath = path.join(__dirname, 'routes.json')

const server = jsonServer.create()
const router = jsonServer.router(resJsonPath)
const middlewares = jsonServer.defaults()
const routes = require(routesJsonPath)
const rewriter = jsonServer.rewriter(routes)

server.use(middlewares)
server.use(rewriter)
server.use(router)

const PORT = 3000
server.listen(PORT, () => {
    console.log(`JSON Server is running on port ${PORT}`)
})

chokidar.watch(resJsonPath).on('change', () => {
    console.log('res.json has changed. Reloading...')
    router.db.read()
})