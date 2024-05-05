// Generated by view binder compiler. Do not edit!
package com.simplemobiletools.smsmessenger.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.simplemobiletools.smsmessenger.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ItemAttachmentImageBinding implements ViewBinding {
  @NonNull
  private final ShapeableImageView rootView;

  @NonNull
  public final ShapeableImageView attachmentImage;

  private ItemAttachmentImageBinding(@NonNull ShapeableImageView rootView,
      @NonNull ShapeableImageView attachmentImage) {
    this.rootView = rootView;
    this.attachmentImage = attachmentImage;
  }

  @Override
  @NonNull
  public ShapeableImageView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemAttachmentImageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemAttachmentImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_attachment_image, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemAttachmentImageBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    ShapeableImageView attachmentImage = (ShapeableImageView) rootView;

    return new ItemAttachmentImageBinding((ShapeableImageView) rootView, attachmentImage);
  }
}
