package com.the_Chance.movietime.screens

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.the_Chance.movietime.R
import com.the_Chance.movietime.composable.ButtonWithoutIcon
import com.the_Chance.movietime.composable.CategoryCard
import com.the_Chance.movietime.composable.ClockIcon
import com.the_Chance.movietime.composable.CustomIcon
import com.the_Chance.movietime.composable.SpacerHorizontal
import com.the_Chance.movietime.composable.SpacerVertical
import com.the_Chance.movietime.composable.TextInfo
import com.the_Chance.movietime.ui.theme.Orange
import com.the_Chance.movietime.ui.theme.PrimaryTextColor
import com.the_Chance.movietime.ui.theme.SecondaryTextColor
import com.the_Chance.movietime.ui.theme.White60

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 32.dp)
                .padding(horizontal = 32.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            ButtonWithoutIcon(text = stringResource(R.string.now_showing), color = Orange, {})
            SpacerHorizontal(width = 8)
            ButtonWithoutIcon(text = stringResource(R.string.coming_soon),
                color = Orange.copy(alpha = 0.1f), {})
        }

        Spacer(modifier = Modifier.weight(1f))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            ClockIcon(SecondaryTextColor, PrimaryTextColor)
        }
        SpacerVertical(height = 16)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextInfo(
                text = stringResource(R.string.fantastic_beasts_the_secrets_of_dumbledore),
                size = 24,
            )
        }
        SpacerVertical(height = 16)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            CategoryCard(title = stringResource(R.string.fantasy), modifier = Modifier)
            SpacerHorizontal(width = 4)
            CategoryCard(title = stringResource(R.string.adventure), modifier = Modifier)
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp, bottom = 24.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(45.dp)
                    .clip(CircleShape)
                    .background(Orange),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_clapperboard_play),
                    contentDescription = null, tint = White60
                )
            }
            CustomIcon(R.drawable.icon_search)
            CustomIcon(R.drawable.icon_user)
            CustomIcon(R.drawable.icon_user)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHome() {
    HomeScreen()
}
