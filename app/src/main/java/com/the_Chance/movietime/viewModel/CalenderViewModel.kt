package com.the_Chance.movietime.viewModel

import androidx.lifecycle.ViewModel
import com.the_Chance.movietime.state.CalenderUiState
import com.the_Chance.movietime.state.CalendersUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CalenderViewModel:ViewModel() {
    private val _state = MutableStateFlow(CalendersUiState())
    val state = _state.asStateFlow()

    init {
        getAllCalenders()
    }

    private fun getAllCalenders(){
        _state.update { it.copy(
            calender = listOf(
                CalenderUiState(14, "Thu"),
                CalenderUiState(15, "Fri"),
                CalenderUiState(16, "Sat"),
                CalenderUiState(17, "Sun"),
                CalenderUiState(18, "Mon"),
                CalenderUiState(19, "Tues"),
                CalenderUiState(20, "Wedn"),
                CalenderUiState(21, "Thu"),
                CalenderUiState(22, "Fri"),
                CalenderUiState(23, "Sat"),
                CalenderUiState(24, "Sun"),
                )
        ) }
    }
}