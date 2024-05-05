// Generated by view binder compiler. Do not edit!
package com.simplemobiletools.smsmessenger.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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

public final class ItemVcardContactBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageView expandCollapseIcon;

  @NonNull
  public final FrameLayout itemContactFrame;

  @NonNull
  public final RelativeLayout itemContactHolder;

  @NonNull
  public final ImageView itemContactImage;

  @NonNull
  public final TextView itemContactName;

  private ItemVcardContactBinding(@NonNull FrameLayout rootView,
      @NonNull ImageView expandCollapseIcon, @NonNull FrameLayout itemContactFrame,
      @NonNull RelativeLayout itemContactHolder, @NonNull ImageView itemContactImage,
      @NonNull TextView itemContactName) {
    this.rootView = rootView;
    this.expandCollapseIcon = expandCollapseIcon;
    this.itemContactFrame = itemContactFrame;
    this.itemContactHolder = itemContactHolder;
    this.itemContactImage = itemContactImage;
    this.itemContactName = itemContactName;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemVcardContactBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemVcardContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_vcard_contact, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemVcardContactBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.expand_collapse_icon;
      ImageView expandCollapseIcon = ViewBindings.findChildViewById(rootView, id);
      if (expandCollapseIcon == null) {
        break missingId;
      }

      FrameLayout itemContactFrame = (FrameLayout) rootView;

      id = R.id.item_contact_holder;
      RelativeLayout itemContactHolder = ViewBindings.findChildViewById(rootView, id);
      if (itemContactHolder == null) {
        break missingId;
      }

      id = R.id.item_contact_image;
      ImageView itemContactImage = ViewBindings.findChildViewById(rootView, id);
      if (itemContactImage == null) {
        break missingId;
      }

      id = R.id.item_contact_name;
      TextView itemContactName = ViewBindings.findChildViewById(rootView, id);
      if (itemContactName == null) {
        break missingId;
      }

      return new ItemVcardContactBinding((FrameLayout) rootView, expandCollapseIcon,
          itemContactFrame, itemContactHolder, itemContactImage, itemContactName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
