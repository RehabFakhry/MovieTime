package com.the_Chance.movietime.state

data class TimesUiState(
    val time: List<TimeUiState> = emptyList()
)

data class TimeUiState(
    val time: String,
)