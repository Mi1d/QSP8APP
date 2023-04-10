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

public abstract class FragmentSettingBinding extends ViewDataBinding {
  @NonNull
  public final ImageView backupDataIcon;

  @NonNull
  public final TextView backupDataTx;

  @NonNull
  public final ImageView clockIcon;

  @NonNull
  public final TextView clockTx;

  @NonNull
  public final ImageView darkThemeIcon;

  @NonNull
  public final TextView darkThemeStyle;

  @NonNull
  public final TextView darkThemeTx;

  @NonNull
  public final ImageView setLockScreenIcon;

  @NonNull
  public final RelativeLayout setLockScreenLayout;

  @NonNull
  public final TextView setLockScreenTx;

  @NonNull
  public final RelativeLayout settingBackupDataLayout;

  @NonNull
  public final RelativeLayout settingClockLayout;

  @NonNull
  public final RelativeLayout settingDarkThemeLayout;

  @NonNull
  public final RelativeLayout settingSortLayout;

  @NonNull
  public final ImageView sortIcon;

  @NonNull
  public final TextView sortStyle;

  @NonNull
  public final TextView sortTx;

  protected FragmentSettingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView backupDataIcon, TextView backupDataTx, ImageView clockIcon, TextView clockTx,
      ImageView darkThemeIcon, TextView darkThemeStyle, TextView darkThemeTx,
      ImageView setLockScreenIcon, RelativeLayout setLockScreenLayout, TextView setLockScreenTx,
      RelativeLayout settingBackupDataLayout, RelativeLayout settingClockLayout,
      RelativeLayout settingDarkThemeLayout, RelativeLayout settingSortLayout, ImageView sortIcon,
      TextView sortStyle, TextView sortTx) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backupDataIcon = backupDataIcon;
    this.backupDataTx = backupDataTx;
    this.clockIcon = clockIcon;
    this.clockTx = clockTx;
    this.darkThemeIcon = darkThemeIcon;
    this.darkThemeStyle = darkThemeStyle;
    this.darkThemeTx = darkThemeTx;
    this.setLockScreenIcon = setLockScreenIcon;
    this.setLockScreenLayout = setLockScreenLayout;
    this.setLockScreenTx = setLockScreenTx;
    this.settingBackupDataLayout = settingBackupDataLayout;
    this.settingClockLayout = settingClockLayout;
    this.settingDarkThemeLayout = settingDarkThemeLayout;
    this.settingSortLayout = settingSortLayout;
    this.sortIcon = sortIcon;
    this.sortStyle = sortStyle;
    this.sortTx = sortTx;
  }

  @NonNull
  public static FragmentSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_setting, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSettingBinding>inflateInternal(inflater, R.layout.fragment_setting, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSettingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_setting, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSettingBinding>inflateInternal(inflater, R.layout.fragment_setting, null, false, component);
  }

  public static FragmentSettingBinding bind(@NonNull View view) {
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
  public static FragmentSettingBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSettingBinding)bind(component, view, R.layout.fragment_setting);
  }
}
