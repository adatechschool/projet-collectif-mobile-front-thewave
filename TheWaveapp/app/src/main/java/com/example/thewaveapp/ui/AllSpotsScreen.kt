package com.example.thewaveapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.material3.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.thewaveapp.R


// A screen with the view of all the surf spots like gallery view
@Composable
fun AllSpots(
    modifier: Modifier = Modifier
) {
   Column {
        Text(text = "The Wave")
       // For all spot in spots, afficher spot
        Text(text = "The Spot")
        Text(text = "Description")
        Text(text = "Location")
        Text(text = "difficulté")
        Image(
            painter = painterResource(R.drawable.reefbreak),
            contentDescription = null,
            modifier = Modifier,
        )
   }
}

@Preview
@Composable
fun AllSpotsPreview() {
    AllSpots()
}
