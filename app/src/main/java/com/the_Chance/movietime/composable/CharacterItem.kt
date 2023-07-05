package com.the_Chance.movietime.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.the_Chance.movietime.state.CharacterUiState

@Composable
fun CharacterItem(state: CharacterUiState){
    Image(
        painter = rememberAsyncImagePainter(model = state.imageUrl),
        contentDescription = "Character",
        modifier = Modifier
            .size(96.dp)
            .clip(CircleShape)
            .background(color = Color(0XFFF8F8F8)),)
}