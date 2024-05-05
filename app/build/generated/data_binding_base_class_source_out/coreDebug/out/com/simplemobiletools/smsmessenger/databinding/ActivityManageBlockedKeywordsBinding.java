// Generated by view binder compiler. Do not edit!
package com.simplemobiletools.smsmessenger.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.MaterialToolbar;
import com.simplemobiletools.commons.views.MyRecyclerView;
import com.simplemobiletools.commons.views.MyTextView;
import com.simplemobiletools.smsmessenger.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityManageBlockedKeywordsBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final CoordinatorLayout blockKeywordsCoordinator;

  @NonNull
  public final MaterialToolbar blockKeywordsToolbar;

  @NonNull
  public final MyRecyclerView manageBlockedKeywordsList;

  @NonNull
  public final MyTextView manageBlockedKeywordsPlaceholder;

  @NonNull
  public final MyTextView manageBlockedKeywordsPlaceholder2;

  @NonNull
  public final ConstraintLayout manageBlockedKeywordsWrapper;

  private ActivityManageBlockedKeywordsBinding(@NonNull CoordinatorLayout rootView,
      @NonNull CoordinatorLayout blockKeywordsCoordinator,
      @NonNull MaterialToolbar blockKeywordsToolbar,
      @NonNull MyRecyclerView manageBlockedKeywordsList,
      @NonNull MyTextView manageBlockedKeywordsPlaceholder,
      @NonNull MyTextView manageBlockedKeywordsPlaceholder2,
      @NonNull ConstraintLayout manageBlockedKeywordsWrapper) {
    this.rootView = rootView;
    this.blockKeywordsCoordinator = blockKeywordsCoordinator;
    this.blockKeywordsToolbar = blockKeywordsToolbar;
    this.manageBlockedKeywordsList = manageBlockedKeywordsList;
    this.manageBlockedKeywordsPlaceholder = manageBlockedKeywordsPlaceholder;
    this.manageBlockedKeywordsPlaceholder2 = manageBlockedKeywordsPlaceholder2;
    this.manageBlockedKeywordsWrapper = manageBlockedKeywordsWrapper;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityManageBlockedKeywordsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityManageBlockedKeywordsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_manage_blocked_keywords, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityManageBlockedKeywordsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CoordinatorLayout blockKeywordsCoordinator = (CoordinatorLayout) rootView;

      id = R.id.block_keywords_toolbar;
      MaterialToolbar blockKeywordsToolbar = ViewBindings.findChildViewById(rootView, id);
      if (blockKeywordsToolbar == null) {
        break missingId;
      }

      id = R.id.manage_blocked_keywords_list;
      MyRecyclerView manageBlockedKeywordsList = ViewBindings.findChildViewById(rootView, id);
      if (manageBlockedKeywordsList == null) {
        break missingId;
      }

      id = R.id.manage_blocked_keywords_placeholder;
      MyTextView manageBlockedKeywordsPlaceholder = ViewBindings.findChildViewById(rootView, id);
      if (manageBlockedKeywordsPlaceholder == null) {
        break missingId;
      }

      id = R.id.manage_blocked_keywords_placeholder_2;
      MyTextView manageBlockedKeywordsPlaceholder2 = ViewBindings.findChildViewById(rootView, id);
      if (manageBlockedKeywordsPlaceholder2 == null) {
        break missingId;
      }

      id = R.id.manage_blocked_keywords_wrapper;
      ConstraintLayout manageBlockedKeywordsWrapper = ViewBindings.findChildViewById(rootView, id);
      if (manageBlockedKeywordsWrapper == null) {
        break missingId;
      }

      return new ActivityManageBlockedKeywordsBinding((CoordinatorLayout) rootView,
          blockKeywordsCoordinator, blockKeywordsToolbar, manageBlockedKeywordsList,
          manageBlockedKeywordsPlaceholder, manageBlockedKeywordsPlaceholder2,
          manageBlockedKeywordsWrapper);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
