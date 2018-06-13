package com.smartcount.smart_count.core.Adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.smartcount.smart_count.R;

/**
 * Created by jeremiah.imo on 6/6/2018.
 */

public class sliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public sliderAdapter (Context context){
        this.context = context;
    }

    public String[]headers={
            "Get \nAttendance numbers \nthe\n Smart way",
            "Get \nAttendance numbers \nthe\n Smart way",
            "Get \nAttendance numbers \nthe\n Smart way",
//            "",
    };

    public int[]center_images={
            R.drawable.people,
            R.drawable.tablet,
            R.drawable.people1,
//            R.drawable.things,
    };
//    public int[]slider_images = {
//            R.drawable.sendmoney,
//            R.drawable.sendmoney,
//            R.drawable.sendmoney,
////            R.drawable.lightup,
//    };
    public int[]mDots={
            R.drawable.gone,
            R.drawable.gone,
            R.drawable.gone,
//            R.drawable.gone,
    };

    public String[]description ={
            "Easily Count the number of people in attendance to your event or location.",
            "Easily Store and retrieve  data of people in attendance.",
            "Easily Count the number of people in attendance to your event or location.",
//            "With your PHCN meter number,simply select your payment disco to pay both both prepaid and postpaidelectrical bills",
    };

    @Override
    public int getCount() {
        return center_images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (RelativeLayout) object;

    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_slider,container,false);

        TextView header = (TextView) view.findViewById(R.id.headerview);
       // ImageView sliderimages =(ImageView)view.findViewById(R.id.imageView);
        TextView  descriptions = (TextView) view.findViewById(R.id.descr);
        ImageView center_image= (ImageView) view.findViewById(R.id.center);
        //ImageView mDot = (ImageView) view.findViewById(R.id.mDot);

        //sliderimages.setImageResource(slider_images[position]);
        descriptions.setText(description[position]);
        header.setText(headers[position]);
        center_image.setImageResource(center_images[position]);
        //mDot.setImageResource(mDots[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }

}
