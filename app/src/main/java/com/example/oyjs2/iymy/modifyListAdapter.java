package com.example.oyjs2.iymy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class modifyListAdapter extends BaseAdapter {
    ImageView delImg;
    TextView name,time;
    Context context;
    ArrayList<modify_list_item>modify_list_itemArrayList;
    View del_layout;

    public modifyListAdapter(Context context, ArrayList<modify_list_item> modify_list_itemArrayList) {
        this.context = context;
        this.modify_list_itemArrayList = modify_list_itemArrayList;
    }

    @Override
    public int getCount() {
        return modify_list_itemArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.modify_list_itemArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.modify_item,null);
            time = convertView.findViewById(R.id.del_time);
            name = convertView.findViewById(R.id.del_name);
            delImg = convertView.findViewById(R.id.del_image);
            del_layout = convertView.findViewById(R.id.del_layout);
        }
        time.setText(modify_list_itemArrayList.get(position).getTime());
        name.setText(modify_list_itemArrayList.get(position).getName());
        delImg.setImageResource(R.drawable.cancel);
        return convertView;
    }


}
