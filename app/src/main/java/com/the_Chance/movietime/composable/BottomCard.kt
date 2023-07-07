package com.the_Chance.movietime.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.the_Chance.movietime.R
import com.the_Chance.movietime.state.CharacterUiState
import com.the_Chance.movietime.state.CharactersUiState
import com.the_Chance.movietime.viewModel.CharacterViewModel

@Composable
fun BottomCard() {
    val navController = rememberNavController()
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(.5f),
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
                    ColumnCard(rate = stringResource(R.string._6_8_10),
                        info = stringResource(R.string.imdb))
                }
                Box(modifier = Modifier.weight(1f)) {
                    ColumnCard(rate = stringResource(R.string._63),
                        info = stringResource(R.string.rotten_tomatoes))
                }
                Box(modifier = Modifier.weight(1f)) {
                    ColumnCard(rate = stringResource(R.string._4_10),
                        info = stringResource(R.string.ign))
                }
            }
            SpacerVertical(height = 8)
            Row(modifier = Modifier.padding(horizontal = 32.dp)) {
                TextInfo(text = stringResource(R.string.fantastic_beasts_the_secrets_of_dumbledore),
                    size = 20, FontWeight.Medium)
            }
            SpacerVertical(height = 8)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                CategoryCard(title = stringResource(R.string.fantasy), modifier = Modifier)
                SpacerHorizontal(width = 4)
                CategoryCard(title = stringResource(R.string.adventure), modifier = Modifier)
            }
            SpacerVertical(height = 8)
             LazyRawCharacter()
            SpacerVertical(height = 8)
            Row(Modifier.padding(horizontal = 16.dp)) {
                TextInfo(
                    text = stringResource(R.string.description),
                    14, FontWeight.Normal)
            }
            Spacer(modifier = Modifier.weight(1f))
            ButtonWithIcon(
                iconResId = R.drawable.booking,
                text = stringResource(R.string.booking),
                navController = navController)
            SpacerVertical(height = 8)
        }
    }
}

@Composable
fun LazyRawCharacter(
    viewModel: CharacterViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    LazyRawContent(state = state)
}

@Composable
private fun LazyRawContent(
    state: CharactersUiState
) {
    LazyRow(horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(state.characters) {
            CharactersItem(state = it)
        }
    }
}

@Composable
fun CharactersItem(state: CharacterUiState) {
    Image(
        painter = rememberAsyncImagePainter(model = state.image),
        contentDescription = stringResource(R.string.character),
        modifier = Modifier
            .size(75.dp)
            .clip(CircleShape),
        contentScale = ContentScale.Crop,
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewBookingScreen() {
    BottomCard()
}
