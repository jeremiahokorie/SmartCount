package com.smartcount.smart_count.core;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.geniusforapp.fancydialog.FancyAlertDialog;
import com.smartcount.smart_count.R;
import com.smartcount.smart_count.Util.XCore;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static android.util.Config.LOGD;

public class RegisterActivity extends AppCompatActivity {
    TextView tvsignup;
    Button btnsignup;
    TextView result;
    EditText username, email, pass;
    RequestQueue requestQueue;
    String inserturl = "http://192.168.1.71/smartcount/inserturl.php";
    String showurl = "http://192.168.1.71/smartcount/showuser.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username = (EditText) findViewById(R.id.etuser);
        email = (EditText) findViewById(R.id.etemail);
        pass = (EditText) findViewById(R.id.etpass);
        btnsignup = (Button) findViewById(R.id.btnsignup);

        requestQueue = Volley.newRequestQueue(getApplicationContext());


        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!username.getText().toString().equals("") && !email.getText().toString().equals("") && !pass.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Thank you for registring with us",Toast.LENGTH_LONG).show();

                }else {
                    XCore.dialog(RegisterActivity.this, "Sign Up",
                            "Unable to Register you at the moment.Please fill all necessary filled.",
                            new FancyAlertDialog.OnPositiveClicked() {
                                @Override
                                public void OnClick(View view, Dialog dialog) {

                                }
                            }, "Proceed", "").show();
                }
            }
//        });
//                JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, showurl, new Response.Listener<JSONObject>() {
//                    @Override
//                    public void onResponse(JSONObject response) {
//                        Log.d("RESULT:",result.toString());
//                        try {
//                            JSONArray user = response.getJSONArray("admin");
//                            for (int i = 0; i < user.length(); i++) {
//                                JSONObject users = user.getJSONObject(i);
//                                String username = users.getString(("username"));
//                                String email = users.getString(("email"));
//                                String pass = users.getString(("password"));
//                                Log.d("RESULT:",result.toString());
//
//                                result.append(username + " " + email + " " + pass + "\n");
//                                Toast.makeText(getApplicationContext(), " " + result + " ", Toast.LENGTH_LONG).show();
//
//
//                            }
//                            result.append("==\n");
//                            Toast.makeText(getApplicationContext(), " " + result + " ", Toast.LENGTH_LONG).show();
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//
//                    }
//                }, new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//
//                    }
//                });
//                requestQueue.add(jsonObjectRequest);

//                if (!username.getText().toString().equals("") && !email.getText().toString().equals("") && !pass.getText().toString().equals("")){
//                    Toast.makeText(getApplicationContext(),"Thank you for registring with us",Toast.LENGTH_LONG).show();

//                }else {
//                    XCore.dialog(RegisterActivity.this, "Sign Up",
//                            "Unable to Register you at the moment.Please fill all necessary filled.",
//                            new FancyAlertDialog.OnPositiveClicked() {
//                                @Override
//                                public void OnClick(View view, Dialog dialog) {
//
//                                }
//                            }, "Proceed", "").show();
//                }
//            }
      });


            }

    public void tvsignup(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
