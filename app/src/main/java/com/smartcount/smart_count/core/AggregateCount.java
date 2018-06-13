package com.smartcount.smart_count.core;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.geniusforapp.fancydialog.FancyAlertDialog;
import com.smartcount.smart_count.R;
import com.smartcount.smart_count.Util.XCore;

public class AggregateCount extends AppCompatActivity {
    EditText etmen,etwomen,etchildren,etother;
    int row = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aggregate_count);
        etmen = (EditText) findViewById(R.id.etmen);
        etwomen = (EditText) findViewById(R.id.etwomen);
        etchildren = (EditText)findViewById(R.id.etchildren);
        etother = (EditText)findViewById(R.id.etother);
    }
    public void imgback (View view){
        super.onBackPressed();

    }
    public void imgnext (View view){
        XCore.dialog(AggregateCount.this, "Next",
                "Please Select an Option to Continue",
                new FancyAlertDialog.OnPositiveClicked() {
                    @Override
                    public void OnClick(View view, Dialog dialog) {

                    }
                }, "Proceed", "").show();
    }
    @Override
    public void onBackPressed() {
        // your code.
        XCore.dialog(AggregateCount.this, "Logout",
                "Are you sure you want to Sign Out from this page.",
                new FancyAlertDialog.OnPositiveClicked() {
                    @Override
                    public void OnClick(View view, Dialog dialog) {
                        Intent intent = new Intent(AggregateCount.this,LoginActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }, "Logout", "").show();

    }

    public void rowdecrease(View view) {
        row = row-1;
        if (row < 1){
            //Toast.makeText(getApplicationContext(),"Row can't be less than Row1",Toast.LENGTH_LONG).show();
        }else {
            displayrow(row);
        }
    }

    private void displayrow(int row) {
        TextView male2 = (TextView) findViewById(R.id.rowresult);
        male2.setText("Row"+row);
    }

    public void rowincrease(View view) {
        row = row+1;
        if (row < 1){
            // Toast.makeText(getApplicationContext(),"Row can't be less than Row1",Toast.LENGTH_LONG).show();
        }else {
            displayrow(row);
        }
    }
    public void btnsubmit (View view){
        XCore.dialog(AggregateCount.this, "Submit",
                "Please Complete all necessary filled to continue",
                new FancyAlertDialog.OnPositiveClicked() {
                    @Override
                    public void OnClick(View view, Dialog dialog) {

                    }
                }, "Proceed", "").show();


    }
    public void tvlogout (View view){
        XCore.dialog(AggregateCount.this, "Logout",
                "Are you sure you want to Sign Out from this page.",
                new FancyAlertDialog.OnPositiveClicked() {
                    @Override
                    public void OnClick(View view, Dialog dialog) {
                        Intent intent = new Intent(AggregateCount.this,LoginActivity.class);
                        startActivity(intent);
                    }
                }, "Logout", "").show();
        finish();
    }

    public void tvreset(View view) {
        Intent intent = new Intent(getApplicationContext(),CountingMethod.class);
        startActivity(intent);
        finish();
    }
}
