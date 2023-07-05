package com.the_Chance.movietime.state


data class CharactersUiState(
    val character: List<CharacterUiState> = emptyList()
)

data class CharacterUiState(
    val name: String,
    val imageUrl: String,
)
