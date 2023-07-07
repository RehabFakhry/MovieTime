package com.the_Chance.movietime.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.the_Chance.movietime.ui.theme.White60

@Composable
fun ColumnCard(
    rate: String,
    info: String
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        colors = CardDefaults.cardColors(White60)
    ) {
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally) {
            TextInfo(text = rate, size = 16)
            SpacerVertical(height = 4)
            TextTitle(title = info, size = 12, Color.Gray)
        }
    }
}

@Composable
fun ColumnCardCalender(
    number: Int,
    day: String
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        colors = CardDefaults.cardColors(White60)
    ) {
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally) {
            TextCalender(text = number, size = 18)
            SpacerVertical(height = 4)
            TextTitle(title = day, size = 12, Color.Gray)
//                Box(
//                    contentAlignment = Alignment.Center,
//                    modifier = Modifier
//                        .border(
//                            width = 0.dp,
//                            color = Color.Gray,
//                            shape = RectangleShape
//                        )
//                        .padding(horizontal = 4.dp)
//                ) {
//
//                }
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun preview(){
    ColumnCard("rrr", "sss")
}