package com.the_Chance.movietime.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.the_Chance.movietime.R
import com.the_Chance.movietime.state.CalenderUiState
import com.the_Chance.movietime.state.CalendersUiState
import com.the_Chance.movietime.state.TimeUiState
import com.the_Chance.movietime.state.TimesUiState
import com.the_Chance.movietime.ui.theme.PrimaryTextColor
import com.the_Chance.movietime.ui.theme.SecondaryTextColor
import com.the_Chance.movietime.ui.theme.White60
import com.the_Chance.movietime.ui.theme.White87
import com.the_Chance.movietime.viewModel.CalenderViewModel
import com.the_Chance.movietime.viewModel.TimeViewModel

@Composable
fun BottomTicketsCard(){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(.9f),
        shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp),
        ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LazyRawCalender()
            SpacerVertical(height = 12)
            LazyRawTime()
            SpacerVertical(height = 12)
            Spacer(modifier = Modifier.weight(1f))
            Row(modifier = Modifier
                .fillMaxWidth().padding(bottom = 4.dp)
                .padding(horizontal = 4.dp),
                horizontalArrangement = Arrangement.Center) {
                Column() {
                    TextTitle(title = stringResource(R.string._100_00), size = 18, color = PrimaryTextColor)
                    SpacerVertical(height = 4)
                    TextTitle(title = stringResource(R.string._4_tickets), size = 14, color = SecondaryTextColor)
                }
                Spacer(modifier = Modifier.weight(.75f))
                Column() {
                    ButtonWithIcon(
                        iconResId = R.drawable.booking,
                        text = stringResource(R.string.buy_tickets)) {}
                }
            }
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
        contentPadding = PaddingValues(horizontal = 16.dp)
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

@Composable
fun LazyRawTime(
    viewModel: TimeViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    LazyRawTimeContent(state = state)
}

@Composable
private fun LazyRawTimeContent(
    state: TimesUiState
) {
    LazyRow(horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(state.time) {
            TimeItem(state = it)
        }
    }
}

@Composable
fun TimeItem(state: TimeUiState) {
    Box(modifier= Modifier.padding(horizontal = 2.dp)) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .border(
                    width = 0.dp,
                    color = Color.Gray,
                    shape = CircleShape
                )
                .padding(horizontal = 16.dp)
        ) {
            TextInfo(text = state.time, size = 14, FontWeight.Normal)
        }
    }
}