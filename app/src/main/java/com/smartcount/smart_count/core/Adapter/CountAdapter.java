package com.smartcount.smart_count.core.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by jeremiah.imo on 6/8/2018.
 */

public class CountAdapter extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public CountAdapter (Context context){
        this.context = context;
    }

    public String[]row={
            "row1",
            "row2",
            "row3",
            "row4",
            "row5",
    };

    @Override
    public int getCount() {
        return row.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
