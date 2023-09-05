package com.example.thewaveapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.thewaveapp.R

// Composable function that displays one Spot screen with Name, description, location and image
@Composable
fun TheSpotScreen(
    id: String = "1",
) {
    Column {
        Text(text = "The Spot")
        Text(text = "Description")
        Text(text = "Location")
        Text(text = "difficulty")
        Text(text = "season")
        Image(painter = painterResource(R.drawable.reefbreak), contentDescription = null)

    }
}

@Preview
@Composable
fun TheSpotScreenPreview() {
    TheSpotScreen()
}