package com.mojtaba_shafaei.android;

import android.content.Context;
import android.support.annotation.IntRange;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android_circular_progress_example.android.mojtaba_shafaei.com.androidcircularprogress.R;

public class CircularProgress extends RelativeLayout {

  private AppCompatImageView imageView;

  public CircularProgress(Context context) {
    this(context, null);
  }

  public CircularProgress(Context context, AttributeSet attrs) {
    super(context, attrs);
    inflate(context, R.layout.radial_progress, this);
    imageView = findViewById(R.id.image);
  }

  public void setProgress(@IntRange(from = 0, to = 4) int step) {

    switch (step) {
      case 0:
        imageView.setImageResource(R.drawable.ic_p0);
        break;

      case 1:
        imageView.setImageResource(R.drawable.ic_p1);
        break;

      case 2:
        imageView.setImageResource(R.drawable.ic_p2);
        break;

      case 3:
        imageView.setImageResource(R.drawable.ic_p3);
        break;

      case 4:
        imageView.setImageResource(R.drawable.ic_p4);
        break;
    }
  }
}
