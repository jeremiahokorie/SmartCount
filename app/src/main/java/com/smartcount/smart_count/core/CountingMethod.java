package com.smartcount.smart_count.core;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.geniusforapp.fancydialog.FancyAlertDialog;
import com.smartcount.smart_count.R;
import com.smartcount.smart_count.Util.XCore;

public class CountingMethod extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counting_method);
    }
//    public void imgnext (View view){
//            XCore.dialog(CountingMethod.this, "Next",
//                "Select an option to Proceed",
//                new FancyAlertDialog.OnPositiveClicked() {
//                    @Override
//                    public void OnClick(View view, Dialog dialog) {
//
//                    }
//                }, "Proceed", "").show();
//
//    }
//    public void tvback (View view){
//        Intent intent = new Intent(CountingMethod.this,DashboardActivity.class);
//        startActivity(intent);
//        finish();
//
//
//    }
    public void tvlog (View view){
        XCore.dialog(CountingMethod.this, "Logout",
                "Are you sure you want to Sign Out from this page.",
                new FancyAlertDialog.OnPositiveClicked() {
                    @Override
                    public void OnClick(View view, Dialog dialog) {
                        Intent intent = new Intent(CountingMethod.this,LoginActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }, "Logout", "").show();

    }
    public void gender (View view){
        Intent intent = new Intent(CountingMethod.this,GenderCount.class);
        startActivity(intent);

    }
    public void occupancy (View view){
        Intent intent = new Intent(CountingMethod.this,OccupancyCount.class);
        startActivity(intent);

    }
    public void aggregate (View view){
        Intent intent = new Intent(CountingMethod.this,AggregateCount.class);
        startActivity(intent);

    }
    public void imgback (View view){
        super.onBackPressed();

    }
    public void imgnext (View view){
        XCore.dialog(CountingMethod.this, "Next",
                "Please Select an Option to Continue",
                new FancyAlertDialog.OnPositiveClicked() {
                    @Override
                    public void OnClick(View view, Dialog dialog) {

                    }
                }, "Proceed", "").show();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();

        // your code.
//        XCore.dialog(CountingMethod.this, "Logout",
//                "Are you sure you want to Sign Out from this page.",
//                new FancyAlertDialog.OnPositiveClicked() {
//                    @Override
//                    public void OnClick(View view, Dialog dialog) {
//                        Intent intent = new Intent(CountingMethod.this,LoginActivity.class);
//                        startActivity(intent);
//                        finish();
//                    }
//                }, "Logout", "").show();

    }
}
