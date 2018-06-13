package com.smartcount.smart_count.core;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.geniusforapp.fancydialog.FancyAlertDialog;
import com.smartcount.smart_count.R;
import com.smartcount.smart_count.Util.XCore;

public class DashboardActivity extends AppCompatActivity {
    Spinner spinner,allocated_spinner;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        spinner = (Spinner) findViewById(R.id.spinner);
        allocated_spinner  = (Spinner) findViewById(R.id.allocated_spinner);


        Spinner spinner = (Spinner) findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        Spinner allocated_spinner = (Spinner) findViewById(R.id.allocated_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> allocated_adapter = ArrayAdapter.createFromResource(this,
                R.array.allocated_program, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        allocated_spinner.setAdapter(allocated_adapter);
    }

    public class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> parent, View view,
                                   int pos, long id) {

            // An item was selected. You can retrieve the selected item using
            // parent.getItemAtPosition(pos)
        }

        public void onNothingSelected(AdapterView<?> parent) {
            // Another interface callback
        }
    }
    public void tvlogout (View view){
        XCore.dialog(DashboardActivity.this, "Logout",
                "Are you sure you want to Sign Out from this page.",
                new FancyAlertDialog.OnPositiveClicked() {
                    @Override
                    public void OnClick(View view, Dialog dialog) {
                        Intent intent = new Intent(DashboardActivity.this,LoginActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }, "Logout", "").show();

    }
    public void btncount (View view){
        Log.d("SELECTED INDEX :: ",+spinner.getSelectedItemId()+"");
        if(spinner.getSelectedItemId()!=0) {

            Intent intent = new Intent(this, CountingMethod.class);
            startActivity(intent);
        }else {

            XCore.dialog(DashboardActivity.this, "Count",
                    "Please Select an Option to Continue",
                    new FancyAlertDialog.OnPositiveClicked() {
                        @Override
                        public void OnClick(View view, Dialog dialog) {

                        }
                    }, "Proceed", "").show();
        }
    }
    public void imgback (View view){
        XCore.dialog(DashboardActivity.this, "Logout",
                "Are you sure you want to Sign Out from this page.",
                new FancyAlertDialog.OnPositiveClicked() {
                    @Override
                    public void OnClick(View view, Dialog dialog) {
                        Intent intent = new Intent(DashboardActivity.this,LoginActivity.class);
                        startActivity(intent);
                    }
                }, "Logout", "").show();
        finish();


    }
    public void imgnext (View view){
        XCore.dialog(DashboardActivity.this, "Next",
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
        XCore.dialog(DashboardActivity.this, "Logout",
                "Are you sure you want to Sign Out from this page.",
                new FancyAlertDialog.OnPositiveClicked() {
                    @Override
                    public void OnClick(View view, Dialog dialog) {
                        Intent intent = new Intent(DashboardActivity.this,LoginActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }, "Logout", "").show();

    }
}
