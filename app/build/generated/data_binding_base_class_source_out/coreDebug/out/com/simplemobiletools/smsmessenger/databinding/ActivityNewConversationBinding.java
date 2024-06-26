// Generated by view binder compiler. Do not edit!
package com.simplemobiletools.smsmessenger.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.MaterialToolbar;
import com.reddit.indicatorfastscroll.FastScrollerThumbView;
import com.reddit.indicatorfastscroll.FastScrollerView;
import com.simplemobiletools.commons.views.MyEditText;
import com.simplemobiletools.commons.views.MyRecyclerView;
import com.simplemobiletools.commons.views.MyTextView;
import com.simplemobiletools.smsmessenger.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNewConversationBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final ImageView addContactDivider;

  @NonNull
  public final FastScrollerView contactsLetterFastscroller;

  @NonNull
  public final FastScrollerThumbView contactsLetterFastscrollerThumb;

  @NonNull
  public final MyRecyclerView contactsList;

  @NonNull
  public final MyEditText newConversationAddress;

  @NonNull
  public final ImageView newConversationConfirm;

  @NonNull
  public final CoordinatorLayout newConversationCoordinator;

  @NonNull
  public final RelativeLayout newConversationHolder;

  @NonNull
  public final MaterialToolbar newConversationToolbar;

  @NonNull
  public final MyTextView noContactsPlaceholder;

  @NonNull
  public final MyTextView noContactsPlaceholder2;

  @NonNull
  public final LinearLayout suggestionsHolder;

  @NonNull
  public final MyTextView suggestionsLabel;

  @NonNull
  public final HorizontalScrollView suggestionsScrollview;

  private ActivityNewConversationBinding(@NonNull CoordinatorLayout rootView,
      @NonNull ImageView addContactDivider, @NonNull FastScrollerView contactsLetterFastscroller,
      @NonNull FastScrollerThumbView contactsLetterFastscrollerThumb,
      @NonNull MyRecyclerView contactsList, @NonNull MyEditText newConversationAddress,
      @NonNull ImageView newConversationConfirm,
      @NonNull CoordinatorLayout newConversationCoordinator,
      @NonNull RelativeLayout newConversationHolder,
      @NonNull MaterialToolbar newConversationToolbar, @NonNull MyTextView noContactsPlaceholder,
      @NonNull MyTextView noContactsPlaceholder2, @NonNull LinearLayout suggestionsHolder,
      @NonNull MyTextView suggestionsLabel, @NonNull HorizontalScrollView suggestionsScrollview) {
    this.rootView = rootView;
    this.addContactDivider = addContactDivider;
    this.contactsLetterFastscroller = contactsLetterFastscroller;
    this.contactsLetterFastscrollerThumb = contactsLetterFastscrollerThumb;
    this.contactsList = contactsList;
    this.newConversationAddress = newConversationAddress;
    this.newConversationConfirm = newConversationConfirm;
    this.newConversationCoordinator = newConversationCoordinator;
    this.newConversationHolder = newConversationHolder;
    this.newConversationToolbar = newConversationToolbar;
    this.noContactsPlaceholder = noContactsPlaceholder;
    this.noContactsPlaceholder2 = noContactsPlaceholder2;
    this.suggestionsHolder = suggestionsHolder;
    this.suggestionsLabel = suggestionsLabel;
    this.suggestionsScrollview = suggestionsScrollview;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNewConversationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNewConversationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_new_conversation, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNewConversationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_contact_divider;
      ImageView addContactDivider = ViewBindings.findChildViewById(rootView, id);
      if (addContactDivider == null) {
        break missingId;
      }

      id = R.id.contacts_letter_fastscroller;
      FastScrollerView contactsLetterFastscroller = ViewBindings.findChildViewById(rootView, id);
      if (contactsLetterFastscroller == null) {
        break missingId;
      }

      id = R.id.contacts_letter_fastscroller_thumb;
      FastScrollerThumbView contactsLetterFastscrollerThumb = ViewBindings.findChildViewById(rootView, id);
      if (contactsLetterFastscrollerThumb == null) {
        break missingId;
      }

      id = R.id.contacts_list;
      MyRecyclerView contactsList = ViewBindings.findChildViewById(rootView, id);
      if (contactsList == null) {
        break missingId;
      }

      id = R.id.new_conversation_address;
      MyEditText newConversationAddress = ViewBindings.findChildViewById(rootView, id);
      if (newConversationAddress == null) {
        break missingId;
      }

      id = R.id.new_conversation_confirm;
      ImageView newConversationConfirm = ViewBindings.findChildViewById(rootView, id);
      if (newConversationConfirm == null) {
        break missingId;
      }

      CoordinatorLayout newConversationCoordinator = (CoordinatorLayout) rootView;

      id = R.id.new_conversation_holder;
      RelativeLayout newConversationHolder = ViewBindings.findChildViewById(rootView, id);
      if (newConversationHolder == null) {
        break missingId;
      }

      id = R.id.new_conversation_toolbar;
      MaterialToolbar newConversationToolbar = ViewBindings.findChildViewById(rootView, id);
      if (newConversationToolbar == null) {
        break missingId;
      }

      id = R.id.no_contacts_placeholder;
      MyTextView noContactsPlaceholder = ViewBindings.findChildViewById(rootView, id);
      if (noContactsPlaceholder == null) {
        break missingId;
      }

      id = R.id.no_contacts_placeholder_2;
      MyTextView noContactsPlaceholder2 = ViewBindings.findChildViewById(rootView, id);
      if (noContactsPlaceholder2 == null) {
        break missingId;
      }

      id = R.id.suggestions_holder;
      LinearLayout suggestionsHolder = ViewBindings.findChildViewById(rootView, id);
      if (suggestionsHolder == null) {
        break missingId;
      }

      id = R.id.suggestions_label;
      MyTextView suggestionsLabel = ViewBindings.findChildViewById(rootView, id);
      if (suggestionsLabel == null) {
        break missingId;
      }

      id = R.id.suggestions_scrollview;
      HorizontalScrollView suggestionsScrollview = ViewBindings.findChildViewById(rootView, id);
      if (suggestionsScrollview == null) {
        break missingId;
      }

      return new ActivityNewConversationBinding((CoordinatorLayout) rootView, addContactDivider,
          contactsLetterFastscroller, contactsLetterFastscrollerThumb, contactsList,
          newConversationAddress, newConversationConfirm, newConversationCoordinator,
          newConversationHolder, newConversationToolbar, noContactsPlaceholder,
          noContactsPlaceholder2, suggestionsHolder, suggestionsLabel, suggestionsScrollview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
