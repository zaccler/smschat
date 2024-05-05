// Generated by view binder compiler. Do not edit!
package com.simplemobiletools.smsmessenger.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.simplemobiletools.commons.views.MyAppCompatCheckbox;
import com.simplemobiletools.commons.views.MyTextInputLayout;
import com.simplemobiletools.smsmessenger.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogExportMessagesBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextInputEditText exportMessagesFilename;

  @NonNull
  public final MyTextInputLayout exportMessagesFilenameHint;

  @NonNull
  public final LinearLayout exportMessagesHolder;

  @NonNull
  public final ScrollView exportMessagesScrollview;

  @NonNull
  public final MyAppCompatCheckbox exportMmsCheckbox;

  @NonNull
  public final MyAppCompatCheckbox exportSmsCheckbox;

  private DialogExportMessagesBinding(@NonNull ScrollView rootView,
      @NonNull TextInputEditText exportMessagesFilename,
      @NonNull MyTextInputLayout exportMessagesFilenameHint,
      @NonNull LinearLayout exportMessagesHolder, @NonNull ScrollView exportMessagesScrollview,
      @NonNull MyAppCompatCheckbox exportMmsCheckbox,
      @NonNull MyAppCompatCheckbox exportSmsCheckbox) {
    this.rootView = rootView;
    this.exportMessagesFilename = exportMessagesFilename;
    this.exportMessagesFilenameHint = exportMessagesFilenameHint;
    this.exportMessagesHolder = exportMessagesHolder;
    this.exportMessagesScrollview = exportMessagesScrollview;
    this.exportMmsCheckbox = exportMmsCheckbox;
    this.exportSmsCheckbox = exportSmsCheckbox;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogExportMessagesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogExportMessagesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_export_messages, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogExportMessagesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.export_messages_filename;
      TextInputEditText exportMessagesFilename = ViewBindings.findChildViewById(rootView, id);
      if (exportMessagesFilename == null) {
        break missingId;
      }

      id = R.id.export_messages_filename_hint;
      MyTextInputLayout exportMessagesFilenameHint = ViewBindings.findChildViewById(rootView, id);
      if (exportMessagesFilenameHint == null) {
        break missingId;
      }

      id = R.id.export_messages_holder;
      LinearLayout exportMessagesHolder = ViewBindings.findChildViewById(rootView, id);
      if (exportMessagesHolder == null) {
        break missingId;
      }

      ScrollView exportMessagesScrollview = (ScrollView) rootView;

      id = R.id.export_mms_checkbox;
      MyAppCompatCheckbox exportMmsCheckbox = ViewBindings.findChildViewById(rootView, id);
      if (exportMmsCheckbox == null) {
        break missingId;
      }

      id = R.id.export_sms_checkbox;
      MyAppCompatCheckbox exportSmsCheckbox = ViewBindings.findChildViewById(rootView, id);
      if (exportSmsCheckbox == null) {
        break missingId;
      }

      return new DialogExportMessagesBinding((ScrollView) rootView, exportMessagesFilename,
          exportMessagesFilenameHint, exportMessagesHolder, exportMessagesScrollview,
          exportMmsCheckbox, exportSmsCheckbox);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
