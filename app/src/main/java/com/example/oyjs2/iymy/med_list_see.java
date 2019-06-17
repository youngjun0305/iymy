package com.example.oyjs2.iymy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class med_list_see extends AppCompatActivity {

    ListView listView;
    ArrayList<String>med = new ArrayList<String>();
    ArrayAdapter<String> adapter;
    ImageView leftImg, setting;
    TextView titles,settingInf, leftTxt;
    View imgLayout;

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_list_see);
        listView = findViewById(R.id.listView);
        leftImg = findViewById(R.id.leftImg);
        setting = findViewById(R.id.setting);
        titles = findViewById(R.id.titles);
        settingInf = findViewById(R.id.settingInf);
        leftTxt = findViewById(R.id.leftTxt);
        imgLayout = findViewById(R.id.imgLayout);

        leftImg.setVisibility(View.GONE);
        leftTxt.setVisibility(View.VISIBLE);
        leftTxt.setText("편집");
        setting.setImageResource(R.drawable.plusbutton);
        titles.setText("봉투목록");
        settingInf.setVisibility(View.VISIBLE);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, med);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                intent = new Intent(med_list_see.this,med_inf.class);
                startActivity(intent);
            }
        });

        imgLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(med_list_see.this, med_drug_add.class);
                startActivity(intent);
            }
        });

        leftTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
