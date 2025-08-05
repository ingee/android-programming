package com.bignerdranch.android.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "yourApiKeyHere"

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestringness.getList" +
            "&api_key=$API_KEY" +
            "&format=json" +
            "&nojsoncallback=1" +
            "&extras=url_s"
    )
    suspend fun fetchPhotos(): String
}