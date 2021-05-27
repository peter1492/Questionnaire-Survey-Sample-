package com.trivia.kotlin.appscriptask.repository

import com.trivia.kotlin.appscriptask.database.SummaryDao
import com.trivia.kotlin.appscriptask.modal.Summary
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GameOverRepository @Inject constructor(
    private val summaryDao: SummaryDao
){
    suspend fun insertSummaryIntoTable(summary: Summary){
        summaryDao.insertSummary(summary) //insert the question answers with name
    }
}