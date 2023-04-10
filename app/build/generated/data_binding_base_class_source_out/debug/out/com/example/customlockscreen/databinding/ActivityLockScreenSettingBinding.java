// Generated by data binding compiler. Do not edit!
package com.example.customlockscreen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.customlockscreen.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLockScreenSettingBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout lockScreenSettingLabelListLayout;

  @NonNull
  public final RecyclerView lockScreenSettingRecyclerview;

  @NonNull
  public final Toolbar lockScreenSettingToolbar;

  protected ActivityLockScreenSettingBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RelativeLayout lockScreenSettingLabelListLayout,
      RecyclerView lockScreenSettingRecyclerview, Toolbar lockScreenSettingToolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.lockScreenSettingLabelListLayout = lockScreenSettingLabelListLayout;
    this.lockScreenSettingRecyclerview = lockScreenSettingRecyclerview;
    this.lockScreenSettingToolbar = lockScreenSettingToolbar;
  }

  @NonNull
  public static ActivityLockScreenSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_lock_screen_setting, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLockScreenSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLockScreenSettingBinding>inflateInternal(inflater, R.layout.activity_lock_screen_setting, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLockScreenSettingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_lock_screen_setting, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLockScreenSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLockScreenSettingBinding>inflateInternal(inflater, R.layout.activity_lock_screen_setting, null, false, component);
  }

  public static ActivityLockScreenSettingBinding bind(@NonNull View view) {
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
  public static ActivityLockScreenSettingBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityLockScreenSettingBinding)bind(component, view, R.layout.activity_lock_screen_setting);
  }
}