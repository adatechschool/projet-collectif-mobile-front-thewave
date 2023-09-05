package com.example.thewaveapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
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
                )
                {
                    SurfSpotApp(id = 1)


                }
            }
        }
    }
}

@Composable
fun Greeting(spotName: String, spotPlace: String, modifier: Modifier = Modifier) {
    val offset = Offset(5.0f, 10.0f)
    Column {
        Text(
            text = spotName,
            color = Color.White,
            style = TextStyle(
                fontSize = 75.sp,
                lineHeight = 116.sp,
                textAlign = TextAlign.Center,
                shadow = Shadow(
                    color = Color.Black,
                    offset = offset,
                    blurRadius = 3f
                )
            ),
            modifier = Modifier
                .padding(6.dp)
        )

        Text(
            text = spotPlace,
            color = Color.LightGray,
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
        //CenterAlignedTopAppBarExample()
    }
}


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
