package com.the_Chance.movietime.viewModel

import androidx.lifecycle.ViewModel
import com.the_Chance.movietime.R
import com.the_Chance.movietime.state.CharacterUiState
import com.the_Chance.movietime.state.CharactersUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

@HiltViewModel
class CharacterViewModel: ViewModel() {
    private val _state = MutableStateFlow(CharactersUiState())
    val state = _state.asStateFlow()

    init {
        getAllCharacters()
    }

    private fun getAllCharacters(){
        _state.update { it.copy(
            characters = listOf(
                CharacterUiState("Harry Potter", R.drawable.harry_potter),
                CharacterUiState("Emma Watson",  R.drawable.emma_watson),
                CharacterUiState("RON BILIUS WEASLEY", R.drawable.ron_bilius),
                CharacterUiState("Tom Cruise", R.drawable.tom_cruise),
                CharacterUiState("Tom Hanks", R.drawable.tom_hanks),
                CharacterUiState("Angelina Jolie ", R.drawable.anglina_jolie),
                CharacterUiState("Cat", R.drawable.cat)
            )
        ) }
    }
}
