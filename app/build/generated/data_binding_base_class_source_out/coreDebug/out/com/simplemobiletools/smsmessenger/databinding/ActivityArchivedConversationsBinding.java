// Generated by view binder compiler. Do not edit!
package com.simplemobiletools.smsmessenger.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.qtalk.recyclerviewfastscroller.RecyclerViewFastScroller;
import com.simplemobiletools.commons.views.MyRecyclerView;
import com.simplemobiletools.commons.views.MyTextView;
import com.simplemobiletools.smsmessenger.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityArchivedConversationsBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final CoordinatorLayout archiveCoordinator;

  @NonNull
  public final CoordinatorLayout archiveCoordinatorWrapper;

  @NonNull
  public final RelativeLayout archiveHolder;

  @NonNull
  public final RelativeLayout archiveNestedScrollview;

  @NonNull
  public final MaterialToolbar archiveToolbar;

  @NonNull
  public final RecyclerViewFastScroller conversationsFastscroller;

  @NonNull
  public final MyRecyclerView conversationsList;

  @NonNull
  public final LinearProgressIndicator conversationsProgressBar;

  @NonNull
  public final MyTextView noConversationsPlaceholder;

  private ActivityArchivedConversationsBinding(@NonNull CoordinatorLayout rootView,
      @NonNull CoordinatorLayout archiveCoordinator,
      @NonNull CoordinatorLayout archiveCoordinatorWrapper, @NonNull RelativeLayout archiveHolder,
      @NonNull RelativeLayout archiveNestedScrollview, @NonNull MaterialToolbar archiveToolbar,
      @NonNull RecyclerViewFastScroller conversationsFastscroller,
      @NonNull MyRecyclerView conversationsList,
      @NonNull LinearProgressIndicator conversationsProgressBar,
      @NonNull MyTextView noConversationsPlaceholder) {
    this.rootView = rootView;
    this.archiveCoordinator = archiveCoordinator;
    this.archiveCoordinatorWrapper = archiveCoordinatorWrapper;
    this.archiveHolder = archiveHolder;
    this.archiveNestedScrollview = archiveNestedScrollview;
    this.archiveToolbar = archiveToolbar;
    this.conversationsFastscroller = conversationsFastscroller;
    this.conversationsList = conversationsList;
    this.conversationsProgressBar = conversationsProgressBar;
    this.noConversationsPlaceholder = noConversationsPlaceholder;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityArchivedConversationsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityArchivedConversationsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_archived_conversations, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityArchivedConversationsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CoordinatorLayout archiveCoordinator = (CoordinatorLayout) rootView;

      id = R.id.archive_coordinator_wrapper;
      CoordinatorLayout archiveCoordinatorWrapper = ViewBindings.findChildViewById(rootView, id);
      if (archiveCoordinatorWrapper == null) {
        break missingId;
      }

      id = R.id.archive_holder;
      RelativeLayout archiveHolder = ViewBindings.findChildViewById(rootView, id);
      if (archiveHolder == null) {
        break missingId;
      }

      id = R.id.archive_nested_scrollview;
      RelativeLayout archiveNestedScrollview = ViewBindings.findChildViewById(rootView, id);
      if (archiveNestedScrollview == null) {
        break missingId;
      }

      id = R.id.archive_toolbar;
      MaterialToolbar archiveToolbar = ViewBindings.findChildViewById(rootView, id);
      if (archiveToolbar == null) {
        break missingId;
      }

      id = R.id.conversations_fastscroller;
      RecyclerViewFastScroller conversationsFastscroller = ViewBindings.findChildViewById(rootView, id);
      if (conversationsFastscroller == null) {
        break missingId;
      }

      id = R.id.conversations_list;
      MyRecyclerView conversationsList = ViewBindings.findChildViewById(rootView, id);
      if (conversationsList == null) {
        break missingId;
      }

      id = R.id.conversations_progress_bar;
      LinearProgressIndicator conversationsProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (conversationsProgressBar == null) {
        break missingId;
      }

      id = R.id.no_conversations_placeholder;
      MyTextView noConversationsPlaceholder = ViewBindings.findChildViewById(rootView, id);
      if (noConversationsPlaceholder == null) {
        break missingId;
      }

      return new ActivityArchivedConversationsBinding((CoordinatorLayout) rootView,
          archiveCoordinator, archiveCoordinatorWrapper, archiveHolder, archiveNestedScrollview,
          archiveToolbar, conversationsFastscroller, conversationsList, conversationsProgressBar,
          noConversationsPlaceholder);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
