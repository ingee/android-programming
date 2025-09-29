package com.bignerdranch.android.codapizza.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
private fun ToppingCellPreview() {
    ToppingCell()
}

@Composable
fun ToppingCell() {
    Row {
        Checkbox(
            checked = true,
            onCheckedChange = { /*TODO*/ }
        )
        Column {
            Text(
                text = "Pineapple"
            )
            Text(
                text = "Whole pizza"
            )
        }
    }
}
