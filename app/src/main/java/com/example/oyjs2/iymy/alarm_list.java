package com.example.oyjs2.iymy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class alarm_list extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<String> adapter;
    ArrayList<String> med = new ArrayList<String>();
    ImageView leftImg, setting;
    TextView titles,settingInf, leftTxt, floatingTxt;
    View imgLayout;
    Intent intent;
    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_list);
        listView = findViewById(R.id.listView);
        leftImg = findViewById(R.id.leftImg);
        setting = findViewById(R.id.setting);
        settingInf = findViewById(R.id.settingInf);
        imgLayout = findViewById(R.id.imgLayout);
        titles = findViewById(R.id.titles);
        fab = findViewById(R.id.fab);
        floatingTxt = findViewById(R.id.floatingText);

        leftImg.setImageResource(R.drawable.returns);
        titles.setText("알람");
        setting.setImageResource(R.drawable.deletebutton);
        settingInf.setText("삭제하기");

        fab.setImageResource(R.drawable.plusbutton);
        floatingTxt.setText("추가하기");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, med);
        listView.setAdapter(adapter);
        leftImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                intent = new Intent(alarm_list.this,alarm_list_modify.class);
                startActivity(intent);
            }
        });

        imgLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(alarm_list.this, alarm_add.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
