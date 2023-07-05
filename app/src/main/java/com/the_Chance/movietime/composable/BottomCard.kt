package com.the_Chance.movietime.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pancake.movietime.R
import com.the_Chance.movietime.state.CharacterUiState
import com.the_Chance.movietime.state.CharactersUiState

@Composable
fun BottomCard(
//    state: CharactersUiState,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp),
        shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row() {
                Box(modifier = Modifier.weight(1f)) {
                    ColumnCard(rate = "6.8/10", info = "IMDb")
                }
                Box(modifier = Modifier.weight(1f)) {
                    ColumnCard(rate = "63%", info = "Rotten Tomatoes")
                }
                Box(modifier = Modifier.weight(1f)) {
                    ColumnCard(rate = "4/10", info = "IGN")
                }
            }
            SpacerVertical(height = 16)
            Row(modifier = Modifier.padding(horizontal = 32.dp)) {
                TextDescription(text = "Fantastic Beasts: The Secrets Of Dumbledore", size = 24)
            }
            SpacerVertical(height = 16)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                CategoryCard(title = "Fantasy", modifier = Modifier)
                SpacerHorizontal(width = 4)
                CategoryCard(title = "Adventure", modifier = Modifier)
            }
            SpacerVertical(height = 16)
            //            LazyRow(
//                horizontalArrangement = Arrangement.spacedBy(16.dp),
//                contentPadding = PaddingValues(horizontal = 16.dp) )
////            {
////                items(state.character){
////                    CharacterItem(state = it)
////            }
//            }

            Row(Modifier.padding(horizontal = 20.dp)) {
                TextInfo(
                    text = "Professor Albus Dumbledore knows the powerful Dark wizard" +
                            " Gellert Grindelwald is moving to seize control of the wizarding.... "
                    , 12
                )
            }
            SpacerVertical(height = 16)
            Spacer(modifier = Modifier.weight(1f))
            ButtonWithIcon(iconResId = R.drawable.booking, text = "Booking") {}
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewBookingScreen() {
    BottomCard()
}
