package com.example.thewaveapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


/*@Composable
fun SurfSpotAppBar() {
    TopAppBar(
        title = { Text(text = "The Wave App") },
        }
    )
}*/

@Composable
fun SurfSpotApp(
    modifier: Modifier = Modifier,
    viewModel: OrderViewModel = viewModel()
) {
    val navController = rememberNavController()

}