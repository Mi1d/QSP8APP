package com.example.customlockscreen.view.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/customlockscreen/view/activity/SortNoteActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/customlockscreen/adapter/SortNoteAdapter;", "binding", "Lcom/example/customlockscreen/databinding/ActivitySortNoteBinding;", "dataViewModel", "Lcom/example/customlockscreen/viewmodel/DataViewModel;", "list", "", "Lcom/example/customlockscreen/model/bean/SortNote;", "onClickListener", "Lcom/example/customlockscreen/adapter/SortNoteAdapter$ClickListener;", "sortNoteDao", "Lcom/example/customlockscreen/model/db/SortNoteDao;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class SortNoteActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.customlockscreen.databinding.ActivitySortNoteBinding binding;
    private com.example.customlockscreen.adapter.SortNoteAdapter adapter;
    private java.util.List<com.example.customlockscreen.model.bean.SortNote> list;
    private com.example.customlockscreen.adapter.SortNoteAdapter.ClickListener onClickListener;
    private final com.example.customlockscreen.model.db.SortNoteDao sortNoteDao = null;
    private com.example.customlockscreen.viewmodel.DataViewModel dataViewModel;
    
    public SortNoteActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}