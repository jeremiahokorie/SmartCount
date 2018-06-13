package com.smartcount.smart_count.core;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.geniusforapp.fancydialog.FancyAlertDialog;
import com.smartcount.smart_count.R;
import com.smartcount.smart_count.Util.XCore;
import com.smartcount.smart_count.core.view.MyCustomProgressDialog;

public class LoginActivity extends AppCompatActivity {
    TextView tvsignin;
    Button loginbtn;
    // ProgressDialog progressDialog;
    AlertDialog alertDialog;
    private ProgressDialog progress;
    EditText etuser, etpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginbtn = (Button) findViewById(R.id.loginbtn);
        etuser = (EditText) findViewById(R.id.etuser);
        etpass = (EditText) findViewById(R.id.etpass);
        progress = new ProgressDialog(this);


        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (API.isConnectedToInternet(getApplicationContext())) {
                    if (etuser.getText().toString().equalsIgnoreCase("smart") && etpass.getText().toString().equalsIgnoreCase("pass")) {
                        progress.setMessage("Sign In..");
                        progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                        progress.setIndeterminate(true);
                        progress.setProgress(8000);
                        progress.show();
                        Intent intent = new Intent(getApplicationContext(), DashboardActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        XCore.dialog(LoginActivity.this, "Sign In",
                                "Make sure you enter correct information for your login.",
                                new FancyAlertDialog.OnPositiveClicked() {
                                    @Override
                                    public void OnClick(View view, Dialog dialog) {

                                    }
                                }, "Proceed", "").show();

                    }
                } else {
                    XCore.dialog(LoginActivity.this, "Login", "Check your internet connection.",
                            new FancyAlertDialog.OnPositiveClicked() {
                                @Override
                                public void OnClick(View view, Dialog dialog) {
                                }
                            }, "Proceed", "").show();

                }
            }

        });


    }

    public void tvsignin(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
        finish();

    }

    public void imgback(View view) {

    }

    public void imgnext(View view) {

    }

    //    private void displayProgress(String message) {
//        try {
//            if (progressDialog == null) {
//                progressDialog = MyCustomProgressDialog.ctor(LoginActivity.this);
//                progressDialog.setCanceledOnTouchOutside(false);
//                progressDialog.getWindow().addFlags(Window.FEATURE_NO_TITLE);
//            }
//            if (progressDialog != null) {
//                if (!progressDialog.isShowing()) {
//                    progressDialog.show();
//                }
//            }
//        } catch (Exception e) {
//        }
//    }
//
//    private void dismissProgress() {
//        try {
//            if (progressDialog != null && progressDialog.isShowing()) {
//                progressDialog.dismiss();
//            }
//        } catch (Exception e) {
//        }
//    }
}
