package com.the_Chance.movietime

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.the_Chance.movietime.screens.BookingScreen
import com.the_Chance.movietime.screens.HomeScreen
import com.the_Chance.movietime.screens.TicketsScreen
import com.the_Chance.movietime.ui.theme.MovieTimeTheme

@Composable
fun MovieTime(){
    MovieTimeTheme {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "homeScreen"){
            composable("homeScreen"){ HomeScreen(navController)}
            composable("bookingScreen"){ BookingScreen(navController)}
            composable("ticketsScreen"){ TicketsScreen(navController)}
        }
    }
}