package com.the_Chance.movietime.composable

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.the_Chance.movietime.ui.theme.SecondaryTextColor

@Composable
fun CategoryCard(
    title: String,
    modifier: Modifier
) {
    Box(modifier.padding(horizontal = 4.dp)) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = modifier
                .border(
                    width = 0.dp,
                    color = SecondaryTextColor,
                    shape = CircleShape
                )
                .padding(horizontal = 4.dp)
        ) {
            TextInfo(text = title, size = 14, FontWeight.Normal)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    CategoryCard("rrrrrrrrrrrrrr", modifier = Modifier)
}