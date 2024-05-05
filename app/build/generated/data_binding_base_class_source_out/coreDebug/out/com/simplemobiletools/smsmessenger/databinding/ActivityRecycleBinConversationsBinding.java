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

public final class ActivityRecycleBinConversationsBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final RecyclerViewFastScroller conversationsFastscroller;

  @NonNull
  public final MyRecyclerView conversationsList;

  @NonNull
  public final LinearProgressIndicator conversationsProgressBar;

  @NonNull
  public final MyTextView noConversationsPlaceholder;

  @NonNull
  public final CoordinatorLayout recycleBinCoordinator;

  @NonNull
  public final CoordinatorLayout recycleBinCoordinatorWrapper;

  @NonNull
  public final RelativeLayout recycleBinHolder;

  @NonNull
  public final RelativeLayout recycleBinNestedScrollview;

  @NonNull
  public final MaterialToolbar recycleBinToolbar;

  private ActivityRecycleBinConversationsBinding(@NonNull CoordinatorLayout rootView,
      @NonNull RecyclerViewFastScroller conversationsFastscroller,
      @NonNull MyRecyclerView conversationsList,
      @NonNull LinearProgressIndicator conversationsProgressBar,
      @NonNull MyTextView noConversationsPlaceholder,
      @NonNull CoordinatorLayout recycleBinCoordinator,
      @NonNull CoordinatorLayout recycleBinCoordinatorWrapper,
      @NonNull RelativeLayout recycleBinHolder, @NonNull RelativeLayout recycleBinNestedScrollview,
      @NonNull MaterialToolbar recycleBinToolbar) {
    this.rootView = rootView;
    this.conversationsFastscroller = conversationsFastscroller;
    this.conversationsList = conversationsList;
    this.conversationsProgressBar = conversationsProgressBar;
    this.noConversationsPlaceholder = noConversationsPlaceholder;
    this.recycleBinCoordinator = recycleBinCoordinator;
    this.recycleBinCoordinatorWrapper = recycleBinCoordinatorWrapper;
    this.recycleBinHolder = recycleBinHolder;
    this.recycleBinNestedScrollview = recycleBinNestedScrollview;
    this.recycleBinToolbar = recycleBinToolbar;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRecycleBinConversationsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRecycleBinConversationsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_recycle_bin_conversations, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRecycleBinConversationsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
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

      CoordinatorLayout recycleBinCoordinator = (CoordinatorLayout) rootView;

      id = R.id.recycle_bin_coordinator_wrapper;
      CoordinatorLayout recycleBinCoordinatorWrapper = ViewBindings.findChildViewById(rootView, id);
      if (recycleBinCoordinatorWrapper == null) {
        break missingId;
      }

      id = R.id.recycle_bin_holder;
      RelativeLayout recycleBinHolder = ViewBindings.findChildViewById(rootView, id);
      if (recycleBinHolder == null) {
        break missingId;
      }

      id = R.id.recycle_bin_nested_scrollview;
      RelativeLayout recycleBinNestedScrollview = ViewBindings.findChildViewById(rootView, id);
      if (recycleBinNestedScrollview == null) {
        break missingId;
      }

      id = R.id.recycle_bin_toolbar;
      MaterialToolbar recycleBinToolbar = ViewBindings.findChildViewById(rootView, id);
      if (recycleBinToolbar == null) {
        break missingId;
      }

      return new ActivityRecycleBinConversationsBinding((CoordinatorLayout) rootView,
          conversationsFastscroller, conversationsList, conversationsProgressBar,
          noConversationsPlaceholder, recycleBinCoordinator, recycleBinCoordinatorWrapper,
          recycleBinHolder, recycleBinNestedScrollview, recycleBinToolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}