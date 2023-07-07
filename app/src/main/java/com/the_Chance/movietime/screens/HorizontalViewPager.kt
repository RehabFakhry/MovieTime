package com.the_Chance.movietime.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.the_Chance.movietime.R
import com.the_Chance.movietime.composable.SpacerVertical


@Composable
fun HorizontalViewPager() {

    val images = listOf(
        R.drawable.image_movie1,
        R.drawable.image_movie2,
        R.drawable.image_movie3,
        R.drawable.image_movie4,
        R.drawable.image_movie2,
    )
    SpacerVertical(height = 16)
    var pagerState = rememberPagerState()
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(Alignment.CenterVertically)
            .padding(horizontal = 16.dp, vertical = 4.dp)
    ) {
        HorizontalPager(
            count = images.size,
            state = pagerState,
            key = { images[it] }
        ) { index ->
            Image(
                painter = painterResource(id = images[index]),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(.9f)
                    .padding(horizontal = 8.dp)
                    .clip(shape = RoundedCornerShape(16.dp))
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPage() {
    HorizontalViewPager()
}