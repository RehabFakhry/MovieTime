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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.the_Chance.movietime.R
import com.the_Chance.movietime.ui.theme.Orange

@Composable
fun ButtonWithIcon(
    text: String,
    iconResId: Int,
    navController: NavController,
) {
    Button(
        onClick = { val currentRoute = navController.currentBackStackEntry?.destination?.route
            when (currentRoute) {
                "bookingScreen" -> navController.navigate("ticketsScreen")
                "ticketsScreen" -> navController.navigate("homeScreen")
                else -> {
                }
            }},
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
        colors = ButtonDefaults.buttonColors(color),
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
    val navController = rememberNavController()
    ButtonWithIcon(
        text = "Booking",
        iconResId = R.drawable.booking,
        navController = navController
    )
}


//
//@Composable
//fun ButtonBookingScreen(
//    text: String,
//    iconResId: Int,
//    navController: NavController,
//) {
//    Button(
//        onClick = { navController.navigate("ticketsScreen") },
//        modifier = Modifier.wrapContentSize(),
//        colors = ButtonDefaults.buttonColors(Orange),
//    ) {
//        Row(modifier = Modifier.padding(vertical = 4.dp)) {
//            Icon(
//                painter = painterResource(id = iconResId),
//                contentDescription = null,
//                tint = Color.White
//            )
//            SpacerHorizontal(8)
//            Text(
//                text = text,
//                color = Color.White
//            )
//        }
//    }
//}
//
//
//@Composable
//fun ButtonTicketsScreen(
//    text: String,
//    iconResId: Int,
//    navController: NavController,
//) {
//    Button(
//        onClick = { navController.navigate("bookingScreen")},
//        modifier = Modifier.wrapContentSize(),
//        colors = ButtonDefaults.buttonColors(Orange),
//    ) {
//        Row( modifier = Modifier.padding(vertical = 4.dp)
//        ) {
//            Icon(
//                painter = painterResource(id = iconResId),
//                contentDescription = null, tint = Color.White
//            )
//            SpacerHorizontal(8)
//            Text(
//                text = text,
//                color = Color.White
//            )
//        }
//    }
//}