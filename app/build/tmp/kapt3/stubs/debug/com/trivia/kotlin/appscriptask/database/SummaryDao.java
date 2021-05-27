package com.trivia.kotlin.appscriptask.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/trivia/kotlin/appscriptask/database/SummaryDao;", "", "getAllSummary", "Landroidx/lifecycle/LiveData;", "", "Lcom/trivia/kotlin/appscriptask/modal/Summary;", "insertSummary", "", "summary", "(Lcom/trivia/kotlin/appscriptask/modal/Summary;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSummary", "app_debug"})
public abstract interface SummaryDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertSummary(@org.jetbrains.annotations.NotNull()
    com.trivia.kotlin.appscriptask.modal.Summary summary, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from summary_table order by startDate")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.trivia.kotlin.appscriptask.modal.Summary>> getAllSummary();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object updateSummary(@org.jetbrains.annotations.NotNull()
    com.trivia.kotlin.appscriptask.modal.Summary summary, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}