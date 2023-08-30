package com.example.thewaveapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thewaveapp.ui.theme.TheWaveAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheWaveAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()

                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Nom du Spot",
            modifier = modifier.align(alignment = androidx.compose.ui.Alignment.CenterHorizontally)
        )

        Text(
            text = "Description du spot de Surf",
            modifier = modifier.align(alignment = androidx.compose.ui.Alignment.CenterHorizontally)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier
                .size(80.dp)
                .fillMaxSize()
                .padding(16.dp)
        )// Create Button
        Button(onClick = { /*TODO*/ }) {
            var text = "Ajouter un spot"
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TheWaveAppTheme {
        Greeting()
        SearchBar()
    }
}

@Composable
fun SearchBar(modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Rechercher un spot",
            modifier = modifier.align(alignment = androidx.compose.ui.Alignment.CenterHorizontally)
        )
    }
}

