package com.the_Chance.movietime.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.the_Chance.movietime.R
import com.the_Chance.movietime.ui.theme.Orange
import com.the_Chance.movietime.ui.theme.White60
import com.the_Chance.movietime.ui.theme.White87

@Composable
fun ImageMovie() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Image(
            painter = painterResource(id = R.drawable.movie_image),
            contentDescription = "Movie Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .padding(top = 24.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            CloseIcon()
            ClockIcon()
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 190.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            IconButton(onClick = {}, modifier = Modifier.size(56.dp)) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(CircleShape)
                        .background(Orange),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_play),
                        contentDescription = "Play Movie",
                        tint = Color.White,
                        modifier = Modifier
                            .size(24.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun CloseIcon(){
    Box(
        modifier = Modifier
            .clip(CircleShape)
            .background(Color.White.copy(alpha = .3f))
            .size(32.dp),
        contentAlignment = Alignment.Center
    ){
        Icon(painter = painterResource(id = R.drawable.icon_close),
            contentDescription = "Close Icon",
            tint = Color.White,
            modifier = Modifier.size(24.dp))
    }
}

@Composable
fun ClockIcon(){
    Row(
        modifier = Modifier
            .clip(RectangleShape)
            .background(Color.White.copy(alpha = .3f), shape = CircleShape)
            .padding(horizontal = 8.dp, vertical = 4.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(painter = painterResource(id = R.drawable.icon_clock_circle),
            contentDescription = "Movie Time",
        tint = White60,
        modifier = Modifier.size(16.dp)
        )
        SpacerHorizontal(width = 4)
        Text(
            text = "2h 23m",
            color = White87,
            fontSize = 12.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun ImageIcon(){
    ImageMovie()
}
