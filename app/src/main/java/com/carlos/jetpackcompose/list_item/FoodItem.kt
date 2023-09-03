package com.carlos.jetpackcompose.list_item

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun FoodItem(

) {
  ConstraintLayout(
      modifier = Modifier
          .fillMaxWidth()
          .background(Color.Black)
          .padding(0.dp, 10.dp,0.dp, 10.dp)
  ) {

  }
}

@Composable
@Preview
private fun FoodItemPreview() {
    FoodItem()
}