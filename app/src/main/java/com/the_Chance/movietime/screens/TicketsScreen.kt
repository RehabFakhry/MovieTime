package com.the_Chance.movietime.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.the_Chance.movietime.R
import com.the_Chance.movietime.composable.BottomTicketsCard
import com.the_Chance.movietime.composable.CloseIcon
import com.the_Chance.movietime.composable.SpacerHorizontal
import com.the_Chance.movietime.composable.SpacerVertical
import com.the_Chance.movietime.composable.TextTitle
import com.the_Chance.movietime.ui.theme.White87

@Composable
fun TicketsScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 32.dp)
            ) {
                CloseIcon()
            }
            SpacerVertical(height = 8)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.image_header),
                    contentDescription = null
                )
            }
            SpacerVertical(height = 24)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.image_sets),
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth
                )
            }
            SpacerVertical(height = 16)
            Row(
                modifier = Modifier
                    .fillMaxWidth().padding(horizontal = 8.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                ItemSelected(title = "Available", icon = R.drawable.icon_dot_white)
                ItemSelected(title = "Taken", icon = R.drawable.icon_dot_gray)
                ItemSelected(title = "Selected", icon = R.drawable.icon_dot_orange)
            }
                Spacer(modifier = Modifier.weight(1f))
                BottomTicketsCard()
        }
    }
}

@Composable
fun ItemSelected(
    modifier: Modifier = Modifier,
    title: String,
    icon: Int,
    contentDescription: String? = null,
    tint: Color = Color.Unspecified,
) {
    Card(
        modifier = Modifier.wrapContentWidth().wrapContentHeight(),
        colors = CardDefaults.cardColors(Color.Black)) {
        Row(horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
            Icon(
                modifier = modifier.size(14.dp),
                painter = painterResource(icon),
                contentDescription = contentDescription,
                tint = tint
            )
            SpacerHorizontal(width = 8)
            TextTitle(title =title , size =14 , color = White87 )
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewBTicketsScreen(){
    TicketsScreen()
}

