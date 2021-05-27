package com.trivia.kotlin.appscriptask.view_models;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/trivia/kotlin/appscriptask/view_models/GameOverViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/trivia/kotlin/appscriptask/repository/GameOverRepository;", "(Lcom/trivia/kotlin/appscriptask/repository/GameOverRepository;)V", "insertSummaryData", "", "summary", "Lcom/trivia/kotlin/appscriptask/modal/Summary;", "app_debug"})
public final class GameOverViewModel extends androidx.lifecycle.ViewModel {
    private final com.trivia.kotlin.appscriptask.repository.GameOverRepository repository = null;
    
    public final void insertSummaryData(@org.jetbrains.annotations.Nullable()
    com.trivia.kotlin.appscriptask.modal.Summary summary) {
    }
    
    @javax.inject.Inject()
    public GameOverViewModel(@org.jetbrains.annotations.NotNull()
    com.trivia.kotlin.appscriptask.repository.GameOverRepository repository) {
        super();
    }
}