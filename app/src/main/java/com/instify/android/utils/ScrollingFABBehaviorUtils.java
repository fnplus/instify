package com.instify.android.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.instify.android.R;

/**
 * Created by Abhish3k on 6/29/2016.
 */

public class ScrollingFABBehaviorUtils extends CoordinatorLayout.Behavior<FloatingActionButton> {
  private int toolbarHeight;

  public ScrollingFABBehaviorUtils(Context context, AttributeSet attrs) {
    super();
    this.toolbarHeight = getToolbarHeight(context);
  }

  public static int getToolbarHeight(Context context) {
    final TypedArray styledAttributes =
        context.getTheme().obtainStyledAttributes(new int[] { R.attr.actionBarSize });
    int toolbarHeight = (int) styledAttributes.getDimension(0, 0);
    styledAttributes.recycle();

    return toolbarHeight;
  }

  @Override public boolean layoutDependsOn(CoordinatorLayout parent, FloatingActionButton fab,
      View dependency) {
    return super.layoutDependsOn(parent, fab, dependency) || (dependency instanceof AppBarLayout);
  }

  @Override
  public boolean onDependentViewChanged(CoordinatorLayout parent, FloatingActionButton fab,
      View dependency) {
    boolean returnValue = super.onDependentViewChanged(parent, fab, dependency);
    if (dependency instanceof AppBarLayout) {
      CoordinatorLayout.LayoutParams lp = (CoordinatorLayout.LayoutParams) fab.getLayoutParams();
      int fabBottomMargin = lp.bottomMargin;
      int distanceToScroll = fab.getHeight() + fabBottomMargin;
      float ratio = dependency.getY() / (float) toolbarHeight;
      fab.setTranslationY(-distanceToScroll * ratio);
    }

    return returnValue;
  }
}
