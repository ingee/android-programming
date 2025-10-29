package com.bignerdranch.android.codapizza.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.bignerdranch.android.codapizza.R
import com.bignerdranch.android.codapizza.model.Pizza
import com.bignerdranch.android.codapizza.model.Topping
import com.bignerdranch.android.codapizza.model.ToppingPlacement

@Preview
@Composable
private fun PizzaHeroImagePreview() {
    PizzaHeroImage(
        pizza = Pizza(
            toppings =  mapOf(
                Topping.Pineapple to ToppingPlacement.All,
                Topping.Pepperoni to ToppingPlacement.Left,
                Topping.Basil to ToppingPlacement.Right
            )
        )
    )
}

@Composable
fun PizzaHeroImage(
    pizza: Pizza,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(R.drawable.pizza_crust),
            contentDescription = stringResource(R.string.pizza_preview),
        )

        pizza.toppings.forEach { (topping, placement) ->
            Image(
                painter = painterResource(topping.pizzaOverlayImage),
                contentDescription = null,
                modifier = Modifier.focusable(false)
            )
        }
    }
}