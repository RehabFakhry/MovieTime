package com.pancake.movietime.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BottomCard(){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp),
        shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp),
    ) {
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row() {
                Box(modifier = Modifier.weight(1f)){
                ColumnCard(rate = "6.8/10", info = "IMDb")}
                Box(modifier = Modifier.weight(1f)){
                ColumnCard(rate = "63%", info = "Rotten Tomatoes")}
                Box(modifier = Modifier.weight(1f)){
                ColumnCard(rate = "4/10", info = "IGN")}
            }
            SpacerVertical(height = 8)
            Row(modifier = Modifier.padding(horizontal = 32.dp)) {
                TextDescription(text = "Fantastic Beasts: The Secrets Of Dumbledore", size = 24) }
            SpacerVertical(height = 8)
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 100.dp)) {
                Box(modifier = Modifier.weight(1f)){
                    CategoryCard(title = "Fantasy",)
                }
                SpacerHorizontal(width = 8)
                Box(modifier = Modifier.weight(1f)){
                    CategoryCard(title = "Adventure")
                }
            }
            SpacerVertical(height = 8)
            Row(Modifier.padding(horizontal = 20.dp)) {
                TextInfo(
                    text = "Professor Albus Dumbledore knows the powerful Dark wizard" +
                            " Gellert Grindelwald is moving to seize control of the wizarding.... ",
                    12 ) }

            SpacerVertical(height = 8)
//            LazyRow(content = ){
//
//            }

            SpacerVertical(height = 8)
            Row(verticalAlignment = Alignment.CenterVertically) {
                ButtonClick(text = "Booking") {
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBookingScreen(){
    BottomCard()
}
