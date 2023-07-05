package com.the_Chance.movietime.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pancake.movietime.R
import com.the_Chance.movietime.composable.BottomCard
import com.the_Chance.movietime.composable.ImageMovie

@Composable
fun BookingScreen(
){
    BookingContent()
}

@Composable
fun BookingContent(){
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