package com.trivia.kotlin.appscriptask.view_models

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.trivia.kotlin.appscriptask.modal.Summary
import com.trivia.kotlin.appscriptask.repository.GameOverRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject



//ViewModel for GameOverFragment Responsible for saving the data in db
@HiltViewModel
class GameOverViewModel @Inject constructor(
    private val repository: GameOverRepository
):ViewModel() {

    fun insertSummaryData(summary: Summary?){
        viewModelScope.launch {
            if (summary != null){
                repository.insertSummaryIntoTable(summary)
            }
        }
    }
}