// Generated by data binding compiler. Do not edit!
package com.example.customlockscreen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.customlockscreen.R;
import com.example.customlockscreen.viewmodel.LabelViewModel;
import com.google.android.material.card.MaterialCardView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class NoteAttributeLayoutBinding extends ViewDataBinding {
  @NonNull
  public final MaterialCardView addNoteCard;

  @NonNull
  public final TextView addNoteDate;

  @NonNull
  public final EditText addNoteEt;

  @NonNull
  public final LinearLayout chooseSortNoteLayout;

  @NonNull
  public final TextView chooseSortTv;

  @NonNull
  public final LinearLayout contentLayout;

  @NonNull
  public final MaterialCardView endTimeCard;

  @NonNull
  public final TextView endTimeDate;

  @NonNull
  public final LinearLayout endTimeDateLayout;

  @NonNull
  public final ImageView endTimeIv;

  @NonNull
  public final RelativeLayout endTimeLayout;

  @NonNull
  public final SwitchCompat endTimeSwitch;

  @NonNull
  public final TextView endTimeText;

  @NonNull
  public final ImageView sortIv;

  @NonNull
  public final TextView sortText;

  @NonNull
  public final ImageView toTopIv;

  @NonNull
  public final SwitchCompat toTopSwitch;

  @Bindable
  protected LabelViewModel mViewmodelchild;

  protected NoteAttributeLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialCardView addNoteCard, TextView addNoteDate, EditText addNoteEt,
      LinearLayout chooseSortNoteLayout, TextView chooseSortTv, LinearLayout contentLayout,
      MaterialCardView endTimeCard, TextView endTimeDate, LinearLayout endTimeDateLayout,
      ImageView endTimeIv, RelativeLayout endTimeLayout, SwitchCompat endTimeSwitch,
      TextView endTimeText, ImageView sortIv, TextView sortText, ImageView toTopIv,
      SwitchCompat toTopSwitch) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addNoteCard = addNoteCard;
    this.addNoteDate = addNoteDate;
    this.addNoteEt = addNoteEt;
    this.chooseSortNoteLayout = chooseSortNoteLayout;
    this.chooseSortTv = chooseSortTv;
    this.contentLayout = contentLayout;
    this.endTimeCard = endTimeCard;
    this.endTimeDate = endTimeDate;
    this.endTimeDateLayout = endTimeDateLayout;
    this.endTimeIv = endTimeIv;
    this.endTimeLayout = endTimeLayout;
    this.endTimeSwitch = endTimeSwitch;
    this.endTimeText = endTimeText;
    this.sortIv = sortIv;
    this.sortText = sortText;
    this.toTopIv = toTopIv;
    this.toTopSwitch = toTopSwitch;
  }

  public abstract void setViewmodelchild(@Nullable LabelViewModel viewmodelchild);

  @Nullable
  public LabelViewModel getViewmodelchild() {
    return mViewmodelchild;
  }

  @NonNull
  public static NoteAttributeLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.note_attribute_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static NoteAttributeLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<NoteAttributeLayoutBinding>inflateInternal(inflater, R.layout.note_attribute_layout, root, attachToRoot, component);
  }

  @NonNull
  public static NoteAttributeLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.note_attribute_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static NoteAttributeLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<NoteAttributeLayoutBinding>inflateInternal(inflater, R.layout.note_attribute_layout, null, false, component);
  }

  public static NoteAttributeLayoutBinding bind(@NonNull View view) {
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
  public static NoteAttributeLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (NoteAttributeLayoutBinding)bind(component, view, R.layout.note_attribute_layout);
  }
}
