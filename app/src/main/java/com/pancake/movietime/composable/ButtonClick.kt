package com.pancake.movietime.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pancake.movietime.ui.theme.Orange

@Composable
fun ButtonClick(
    text: String,
    onClick: ()-> Unit,
    ){
    Button(
        onClick = onClick ,
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp),
        shape = RoundedCornerShape(32.dp),
        colors = ButtonDefaults.buttonColors(Orange),
    ) {
        Text(
            text = text,
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = FontFamily.Serif
        )
//        Icon(painter = , contentDescription = )
    }
}

@Preview(showBackground = true)
@Composable
fun previewvv(){
    ButtonClick("rrr", {})
}