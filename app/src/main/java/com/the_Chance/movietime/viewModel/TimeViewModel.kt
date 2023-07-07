package com.the_Chance.movietime.viewModel

import androidx.lifecycle.ViewModel
import com.the_Chance.movietime.state.TimeUiState
import com.the_Chance.movietime.state.TimesUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class TimeViewModel: ViewModel() {
    private val _state = MutableStateFlow(TimesUiState())
    val state = _state.asStateFlow()

    init {
        getAllCalenders()
    }

    private fun getAllCalenders(){
        _state.update { it.copy(
            time = listOf(
                TimeUiState("10.00"),
                TimeUiState("12.30"),
                TimeUiState("15.30"),
                TimeUiState("18.30"),
                TimeUiState("21.30"),
                TimeUiState("23.30"),
                TimeUiState("01.30"),
                )
        ) }
    }
}