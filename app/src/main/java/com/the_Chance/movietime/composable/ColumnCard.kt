package com.the_Chance.movietime.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ColumnCard(
    rate: String,
    info: String
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
    ) {
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally) {
            TextInfo(text = rate, size = 16)
            SpacerVertical(height = 4)
            TextTitle(title = info, size = 12)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun preview(){
    ColumnCard("rrr", "sss")
}