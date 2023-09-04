package com.example.thewaveapp.ui

import androidx.compose.material3.Text

// Composable function that displays one Spot screen with Name, description, location and image
@Composable
fun TheSpotScreen() {
    Column {
        Text(text = "The Spot")
        Text(text = "Description")
        Text(text = "Location")
        Text(text = "difficulty")
        Text(text = "season")
        Image(painter = , contentDescription = )

    }
}

@Preview
@Composable
fun TheSpotScreenPreview() {
    TheSpotScreen()
}