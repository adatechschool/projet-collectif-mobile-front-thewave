package com.example.thewaveapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.thewaveapp.R

@Composable
fun WelcomeScreen(
    modifier: Modifier = Modifier
    onClick: () -> Unit
) {
    Column {
        Image(painter = painterResource(R.drawable.wavelogo1) , contentDescription = "logo")
        Text(text = "The Wave")

    Button(onClick = { /*TODO*/ }) {
            Text(text = "Welcome to The Wave")
    }
}
    
@Preview
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen()
}