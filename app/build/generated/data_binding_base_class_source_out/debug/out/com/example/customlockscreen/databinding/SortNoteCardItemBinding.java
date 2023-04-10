// Generated by data binding compiler. Do not edit!
package com.example.customlockscreen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.customlockscreen.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class SortNoteCardItemBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout cardSortNoteLayout;

  @NonNull
  public final ImageView sortIcon;

  @NonNull
  public final TextView sortTx;

  protected SortNoteCardItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RelativeLayout cardSortNoteLayout, ImageView sortIcon, TextView sortTx) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardSortNoteLayout = cardSortNoteLayout;
    this.sortIcon = sortIcon;
    this.sortTx = sortTx;
  }

  @NonNull
  public static SortNoteCardItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.sort_note_card_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SortNoteCardItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SortNoteCardItemBinding>inflateInternal(inflater, R.layout.sort_note_card_item, root, attachToRoot, component);
  }

  @NonNull
  public static SortNoteCardItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.sort_note_card_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SortNoteCardItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SortNoteCardItemBinding>inflateInternal(inflater, R.layout.sort_note_card_item, null, false, component);
  }

  public static SortNoteCardItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static SortNoteCardItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (SortNoteCardItemBinding)bind(component, view, R.layout.sort_note_card_item);
  }
}
