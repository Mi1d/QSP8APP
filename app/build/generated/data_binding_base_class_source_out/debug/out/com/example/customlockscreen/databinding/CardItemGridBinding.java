// Generated by data binding compiler. Do not edit!
package com.example.customlockscreen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.customlockscreen.R;
import com.example.customlockscreen.model.bean.Label;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class CardItemGridBinding extends ViewDataBinding {
  @NonNull
  public final TextView labelDate;

  @NonNull
  public final TextView labelDay;

  @NonNull
  public final TextView labelText;

  @Bindable
  protected Label mLabel;

  protected CardItemGridBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView labelDate, TextView labelDay, TextView labelText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.labelDate = labelDate;
    this.labelDay = labelDay;
    this.labelText = labelText;
  }

  public abstract void setLabel(@Nullable Label label);

  @Nullable
  public Label getLabel() {
    return mLabel;
  }

  @NonNull
  public static CardItemGridBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.card_item_grid, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CardItemGridBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CardItemGridBinding>inflateInternal(inflater, R.layout.card_item_grid, root, attachToRoot, component);
  }

  @NonNull
  public static CardItemGridBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.card_item_grid, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CardItemGridBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CardItemGridBinding>inflateInternal(inflater, R.layout.card_item_grid, null, false, component);
  }

  public static CardItemGridBinding bind(@NonNull View view) {
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
  public static CardItemGridBinding bind(@NonNull View view, @Nullable Object component) {
    return (CardItemGridBinding)bind(component, view, R.layout.card_item_grid);
  }
}
