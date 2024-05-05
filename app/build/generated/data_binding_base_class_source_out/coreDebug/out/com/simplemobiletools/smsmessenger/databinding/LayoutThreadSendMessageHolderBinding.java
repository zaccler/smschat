// Generated by view binder compiler. Do not edit!
package com.simplemobiletools.smsmessenger.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.simplemobiletools.commons.views.MyButton;
import com.simplemobiletools.commons.views.MyEditText;
import com.simplemobiletools.commons.views.MyTextView;
import com.simplemobiletools.smsmessenger.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutThreadSendMessageHolderBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LayoutAttachmentPickerBinding attachmentPicker;

  @NonNull
  public final View attachmentPickerDivider;

  @NonNull
  public final ScrollView attachmentPickerHolder;

  @NonNull
  public final ImageView discardScheduledMessage;

  @NonNull
  public final ConstraintLayout messageHolder;

  @NonNull
  public final MyTextView scheduledMessageButton;

  @NonNull
  public final RelativeLayout scheduledMessageHolder;

  @NonNull
  public final ImageView scheduledMessageIcon;

  @NonNull
  public final ImageView threadAddAttachment;

  @NonNull
  public final RecyclerView threadAttachmentsRecyclerview;

  @NonNull
  public final MyTextView threadCharacterCounter;

  @NonNull
  public final ImageView threadSelectSimIcon;

  @NonNull
  public final TextView threadSelectSimNumber;

  @NonNull
  public final MyButton threadSendMessage;

  @NonNull
  public final MyEditText threadTypeMessage;

  private LayoutThreadSendMessageHolderBinding(@NonNull ConstraintLayout rootView,
      @NonNull LayoutAttachmentPickerBinding attachmentPicker,
      @NonNull View attachmentPickerDivider, @NonNull ScrollView attachmentPickerHolder,
      @NonNull ImageView discardScheduledMessage, @NonNull ConstraintLayout messageHolder,
      @NonNull MyTextView scheduledMessageButton, @NonNull RelativeLayout scheduledMessageHolder,
      @NonNull ImageView scheduledMessageIcon, @NonNull ImageView threadAddAttachment,
      @NonNull RecyclerView threadAttachmentsRecyclerview,
      @NonNull MyTextView threadCharacterCounter, @NonNull ImageView threadSelectSimIcon,
      @NonNull TextView threadSelectSimNumber, @NonNull MyButton threadSendMessage,
      @NonNull MyEditText threadTypeMessage) {
    this.rootView = rootView;
    this.attachmentPicker = attachmentPicker;
    this.attachmentPickerDivider = attachmentPickerDivider;
    this.attachmentPickerHolder = attachmentPickerHolder;
    this.discardScheduledMessage = discardScheduledMessage;
    this.messageHolder = messageHolder;
    this.scheduledMessageButton = scheduledMessageButton;
    this.scheduledMessageHolder = scheduledMessageHolder;
    this.scheduledMessageIcon = scheduledMessageIcon;
    this.threadAddAttachment = threadAddAttachment;
    this.threadAttachmentsRecyclerview = threadAttachmentsRecyclerview;
    this.threadCharacterCounter = threadCharacterCounter;
    this.threadSelectSimIcon = threadSelectSimIcon;
    this.threadSelectSimNumber = threadSelectSimNumber;
    this.threadSendMessage = threadSendMessage;
    this.threadTypeMessage = threadTypeMessage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutThreadSendMessageHolderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutThreadSendMessageHolderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_thread_send_message_holder, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutThreadSendMessageHolderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.attachment_picker;
      View attachmentPicker = ViewBindings.findChildViewById(rootView, id);
      if (attachmentPicker == null) {
        break missingId;
      }
      LayoutAttachmentPickerBinding binding_attachmentPicker = LayoutAttachmentPickerBinding.bind(attachmentPicker);

      id = R.id.attachment_picker_divider;
      View attachmentPickerDivider = ViewBindings.findChildViewById(rootView, id);
      if (attachmentPickerDivider == null) {
        break missingId;
      }

      id = R.id.attachment_picker_holder;
      ScrollView attachmentPickerHolder = ViewBindings.findChildViewById(rootView, id);
      if (attachmentPickerHolder == null) {
        break missingId;
      }

      id = R.id.discard_scheduled_message;
      ImageView discardScheduledMessage = ViewBindings.findChildViewById(rootView, id);
      if (discardScheduledMessage == null) {
        break missingId;
      }

      ConstraintLayout messageHolder = (ConstraintLayout) rootView;

      id = R.id.scheduled_message_button;
      MyTextView scheduledMessageButton = ViewBindings.findChildViewById(rootView, id);
      if (scheduledMessageButton == null) {
        break missingId;
      }

      id = R.id.scheduled_message_holder;
      RelativeLayout scheduledMessageHolder = ViewBindings.findChildViewById(rootView, id);
      if (scheduledMessageHolder == null) {
        break missingId;
      }

      id = R.id.scheduled_message_icon;
      ImageView scheduledMessageIcon = ViewBindings.findChildViewById(rootView, id);
      if (scheduledMessageIcon == null) {
        break missingId;
      }

      id = R.id.thread_add_attachment;
      ImageView threadAddAttachment = ViewBindings.findChildViewById(rootView, id);
      if (threadAddAttachment == null) {
        break missingId;
      }

      id = R.id.thread_attachments_recyclerview;
      RecyclerView threadAttachmentsRecyclerview = ViewBindings.findChildViewById(rootView, id);
      if (threadAttachmentsRecyclerview == null) {
        break missingId;
      }

      id = R.id.thread_character_counter;
      MyTextView threadCharacterCounter = ViewBindings.findChildViewById(rootView, id);
      if (threadCharacterCounter == null) {
        break missingId;
      }

      id = R.id.thread_select_sim_icon;
      ImageView threadSelectSimIcon = ViewBindings.findChildViewById(rootView, id);
      if (threadSelectSimIcon == null) {
        break missingId;
      }

      id = R.id.thread_select_sim_number;
      TextView threadSelectSimNumber = ViewBindings.findChildViewById(rootView, id);
      if (threadSelectSimNumber == null) {
        break missingId;
      }

      id = R.id.thread_send_message;
      MyButton threadSendMessage = ViewBindings.findChildViewById(rootView, id);
      if (threadSendMessage == null) {
        break missingId;
      }

      id = R.id.thread_type_message;
      MyEditText threadTypeMessage = ViewBindings.findChildViewById(rootView, id);
      if (threadTypeMessage == null) {
        break missingId;
      }

      return new LayoutThreadSendMessageHolderBinding((ConstraintLayout) rootView,
          binding_attachmentPicker, attachmentPickerDivider, attachmentPickerHolder,
          discardScheduledMessage, messageHolder, scheduledMessageButton, scheduledMessageHolder,
          scheduledMessageIcon, threadAddAttachment, threadAttachmentsRecyclerview,
          threadCharacterCounter, threadSelectSimIcon, threadSelectSimNumber, threadSendMessage,
          threadTypeMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}