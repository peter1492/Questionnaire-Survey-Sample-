package com.trivia.kotlin.appscriptask.repository

import com.trivia.kotlin.appscriptask.database.SummaryDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HistoryRepository @Inject constructor(
    private val summaryDao: SummaryDao
) {

    fun getAllSummaryData() = summaryDao.getAllSummary() // get history
}