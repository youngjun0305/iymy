package com.example.oyjs2.iymy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class FrontActivity extends AppCompatActivity {

    ImageButton search, camSearch, barSerch, pharmSearch, alarm, pill;
    Intent intent, outIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

        intent = getIntent();

        search = findViewById(R.id.search);
        camSearch = findViewById(R.id.camSearch);
        barSerch = findViewById(R.id.barSearch);
        pharmSearch = findViewById(R.id.pharmSearch);
        alarm = findViewById(R.id.alarm);
        pill = findViewById(R.id.pill);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                outIntent = new Intent(FrontActivity.this,SearchActivity.class );
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

                outIntent = new Intent(FrontActivity.this, find_pharmacy.class);
                startActivity(outIntent);
            }
        });

        alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //outIntent = new Intent(FrontActivity.this, );
                //startActivity(outIntent);
            }
        });

        pill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //outIntent = new Intent(FrontActivity.this, );
                //startActivity(outIntent);
            }
        });
    }
}
