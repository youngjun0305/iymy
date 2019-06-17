package com.example.oyjs2.iymy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class med_drug_add extends AppCompatActivity {

    ArrayList<modify_list_item> modify_list_itemArrayList;
    ArrayList<String>alarm = new ArrayList<String>();
    ArrayList<String>time = new ArrayList<String>();
    modifyListAdapter modifyListAdapter;
    ListView listView;
    Button cancel, check;
    ImageView add_alarm, leftImg, setting;
    TextView titles,settingInf;
    View imgLayout;
    EditText editTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_drug_add);

        editTitle = findViewById(R.id.editTitle);
        listView = findViewById(R.id.listView);
        cancel = findViewById(R.id.cancel);
        check = findViewById(R.id.check);
        add_alarm = findViewById(R.id.add_alarm);
        leftImg = findViewById(R.id.leftImg);
        setting = findViewById(R.id.setting);
        settingInf = findViewById(R.id.settingInf);
        imgLayout = findViewById(R.id.imgLayout);
        titles = findViewById(R.id.titles);
        modify_list_itemArrayList = new ArrayList<modify_list_item>();
        leftImg.setImageResource(R.drawable.returns);
        setting.setImageResource(R.drawable.plusbutton);
        titles.setVisibility(View.GONE);
        editTitle.setVisibility(View.VISIBLE);
        alarm.add("7시");
        alarm.add("8시");
        alarm.add("10시");
        alarm.add("1시");
        alarm.add("2시");
        alarm.add("3시");
        alarm.add("7시");
        time.add("오전");
        time.add("오전");
        time.add("오전");
        time.add("오전");
        time.add("오후");
        time.add("오후");
        time.add("오후");
        setting_list();
        leftImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(med_drug_add.this, med_list.class);
                startActivity(intent);
                finish();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        add_alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(med_drug_add.this, med_add_alarm.class);
                startActivity(intent);

            }
        });
    }
    public void setting_list(){
        modify_list_itemArrayList.clear();
        for(int i =0; i< alarm.size(); i++) {
            modify_list_itemArrayList.add(new modify_list_item(alarm.get(i),time.get(i)));
        }
        modifyListAdapter = new modifyListAdapter(med_drug_add.this, modify_list_itemArrayList);
        listView.setAdapter(modifyListAdapter);
    }
}
