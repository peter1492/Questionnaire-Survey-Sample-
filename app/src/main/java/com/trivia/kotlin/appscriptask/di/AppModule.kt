package com.trivia.kotlin.appscriptask.di

import android.content.Context
import com.trivia.kotlin.appscriptask.database.SummaryDao
import com.trivia.kotlin.appscriptask.database.SummaryDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): SummaryDatabase {
        //return Database object
        return SummaryDatabase.getSummaryDatabase(context)
    }

    @Provides
    fun provideSummaryDao(db: SummaryDatabase): SummaryDao {
        //return database data access object
        return db.getSummaryDao()
    }

}