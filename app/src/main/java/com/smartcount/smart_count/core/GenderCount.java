package com.smartcount.smart_count.core;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.geniusforapp.fancydialog.FancyAlertDialog;
import com.smartcount.smart_count.R;
import com.smartcount.smart_count.Util.XCore;

public class GenderCount extends AppCompatActivity {
    int male = 0;
    int female = 0;
    TextView result,result1,disp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender_count);
        result = (TextView)findViewById(R.id.result);
        result1 = (TextView)findViewById(R.id.result1);
        disp = (TextView)findViewById(R.id.display);

//        int f = Integer.parseInt(result.getText().toString());
//        int m = Integer.parseInt(result1.getText().toString());
//        int total = f+m;
//        disp.setText(total+"");


    }

    public void tvlogout (View view){
        XCore.dialog(GenderCount.this, "Logout",
                "Are you sure you want to Sign Out from this page.",
                new FancyAlertDialog.OnPositiveClicked() {
                    @Override
                    public void OnClick(View view, Dialog dialog) {
                        Intent intent = new Intent(GenderCount.this,LoginActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }, "Logout", "").show();

    }
    public void btnsubmit (View view){

    }

    public void imgback (View view){
        super.onBackPressed();


    }
    public void imgnext (View view){
        XCore.dialog(GenderCount.this, "Next",
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
        super.onBackPressed();
//        XCore.dialog(GenderCount.this, "Logout",
//                "Are you sure you want to Sign Out from this page.",
//                new FancyAlertDialog.OnPositiveClicked() {
//                    @Override
//                    public void OnClick(View view, Dialog dialog) {
//                        Intent intent = new Intent(GenderCount.this,LoginActivity.class);
//                        startActivity(intent);
//                        finish();
//                    }
//                }, "Logout", "").show();

    }

    public void decreament(View view) {
        male = male - 1;
        int f = Integer.parseInt(result.getText().toString());
        int m = Integer.parseInt(result1.getText().toString());
        int total = f+m;
        disp.setText(total+"");
        if (male < 1) {
            Toast.makeText(getApplicationContext(), "Value cant be less than one", Toast.LENGTH_LONG).show();
        }else {

            displaymale(male);
        }
    }

    private void displaymale(int male) {
        TextView male1 = (TextView) findViewById(R.id.result);
        male1.setText(""+male);
        int f = Integer.parseInt(result.getText().toString());
        int m = Integer.parseInt(result1.getText().toString());
        int total = f+m;
        disp.setText(total+"");
    }

    private void displayfemale(int female) {
        TextView male2 = (TextView) findViewById(R.id.result1);
        male2.setText(""+female);
        int f = Integer.parseInt(result.getText().toString());
        int m = Integer.parseInt(result1.getText().toString());
        int total = f+m;
        disp.setText(total+"");
    }

    public void increament(View view) {
        male = male +1;
        displaymale(male);
        int f = Integer.parseInt(result.getText().toString());
        int m = Integer.parseInt(result1.getText().toString());
        int total = f+m;
        disp.setText(total+"");
    }

    public void submit(View view) {


    }

    public void increament1(View view) {
        female = female +1;
        displayfemale(female);

        int f = Integer.parseInt(result.getText().toString());
        int m = Integer.parseInt(result1.getText().toString());
        int total = f+m;
        disp.setText(total+"");
    }

    public void decreament1(View view) {
        female = female - 1;
        int f = Integer.parseInt(result.getText().toString());
        int m = Integer.parseInt(result1.getText().toString());
        int total = f+m;
        disp.setText(total+"");
        if (female < 1) {
            Toast.makeText(getApplicationContext(), "Value cant be less than one", Toast.LENGTH_LONG).show();
        }else {

            displayfemale(female);
        }
    }
    public void tvreset (View view){
        Intent intent = new Intent(getApplicationContext(),CountingMethod.class);
        startActivity(intent);
        finish();
    }
}
