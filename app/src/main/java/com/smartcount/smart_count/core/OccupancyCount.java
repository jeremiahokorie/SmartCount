package com.smartcount.smart_count.core;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.geniusforapp.fancydialog.FancyAlertDialog;
import com.smartcount.smart_count.R;
import com.smartcount.smart_count.Util.XCore;

public class OccupancyCount extends AppCompatActivity {
    TextView fx,va;
    EditText etseat;
    TextView unoccupied,occupied,val;
    int row = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_occupancy_count);
        fx = (TextView)findViewById(R.id.fxseat);
        va = (TextView)findViewById(R.id.value);
        etseat = (EditText)findViewById(R.id.etseat);
        unoccupied = (TextView)findViewById(R.id.unoccupied);
        occupied = (TextView)findViewById(R.id.occupied);
        fx.getText().toString();

        ((TextView)findViewById(R.id.unoccupied)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.occupied)).setBackgroundResource(R.drawable.list_shadow_trans);
                ((TextView) findViewById(R.id.occupied)).setTextColor(Color.BLACK);
                ((TextView) findViewById(R.id.unoccupied)).setTextColor(Color.WHITE);
                ((TextView) findViewById(R.id.unoccupied)).setBackgroundColor(Color.parseColor("#710762"));
            }
        });

        ((TextView)findViewById(R.id.occupied)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.unoccupied)).setBackgroundResource(R.drawable.list_shadow_trans);
                ((TextView) findViewById(R.id.unoccupied)).setTextColor(Color.BLACK);
                ((TextView) findViewById(R.id.occupied)).setTextColor(Color.WHITE);
                ((TextView) findViewById(R.id.occupied)).setBackgroundColor(Color.parseColor("#710762"));
            }
        });


    }
    public void imgback (View view){
        super.onBackPressed();

    }
    public void imgnext (View view){
        XCore.dialog(OccupancyCount.this, "Next",
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
        XCore.dialog(OccupancyCount.this, "Logout",
                "Are you sure you want to Sign Out from this page.",
                new FancyAlertDialog.OnPositiveClicked() {
                    @Override
                    public void OnClick(View view, Dialog dialog) {
                        Intent intent = new Intent(OccupancyCount.this,LoginActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }, "Logout", "").show();

    }
//    public void btnsubmit (View view){
//        Toast.makeText(getApplicationContext(),"You clivked me",Toast.LENGTH_LONG).show();
//    }

    public void rowincrease(View view) {
        row = row+1;
        displayrow(row);
//        if (row < 1){
//            // Toast.makeText(getApplicationContext(),"Row can't be less than Row1",Toast.LENGTH_LONG).show();
//        }else {
//
//        }
    }

    private void displayrow(int row) {
            TextView male2 = (TextView) findViewById(R.id.rowresult);
            male2.setText("Row"+row);
        }


    public void rowdecrease (View view){
        row = row -1;
        displayrow(row);

    }
    public void tvreset (View view){
        Intent intent = new Intent(getApplicationContext(),CountingMethod.class);
        startActivity(intent);
        finish();
    }

    public void TextView (View view){
        String et = etseat.getText().toString();
        fx.setText(et);
        va.setText(et);
    }
}
