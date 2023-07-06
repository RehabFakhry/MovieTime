package com.the_Chance.movietime.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.the_Chance.movietime.composable.BottomCard
import com.the_Chance.movietime.composable.ImageMovie

@Composable
fun BookingScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        ImageMovie()
        Column {
            Spacer(modifier = Modifier.weight(1f))
            BottomCard()
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewBookingScreen(){
    BookingScreen()
}