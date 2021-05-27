package com.trivia.kotlin.appscriptask.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/trivia/kotlin/appscriptask/adapter/HistoryAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/trivia/kotlin/appscriptask/modal/Summary;", "Lcom/trivia/kotlin/appscriptask/adapter/HistoryAdapter$SummaryViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SummaryViewHolder", "app_debug"})
public final class HistoryAdapter extends androidx.recyclerview.widget.ListAdapter<com.trivia.kotlin.appscriptask.modal.Summary, com.trivia.kotlin.appscriptask.adapter.HistoryAdapter.SummaryViewHolder> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.trivia.kotlin.appscriptask.adapter.HistoryAdapter.SummaryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.trivia.kotlin.appscriptask.adapter.HistoryAdapter.SummaryViewHolder holder, int position) {
    }
    
    public HistoryAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/trivia/kotlin/appscriptask/adapter/HistoryAdapter$SummaryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "historyItemBinding", "Lcom/trivia/kotlin/appscriptask/databinding/HistoryItemBinding;", "(Lcom/trivia/kotlin/appscriptask/databinding/HistoryItemBinding;)V", "bind", "", "summary", "Lcom/trivia/kotlin/appscriptask/modal/Summary;", "position", "", "app_debug"})
    public static final class SummaryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.trivia.kotlin.appscriptask.databinding.HistoryItemBinding historyItemBinding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.trivia.kotlin.appscriptask.modal.Summary summary, int position) {
        }
        
        public SummaryViewHolder(@org.jetbrains.annotations.NotNull()
        com.trivia.kotlin.appscriptask.databinding.HistoryItemBinding historyItemBinding) {
            super(null);
        }
    }
}