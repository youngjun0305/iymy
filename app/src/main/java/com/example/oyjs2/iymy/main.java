package com.example.oyjs2.iymy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class main extends AppCompatActivity {

    ImageButton btnGoogle, btnKakao;
    Button btnGuest;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

        btnGoogle = findViewById(R.id.google);
        btnKakao = findViewById(R.id.kakao);
        btnGuest = findViewById(R.id.guest);

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(main.this, FrontActivity.class);
                startActivity(intent);
            }
        });

        btnKakao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(main.this, FrontActivity.class);
                startActivity(intent);
            }
        });

        btnGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(main.this, FrontActivity.class);
                startActivity(intent);
            }
        });
    }
}
