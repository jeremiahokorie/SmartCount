package com.smartcount.smart_count.core;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.smartcount.smart_count.R;
import com.smartcount.smart_count.core.MainActivity;

public class Splash_Screen extends AppCompatActivity {
    TextView tv1,tv2;
    Button btn;
    Animation updtodown,downtoup;
    ImageView img;
    Animation animation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

        btn = (Button) findViewById(R.id.btn);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        updtodown = AnimationUtils.loadAnimation(this, R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this, R.anim.downtoup);
        tv1.setAnimation(updtodown);
        btn.setAnimation(downtoup);

        ImageView imageView = (ImageView) findViewById(R.id.img);
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        imageView.setAnimation(animation);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                finish();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}
