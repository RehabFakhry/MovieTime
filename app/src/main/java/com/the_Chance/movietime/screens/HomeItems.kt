
package com.the_Chance.movietime.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.the_Chance.movietime.R

//@OptIn(ExperimentalFoundationApi::class)
//@Composable
//fun HomeItem() {
//    val images = listOf(
//        R.drawable.movie_image,
//        R.drawable.harry_potter,
//        R.drawable.movie_image,
//    )
//    val pagerStat = rememberPagerState(
//        initialPage = 0,
//        initialPageOffsetFraction = 0f
//    ) {
//        // provide pageCount
//    }
//    Box(modifier = Modifier.size(100.dp)) {
//        HorizontalPager(
//            modifier = Modifier,
//            state = pagerState,
//            key = { images[it] },
//            pageSize = PageSize.Fill
//        ) { index ->
//            Image(
//                painter = painterResource(id = images[index]),
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier.fillMaxSize()
//            )
//        }
//    }
//}
