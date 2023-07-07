package com.the_Chance.movietime.state

data class CalendersUiState(
    val calender: List<CalenderUiState> = emptyList()
)

data class CalenderUiState(
    val number: Int,
    val day: String,
)