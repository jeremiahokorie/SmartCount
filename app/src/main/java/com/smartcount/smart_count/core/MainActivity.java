package com.smartcount.smart_count.core;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.smartcount.smart_count.R;
import com.smartcount.smart_count.core.Adapter.sliderAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   // API api;
    private ViewPager viewPager;
    private sliderAdapter myAdapter;
    ArrayList<String> arrPerm;
    // private LinearLayout mDotlayout;
    private TextView[] mDotview;

    Button btnNext, btnSkip;
    @RequiresApi(api = Build.VERSION_CODES.GINGERBREAD)
    private int getItemofviewpager(int i) {
        return viewPager.getCurrentItem() + i;
    }
//    LinearLayout sm,tv;
//    Button btn;
//    Animation updtodown,downtoup;

    @RequiresApi(api = Build.VERSION_CODES.GINGERBREAD)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        btnNext = (Button) findViewById(R.id.btnnext);
        btnSkip = (Button) findViewById(R.id.skipbtn);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(getItemofviewpager(+1),true);
            }
        });

        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent skip = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(skip);
                finish();
            }
        });

        myAdapter = new sliderAdapter(this);
        viewPager.setAdapter(myAdapter);
        addDotIndicator(0);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position == 3)
                    ((Button) findViewById(R.id.skipbtn)).setVisibility(View.GONE);
                else
                    ((Button) findViewById(R.id.skipbtn)).setVisibility(View.VISIBLE);
                if (position==2)
                    ((Button) findViewById(R.id.btnnext)).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent next = new Intent(MainActivity.this,LoginActivity.class);
                            startActivity(next);
                            finish();
                        }
                    });
            }

            @Override
            public void onPageSelected(int position) {

            }


            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    public void addDotIndicator(int position) {
        mDotview = new TextView[4];
        for (int i = 0; i < mDotview.length; i++) {
            mDotview[i] = new TextView(this);
            mDotview[i].setText(Html.fromHtml("&#8226;"));
            mDotview[i].setTextSize(35);
            //mDotview[i].setTextColor(getResources().getColor(R.color.backgroundcolor));

            //mDotlayout.addView(mDotview[i]);
        }
        if (mDotview.length == 0) {
            mDotview[position].setTextColor(getResources().getColor(R.color.colorAccent));
        }
    }


    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }


        @Override
        public void onPageSelected(int i) {
            addDotIndicator(i);

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

//        btn = (Button) findViewById(R.id.btn);
//        sm = (LinearLayout) findViewById(R.id.sm);
//        tv = (LinearLayout) findViewById(R.id.tv);
//        updtodown = AnimationUtils.loadAnimation(this, R.anim.uptodown);
//        downtoup = AnimationUtils.loadAnimation(this, R.anim.downtoup);
//        sm.setAnimation(updtodown);
//        tv.setAnimation(downtoup);


    }

