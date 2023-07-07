package com.the_Chance.movietime.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.the_Chance.movietime.state.CalenderUiState
import com.the_Chance.movietime.state.CalendersUiState
import com.the_Chance.movietime.viewModel.CalenderViewModel

@Composable
fun BottomTicketsCard(){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(.5f),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(16.dp),
        ) {
            LazyRawCalender()
        }
    }
}

@Composable
fun LazyRawCalender(
    viewModel: CalenderViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    LazyRawContent(state = state)
}

@Composable
private fun LazyRawContent(
    state: CalendersUiState
) {
    LazyRow(horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 8.dp)
    ) {
        items(state.calender) {
            CalendersItem(state = it)
        }
    }
}

@Composable
fun CalendersItem(state: CalenderUiState) {
    ColumnCardCalender(state.number, state.day)
}

//@Composable
//fun LazyRawTime(
//    viewModel: CharacterViewModel = hiltViewModel()
//) {
//    val state by viewModel.state.collectAsState()
//    LazyRawTimeContent(state = state)
//}
//
//@Composable
//private fun LazyRawTimeContent(
//    state: CalendersUiState
//) {
//    LazyRow(horizontalArrangement = Arrangement.spacedBy(16.dp),
//        contentPadding = PaddingValues(horizontal = 16.dp)
//    ) {
//        items(state.calender) {
//            TimeItem(state = it)
//        }
//    }
//}
//
//@Composable
//fun TimeItem(state: CharacterUiState) {
//    Image(
//        painter = rememberAsyncImagePainter(model = state.image),
//        contentDescription = "Character",
//        modifier = Modifier
//            .size(75.dp)
//            .clip(CircleShape),
//        contentScale = ContentScale.Crop,
//    )
//}