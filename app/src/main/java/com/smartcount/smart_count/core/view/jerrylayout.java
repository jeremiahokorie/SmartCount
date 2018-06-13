package com.smartcount.smart_count.core.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;

/**
 * Created by jeremiah.imo on 6/5/2018.
 */

public class jerrylayout extends FrameLayout {
    public jerrylayout(Context context) {
        super(context);
    }

    public jerrylayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public jerrylayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public jerrylayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected boolean fitSystemWindows(Rect insets) {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.JELLY_BEAN
                && Build.VERSION.SDK_INT < 20) {
            insets.top = 0;
            insets.bottom -= 0;
        }
        return super.fitSystemWindows(insets);
    }

    @Override
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        // executed by API >= 20.
        // removes the empty padding at the bottom which equals that of the height of NavBar.
        setPadding(0, 0, 0, insets.getSystemWindowInsetBottom() - 0);
        return insets.consumeSystemWindowInsets();
    }
}
