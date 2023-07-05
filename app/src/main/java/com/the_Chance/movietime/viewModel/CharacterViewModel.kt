package com.the_Chance.movietime.viewModel

import androidx.lifecycle.ViewModel
import com.the_Chance.movietime.state.CharacterUiState
import com.the_Chance.movietime.state.CharactersUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

//@HiltViewModel
//class CharacterViewModel: ViewModel() {
//    private val _state = MutableStateFlow(CharactersUiState())
//    val state = _state.asStateFlow()
//
//    init {
//        getAllCharacters()
//    }
//
//    private fun getAllCharacters(){
//        _state.update { it.copy(
//            character = listOf(
//                CharacterUiState("Harry Potter", "https://coppellstudentmedia.com/wp-content/uploads/2012/01/Daniel-Radcliffe-900x616.jpg"),
//                CharacterUiState("Emma Watson",  "https://api.time.com/wp-content/uploads/2014/07/emma-watson.jpg"),
//                CharacterUiState("RON BILIUS WEASLEY", "https://i.quotev.com/cb6x6mhnaaaa.jpg"),
//                CharacterUiState("Tom Cruise", "https://flxt.tmsimg.com/assets/378_v9_be.jpg"),
//                CharacterUiState("Tom Hanks", "https://people.com/thmb/VhY3kcy268Af3D1JPS4BilhLYGI=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc():focal(749x0:751x2)/tom-hanks-pre-grammy-gala-051023-1-ab2497f7246443a4824efe90dda4ee40.jpg"),
//                CharacterUiState("Angelina Jolie ", "https://assets.ayobandung.com/crop/56x366:719x956/750x500/webp/photo/2023/03/26/Angelina-Jolie-3647229494.png"),
//                CharacterUiState("Cat", "https://cdn-prd.content.metamorphosis.com/wp-content/uploads/sites/6/2022/12/shutterstock_781327003-1.jpg")
//            )
//        ) }
//    }
//}
