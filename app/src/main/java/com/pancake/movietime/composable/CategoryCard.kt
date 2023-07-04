package com.pancake.movietime.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CategoryCard(title: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(36.dp)
            .background(Color.White)
            .padding(vertical = 8.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        border = BorderStroke(0.dp, Color.Gray),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextInfo(text = title, size = 14)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    CategoryCard("rrrrrrrrrrrrrr")
}