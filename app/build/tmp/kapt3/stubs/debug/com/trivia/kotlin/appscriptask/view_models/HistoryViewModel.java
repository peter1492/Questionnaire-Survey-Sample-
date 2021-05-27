package com.trivia.kotlin.appscriptask.view_models;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/trivia/kotlin/appscriptask/view_models/HistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "historyRepository", "Lcom/trivia/kotlin/appscriptask/repository/HistoryRepository;", "(Lcom/trivia/kotlin/appscriptask/repository/HistoryRepository;)V", "summaryList", "Landroidx/lifecycle/LiveData;", "", "Lcom/trivia/kotlin/appscriptask/modal/Summary;", "getSummaryList", "()Landroidx/lifecycle/LiveData;", "app_debug"})
public final class HistoryViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.trivia.kotlin.appscriptask.modal.Summary>> summaryList = null;
    private final com.trivia.kotlin.appscriptask.repository.HistoryRepository historyRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.trivia.kotlin.appscriptask.modal.Summary>> getSummaryList() {
        return null;
    }
    
    @javax.inject.Inject()
    public HistoryViewModel(@org.jetbrains.annotations.NotNull()
    com.trivia.kotlin.appscriptask.repository.HistoryRepository historyRepository) {
        super();
    }
}