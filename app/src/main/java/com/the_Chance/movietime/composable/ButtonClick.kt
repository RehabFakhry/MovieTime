package com.the_Chance.movietime.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.the_Chance.movietime.R
import com.the_Chance.movietime.ui.theme.Orange

@Composable
fun ButtonWithIcon(
    iconResId: Int,
    text: String,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        modifier = Modifier.wrapContentSize(),
        colors = ButtonDefaults.buttonColors(Orange),
        ) {
        Row( modifier = Modifier.padding(vertical = 4.dp)
        ) {
            Icon(
                painter = painterResource(id = iconResId),
                contentDescription = null, tint = Color.White
            )
            SpacerHorizontal(8)
            Text(
                text = text,
                color = Color.White
            )
        }
    }
}

@Composable
fun ButtonWithoutIcon(
    text: String,
    color: Color,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        modifier = Modifier.wrapContentSize(),
        colors = ButtonDefaults.buttonColors(Orange),
    ) {
        Text(
            text = text,
            color = Color.White
        )
    }
}

@Composable
fun CustomIcon(
    iconResId: Int
){
    Icon(painter = painterResource(id = iconResId), contentDescription = null)
}

@Preview
@Composable
fun ButtonWithIconPreview() {
    ButtonWithIcon(
        iconResId = R.drawable.booking,
        text = "Booking",
        onClick = {}
    )
}