package com.the_Chance.movietime.composable

import android.text.Layout.Alignment
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.the_Chance.movietime.ui.theme.PrimaryTextColor

@Composable
fun TextInfo(
    text:String,
    size: Int,
    weight: FontWeight
) {
    Text(
        text = text,
        fontWeight = weight,
        fontSize = size.sp,
        color = PrimaryTextColor,
        textAlign = TextAlign.Center
    )
}

@Composable
fun TextCalender(
    text:Int,
    size: Int,
) {
    Text(
        text = text.toString(),
        fontWeight = FontWeight.Normal,
        fontSize = size.sp,
        color = PrimaryTextColor
    )
}

@Composable
fun TextTitle(
    title:String,
    size: Int,
    color: Color
){
    Text(
        text = title,
        fontWeight = FontWeight.Normal,
        fontSize = size.sp,
        color = color
    )
}

