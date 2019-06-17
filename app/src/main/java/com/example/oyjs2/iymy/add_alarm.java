package com.example.oyjs2.iymy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class add_alarm extends AppCompatActivity {
    ImageView leftImg, setting;
    TextView titles,settingInf,floatingTxt;
    View imgLayout;
    FloatingActionButton fab;

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
}
