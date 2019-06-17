package com.example.oyjs2.iymy;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class FrontActivity extends AppCompatActivity {

    ImageView leftImg, setting;
    View imgLayout;
    TextView titles;
    ImageButton camSearch, barSerch, pharmSearch, alarm, pill;
    Intent intent, outIntent;
    EditText search;
    ImageView search_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

        intent = getIntent();
        leftImg = findViewById(R.id.leftImg);
        setting = findViewById(R.id.setting);
        imgLayout = findViewById(R.id.imgLayout);
        titles = findViewById(R.id.titles);
        search_button = findViewById(R.id.search_button);
        search = findViewById(R.id.search);
        camSearch = findViewById(R.id.camSearch);
        barSerch = findViewById(R.id.barSearch);
        pharmSearch = findViewById(R.id.pharmSearch);
        alarm = findViewById(R.id.alarm);
        pill = findViewById(R.id.pill);
        titles.setText("00님");
        leftImg.setImageResource(R.drawable.user);
        setting.setImageResource(R.drawable.logout);

        search.setFocusable(false);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outIntent = new Intent(FrontActivity.this, SearchActivity.class);
                startActivity(outIntent);
            }
        });

        camSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //outIntent = new Intent(FrontActivity.this, );
                //startActivity(outIntent);
            }
        });

        barSerch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outIntent = new Intent(FrontActivity.this, CustomScannerActivity.class);
                startActivity(outIntent);
            }
        });

        pharmSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:0,0?q=약국"));
                startActivity(intent);
            }
        });

        alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outIntent = new Intent(FrontActivity.this, alarm_list.class);
                startActivity(outIntent);
            }
        });

        pill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outIntent = new Intent(FrontActivity.this, med_list_see.class);
                startActivity(outIntent);
            }
        });
    }
}
