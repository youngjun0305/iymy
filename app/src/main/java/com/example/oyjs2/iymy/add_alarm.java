package com.example.oyjs2.iymy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class add_alarm extends AppCompatActivity {
    ImageView leftImg, setting;
    TextView titles, settingInf, floatingTxt;
    View imgLayout;
    FloatingActionButton fab;
    ArrayList<add_list_item> add_list_itemArrayList;
    ArrayList<String> name = new ArrayList<String>();
    addListAdapter addListAdapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_alarm);
        leftImg = findViewById(R.id.leftImg);
        setting = findViewById(R.id.setting);
        settingInf = findViewById(R.id.settingInf);
        imgLayout = findViewById(R.id.imgLayout);
        titles = findViewById(R.id.titles);
        fab = findViewById(R.id.fab);
        floatingTxt = findViewById(R.id.floatingText);
        titles.setText("봉투");
        leftImg.setImageResource(R.drawable.returns);
        setting.setImageResource(R.drawable.checkmark);
        fab.setImageResource(R.drawable.checkmark);
        settingInf.setText("전체선택");
        floatingTxt.setText("확인");
        fab.setImageResource(R.drawable.checkmark);
        add_list_itemArrayList = new ArrayList<add_list_item>();
        listView = findViewById(R.id.listView);
        updating();
        leftImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(add_alarm.this, alarm_add.class);
                startActivity(intent);
                finish();
            }
        });

    }

    public void updating() {
        name.add("안먹어");
        name.add("오전");
        name.add("07:00");
        name.add("감이약, 혈압약");
        add_list_itemArrayList.add(new add_list_item(name.get(0), name.get(1), name.get(2), true, name.get(3)));
        addListAdapter = new addListAdapter(add_alarm.this, add_list_itemArrayList);
        listView.setAdapter(addListAdapter);
    }
}
