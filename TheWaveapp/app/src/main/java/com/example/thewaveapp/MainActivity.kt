package com.example.thewaveapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thewaveapp.ui.theme.TheWaveAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheWaveAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(spotName = "Fonteau", spotPlace = "Spot de surf")

                }
            }
        }
    }
}

@Composable
fun Greeting(spotName: String, spotPlace: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = spotName,
            color = white,
            fontSize = 80.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(6.dp)
        )

        Text(
            text = spotPlace,
            fontSize = 36.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(16.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.reefbreak),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        )
        }
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TheWaveAppTheme {
        GreetingImage(spotName = "Reef Break", spotPlace = "Pipeline, Oahu, Hawaii")
        //SearchBar()
    }
}

/*@Composable
fun SearchBar(modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Rechercher un spot",
            modifier = modifier.align(alignment = androidx.compose.ui.Alignment.CenterHorizontally)
        )
    }
}
 */
@Composable
fun GreetingImage(spotName: String, spotPlace: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.fonteau2)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillHeight
        )
        Greeting(
            spotName = spotName,
            spotPlace = spotPlace,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
            )
    }
}

