package com.example.oyjs2.iymy;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class alarm_list_modify extends AppCompatActivity {
    ImageView leftImg, setting, medlist_addIcon;
    TextView titles,settingInf,floatingTxt;
    View imgLayout;
    Button cancel, check;
    ArrayList<modify_list_item> modify_list_itemArrayList;
    ArrayList<String>name = new ArrayList<String>();
    modifyListAdapter modifyListAdapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_list_modify);

        listView = findViewById(R.id.listView);
        leftImg = findViewById(R.id.leftImg);
        setting = findViewById(R.id.setting);
        settingInf = findViewById(R.id.settingInf);
        imgLayout = findViewById(R.id.imgLayout);
        titles = findViewById(R.id.titles);
        medlist_addIcon = findViewById(R.id.medlist_addIcon);
        cancel = findViewById(R.id.cancel);
        check = findViewById(R.id.check);
        modify_list_itemArrayList = new ArrayList<modify_list_item>();
        name.add("봉투");
        name.add("봉투2");
        name.add("봉투3");
        name.add("봉투4");
        name.add("봉투5");
        name.add("봉투6");
        name.add("봉투7");
        setting_list();
        leftImg.setImageResource(R.drawable.returns);
        titles.setText("봉투");
        setting.setImageResource(R.drawable.house);

        leftImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        medlist_addIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(alarm_list_modify.this, add_alarm.class);
                startActivity(intent);
            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(alarm_list_modify.this);
                dlg.setTitle("삭제");
                dlg.setMessage(name.get(position) + "를 정말 삭제하시겠습니까?");
                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        name.remove(position);
                        setting_list();
                    }
                });
                dlg.setNegativeButton("취소", null);
                dlg.show();
            }
        });

    }
    public void setting_list(){
        name.clear();
        modify_list_itemArrayList.clear();
        for(int i =0; i< name.size(); i++) {
            modify_list_itemArrayList.add(new modify_list_item(name.get(i),""));
        }
        modifyListAdapter = new modifyListAdapter(alarm_list_modify.this, modify_list_itemArrayList);
        listView.setAdapter(modifyListAdapter);
    }
}
