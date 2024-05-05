// Generated by view binder compiler. Do not edit!
package com.simplemobiletools.smsmessenger.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.simplemobiletools.smsmessenger.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemThreadLoadingBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CircularProgressIndicator threadLoading;

  private ItemThreadLoadingBinding(@NonNull LinearLayout rootView,
      @NonNull CircularProgressIndicator threadLoading) {
    this.rootView = rootView;
    this.threadLoading = threadLoading;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemThreadLoadingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemThreadLoadingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_thread_loading, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemThreadLoadingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.thread_loading;
      CircularProgressIndicator threadLoading = ViewBindings.findChildViewById(rootView, id);
      if (threadLoading == null) {
        break missingId;
      }

      return new ItemThreadLoadingBinding((LinearLayout) rootView, threadLoading);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
