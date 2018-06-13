package com.smartcount.smart_count.core.view;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;

import com.smartcount.smart_count.R;

/**
 * Created by jeremiah.imo on 6/6/2018.
 */

public class MyCustomProgressDialog extends ProgressDialog {
    public static ProgressDialog ctor(Context context) {
        MyCustomProgressDialog dialog = new MyCustomProgressDialog(context, R.style.MyDialogTheme);
        // ProgressDialog dialog = new ProgressDialog(context);
        dialog.setIndeterminate(true);
        dialog.setCancelable(false);
        dialog.setMessage("Loading ....");
        return dialog;
    }

    public MyCustomProgressDialog(Context context) {
        super(context);
    }

    public MyCustomProgressDialog(Context context, int theme) {
        super(context, R.style.JaizProgressDialogTheme_ProgressDialogTheme);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.throbber);
    }

}
