package com.example.oyjs2.iymy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class addListAdapter extends BaseAdapter {
    Context context;
    TextView alarmID, add_time, add_title, sub;
    CheckBox check;

    public addListAdapter(Context context, ArrayList<add_list_item> add_list_itemArrayList) {
        this.context = context;
        this.add_list_itemArrayList = add_list_itemArrayList;
    }

    ArrayList<add_list_item> add_list_itemArrayList;

    @Override
    public int getCount() {
        return add_list_itemArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.add_list_itemArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.add_item, null);
        }
        return convertView;
    }
}
