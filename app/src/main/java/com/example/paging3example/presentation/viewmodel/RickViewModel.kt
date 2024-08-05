package com.example.paging3example.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import com.example.paging3example.data.repository.RickRepository
import com.example.paging3example.presentation.model.CharacterModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class RickViewModel @Inject constructor(rickRepository: RickRepository) : ViewModel() {

    val characters: Flow<PagingData<CharacterModel>> = rickRepository.getAllCharacters()

}