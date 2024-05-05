// Generated by view binder compiler. Do not edit!
package com.simplemobiletools.smsmessenger.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.simplemobiletools.commons.views.MyTextView;
import com.simplemobiletools.smsmessenger.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ScheduleMessageDialogBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatImageView dateImage;

  @NonNull
  public final MyTextView editDate;

  @NonNull
  public final MyTextView editTime;

  @NonNull
  public final ConstraintLayout scheduledMessageDialogHolder;

  @NonNull
  public final MyTextView subtitle;

  @NonNull
  public final AppCompatImageView timeImage;

  private ScheduleMessageDialogBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatImageView dateImage, @NonNull MyTextView editDate,
      @NonNull MyTextView editTime, @NonNull ConstraintLayout scheduledMessageDialogHolder,
      @NonNull MyTextView subtitle, @NonNull AppCompatImageView timeImage) {
    this.rootView = rootView;
    this.dateImage = dateImage;
    this.editDate = editDate;
    this.editTime = editTime;
    this.scheduledMessageDialogHolder = scheduledMessageDialogHolder;
    this.subtitle = subtitle;
    this.timeImage = timeImage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ScheduleMessageDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ScheduleMessageDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.schedule_message_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ScheduleMessageDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.date_image;
      AppCompatImageView dateImage = ViewBindings.findChildViewById(rootView, id);
      if (dateImage == null) {
        break missingId;
      }

      id = R.id.edit_date;
      MyTextView editDate = ViewBindings.findChildViewById(rootView, id);
      if (editDate == null) {
        break missingId;
      }

      id = R.id.edit_time;
      MyTextView editTime = ViewBindings.findChildViewById(rootView, id);
      if (editTime == null) {
        break missingId;
      }

      ConstraintLayout scheduledMessageDialogHolder = (ConstraintLayout) rootView;

      id = R.id.subtitle;
      MyTextView subtitle = ViewBindings.findChildViewById(rootView, id);
      if (subtitle == null) {
        break missingId;
      }

      id = R.id.time_image;
      AppCompatImageView timeImage = ViewBindings.findChildViewById(rootView, id);
      if (timeImage == null) {
        break missingId;
      }

      return new ScheduleMessageDialogBinding((ConstraintLayout) rootView, dateImage, editDate,
          editTime, scheduledMessageDialogHolder, subtitle, timeImage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}