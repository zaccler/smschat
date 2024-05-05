// Generated by view binder compiler. Do not edit!
package com.simplemobiletools.smsmessenger.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.simplemobiletools.smsmessenger.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemSelectedContactBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout selectedContactHolder;

  @NonNull
  public final TextView selectedContactName;

  @NonNull
  public final ImageView selectedContactRemove;

  private ItemSelectedContactBinding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout selectedContactHolder, @NonNull TextView selectedContactName,
      @NonNull ImageView selectedContactRemove) {
    this.rootView = rootView;
    this.selectedContactHolder = selectedContactHolder;
    this.selectedContactName = selectedContactName;
    this.selectedContactRemove = selectedContactRemove;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemSelectedContactBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemSelectedContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_selected_contact, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemSelectedContactBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RelativeLayout selectedContactHolder = (RelativeLayout) rootView;

      id = R.id.selected_contact_name;
      TextView selectedContactName = ViewBindings.findChildViewById(rootView, id);
      if (selectedContactName == null) {
        break missingId;
      }

      id = R.id.selected_contact_remove;
      ImageView selectedContactRemove = ViewBindings.findChildViewById(rootView, id);
      if (selectedContactRemove == null) {
        break missingId;
      }

      return new ItemSelectedContactBinding((RelativeLayout) rootView, selectedContactHolder,
          selectedContactName, selectedContactRemove);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
