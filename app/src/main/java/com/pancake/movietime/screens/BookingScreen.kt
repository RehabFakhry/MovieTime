package com.pancake.movietime.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pancake.movietime.composable.BottomCard

@Composable
fun BookingScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Spacer(modifier = Modifier.weight(1f))
        BottomCard()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewBookingScreen(){
    BookingScreen()
}