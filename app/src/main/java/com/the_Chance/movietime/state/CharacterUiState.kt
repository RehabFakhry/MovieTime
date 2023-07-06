package com.the_Chance.movietime.state


data class CharactersUiState(
    val characters: List<CharacterUiState> = emptyList()
)

data class CharacterUiState(
    val name: String,
    val image: Int,
)
