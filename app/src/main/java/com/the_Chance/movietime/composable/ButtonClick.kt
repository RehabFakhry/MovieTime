package com.the_Chance.movietime.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pancake.movietime.R
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
                contentDescription = null
            )
            SpacerHorizontal(8)
            Text(
                text = text,
            )
        }
    }
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