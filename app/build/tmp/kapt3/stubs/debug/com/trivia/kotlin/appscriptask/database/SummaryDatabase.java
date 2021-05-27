package com.trivia.kotlin.appscriptask.database;

import java.lang.System;

@androidx.room.Database(entities = {com.trivia.kotlin.appscriptask.modal.Summary.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/trivia/kotlin/appscriptask/database/SummaryDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getSummaryDao", "Lcom/trivia/kotlin/appscriptask/database/SummaryDao;", "Companion", "app_debug"})
public abstract class SummaryDatabase extends androidx.room.RoomDatabase {
    private static volatile com.trivia.kotlin.appscriptask.database.SummaryDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull()
    public static final com.trivia.kotlin.appscriptask.database.SummaryDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.trivia.kotlin.appscriptask.database.SummaryDao getSummaryDao();
    
    public SummaryDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/trivia/kotlin/appscriptask/database/SummaryDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/trivia/kotlin/appscriptask/database/SummaryDatabase;", "getSummaryDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.trivia.kotlin.appscriptask.database.SummaryDatabase getSummaryDatabase(@org.jetbrains.annotations.NotNull()
        @dagger.hilt.android.qualifiers.ApplicationContext()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}