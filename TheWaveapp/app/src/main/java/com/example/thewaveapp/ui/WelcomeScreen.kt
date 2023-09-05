package com.example.thewaveapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import com.example.thewaveapp.R
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Welcome(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(R.drawable.wavelogo1),
            contentDescription = "logo"
        )
        Text(
            text = "The Wave"
        )

    Button(
        onClick = onClick,
        modifier = Modifier
            .widthIn(min = 250.dp)
    ) {
            Text(text = "Welcome to The Wave")
    }
}

@Preview
@Composable
fun WelcomePreview() {
    Welcome(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        onClick = {}
    )
}