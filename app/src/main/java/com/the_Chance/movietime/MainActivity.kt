package com.the_Chance.movietime

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.the_Chance.movietime.screens.HomeScreen
import com.the_Chance.movietime.ui.theme.MovieTimeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieTimeTheme {
                HomeScreen()
            }
        }
    }
}


