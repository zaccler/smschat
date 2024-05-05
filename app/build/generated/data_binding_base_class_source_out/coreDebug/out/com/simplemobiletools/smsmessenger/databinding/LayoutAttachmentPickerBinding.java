// Generated by view binder compiler. Do not edit!
package com.simplemobiletools.smsmessenger.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.simplemobiletools.smsmessenger.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutAttachmentPickerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout choosePhoto;

  @NonNull
  public final AppCompatImageView choosePhotoIcon;

  @NonNull
  public final AppCompatTextView choosePhotoText;

  @NonNull
  public final LinearLayout chooseVideo;

  @NonNull
  public final AppCompatImageView chooseVideoIcon;

  @NonNull
  public final AppCompatTextView chooseVideoText;

  @NonNull
  public final LinearLayout pickContact;

  @NonNull
  public final AppCompatImageView pickContactIcon;

  @NonNull
  public final AppCompatTextView pickContactText;

  @NonNull
  public final LinearLayout pickFile;

  @NonNull
  public final AppCompatImageView pickFileIcon;

  @NonNull
  public final AppCompatTextView pickFileText;

  @NonNull
  public final LinearLayout recordAudio;

  @NonNull
  public final AppCompatImageView recordAudioIcon;

  @NonNull
  public final AppCompatTextView recordAudioText;

  @NonNull
  public final LinearLayout recordVideo;

  @NonNull
  public final AppCompatImageView recordVideoIcon;

  @NonNull
  public final AppCompatTextView recordVideoText;

  @NonNull
  public final LinearLayout scheduleMessage;

  @NonNull
  public final AppCompatImageView scheduleMessageIcon;

  @NonNull
  public final AppCompatTextView scheduleMessageText;

  @NonNull
  public final LinearLayout takePhoto;

  @NonNull
  public final AppCompatImageView takePhotoIcon;

  @NonNull
  public final AppCompatTextView takePhotoText;

  private LayoutAttachmentPickerBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout choosePhoto, @NonNull AppCompatImageView choosePhotoIcon,
      @NonNull AppCompatTextView choosePhotoText, @NonNull LinearLayout chooseVideo,
      @NonNull AppCompatImageView chooseVideoIcon, @NonNull AppCompatTextView chooseVideoText,
      @NonNull LinearLayout pickContact, @NonNull AppCompatImageView pickContactIcon,
      @NonNull AppCompatTextView pickContactText, @NonNull LinearLayout pickFile,
      @NonNull AppCompatImageView pickFileIcon, @NonNull AppCompatTextView pickFileText,
      @NonNull LinearLayout recordAudio, @NonNull AppCompatImageView recordAudioIcon,
      @NonNull AppCompatTextView recordAudioText, @NonNull LinearLayout recordVideo,
      @NonNull AppCompatImageView recordVideoIcon, @NonNull AppCompatTextView recordVideoText,
      @NonNull LinearLayout scheduleMessage, @NonNull AppCompatImageView scheduleMessageIcon,
      @NonNull AppCompatTextView scheduleMessageText, @NonNull LinearLayout takePhoto,
      @NonNull AppCompatImageView takePhotoIcon, @NonNull AppCompatTextView takePhotoText) {
    this.rootView = rootView;
    this.choosePhoto = choosePhoto;
    this.choosePhotoIcon = choosePhotoIcon;
    this.choosePhotoText = choosePhotoText;
    this.chooseVideo = chooseVideo;
    this.chooseVideoIcon = chooseVideoIcon;
    this.chooseVideoText = chooseVideoText;
    this.pickContact = pickContact;
    this.pickContactIcon = pickContactIcon;
    this.pickContactText = pickContactText;
    this.pickFile = pickFile;
    this.pickFileIcon = pickFileIcon;
    this.pickFileText = pickFileText;
    this.recordAudio = recordAudio;
    this.recordAudioIcon = recordAudioIcon;
    this.recordAudioText = recordAudioText;
    this.recordVideo = recordVideo;
    this.recordVideoIcon = recordVideoIcon;
    this.recordVideoText = recordVideoText;
    this.scheduleMessage = scheduleMessage;
    this.scheduleMessageIcon = scheduleMessageIcon;
    this.scheduleMessageText = scheduleMessageText;
    this.takePhoto = takePhoto;
    this.takePhotoIcon = takePhotoIcon;
    this.takePhotoText = takePhotoText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutAttachmentPickerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutAttachmentPickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_attachment_picker, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutAttachmentPickerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.choose_photo;
      LinearLayout choosePhoto = ViewBindings.findChildViewById(rootView, id);
      if (choosePhoto == null) {
        break missingId;
      }

      id = R.id.choose_photo_icon;
      AppCompatImageView choosePhotoIcon = ViewBindings.findChildViewById(rootView, id);
      if (choosePhotoIcon == null) {
        break missingId;
      }

      id = R.id.choose_photo_text;
      AppCompatTextView choosePhotoText = ViewBindings.findChildViewById(rootView, id);
      if (choosePhotoText == null) {
        break missingId;
      }

      id = R.id.choose_video;
      LinearLayout chooseVideo = ViewBindings.findChildViewById(rootView, id);
      if (chooseVideo == null) {
        break missingId;
      }

      id = R.id.choose_video_icon;
      AppCompatImageView chooseVideoIcon = ViewBindings.findChildViewById(rootView, id);
      if (chooseVideoIcon == null) {
        break missingId;
      }

      id = R.id.choose_video_text;
      AppCompatTextView chooseVideoText = ViewBindings.findChildViewById(rootView, id);
      if (chooseVideoText == null) {
        break missingId;
      }

      id = R.id.pick_contact;
      LinearLayout pickContact = ViewBindings.findChildViewById(rootView, id);
      if (pickContact == null) {
        break missingId;
      }

      id = R.id.pick_contact_icon;
      AppCompatImageView pickContactIcon = ViewBindings.findChildViewById(rootView, id);
      if (pickContactIcon == null) {
        break missingId;
      }

      id = R.id.pick_contact_text;
      AppCompatTextView pickContactText = ViewBindings.findChildViewById(rootView, id);
      if (pickContactText == null) {
        break missingId;
      }

      id = R.id.pick_file;
      LinearLayout pickFile = ViewBindings.findChildViewById(rootView, id);
      if (pickFile == null) {
        break missingId;
      }

      id = R.id.pick_file_icon;
      AppCompatImageView pickFileIcon = ViewBindings.findChildViewById(rootView, id);
      if (pickFileIcon == null) {
        break missingId;
      }

      id = R.id.pick_file_text;
      AppCompatTextView pickFileText = ViewBindings.findChildViewById(rootView, id);
      if (pickFileText == null) {
        break missingId;
      }

      id = R.id.record_audio;
      LinearLayout recordAudio = ViewBindings.findChildViewById(rootView, id);
      if (recordAudio == null) {
        break missingId;
      }

      id = R.id.record_audio_icon;
      AppCompatImageView recordAudioIcon = ViewBindings.findChildViewById(rootView, id);
      if (recordAudioIcon == null) {
        break missingId;
      }

      id = R.id.record_audio_text;
      AppCompatTextView recordAudioText = ViewBindings.findChildViewById(rootView, id);
      if (recordAudioText == null) {
        break missingId;
      }

      id = R.id.record_video;
      LinearLayout recordVideo = ViewBindings.findChildViewById(rootView, id);
      if (recordVideo == null) {
        break missingId;
      }

      id = R.id.record_video_icon;
      AppCompatImageView recordVideoIcon = ViewBindings.findChildViewById(rootView, id);
      if (recordVideoIcon == null) {
        break missingId;
      }

      id = R.id.record_video_text;
      AppCompatTextView recordVideoText = ViewBindings.findChildViewById(rootView, id);
      if (recordVideoText == null) {
        break missingId;
      }

      id = R.id.schedule_message;
      LinearLayout scheduleMessage = ViewBindings.findChildViewById(rootView, id);
      if (scheduleMessage == null) {
        break missingId;
      }

      id = R.id.schedule_message_icon;
      AppCompatImageView scheduleMessageIcon = ViewBindings.findChildViewById(rootView, id);
      if (scheduleMessageIcon == null) {
        break missingId;
      }

      id = R.id.schedule_message_text;
      AppCompatTextView scheduleMessageText = ViewBindings.findChildViewById(rootView, id);
      if (scheduleMessageText == null) {
        break missingId;
      }

      id = R.id.take_photo;
      LinearLayout takePhoto = ViewBindings.findChildViewById(rootView, id);
      if (takePhoto == null) {
        break missingId;
      }

      id = R.id.take_photo_icon;
      AppCompatImageView takePhotoIcon = ViewBindings.findChildViewById(rootView, id);
      if (takePhotoIcon == null) {
        break missingId;
      }

      id = R.id.take_photo_text;
      AppCompatTextView takePhotoText = ViewBindings.findChildViewById(rootView, id);
      if (takePhotoText == null) {
        break missingId;
      }

      return new LayoutAttachmentPickerBinding((ConstraintLayout) rootView, choosePhoto,
          choosePhotoIcon, choosePhotoText, chooseVideo, chooseVideoIcon, chooseVideoText,
          pickContact, pickContactIcon, pickContactText, pickFile, pickFileIcon, pickFileText,
          recordAudio, recordAudioIcon, recordAudioText, recordVideo, recordVideoIcon,
          recordVideoText, scheduleMessage, scheduleMessageIcon, scheduleMessageText, takePhoto,
          takePhotoIcon, takePhotoText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
