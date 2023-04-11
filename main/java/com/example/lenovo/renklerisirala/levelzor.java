package com.example.lenovo.renklerisirala;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by LENOVO on 4.12.2017.
 */

public class levelzor extends AppCompatActivity {
    Button level1;
    Button level2;
    Button level3;
    Button level4;
    Button level5;
    Button level6;
    Button level7;
    Button level8;
    Button level9;
    Button level10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        level1 = (Button) findViewById(R.id.zor1);
        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intocan = new Intent(levelzor.this, oyun.class);
                startActivity(intocan);
            }
        });
        level2 = (Button) findViewById(R.id.zor2);
        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intocan = new Intent(levelzor.this, oyun.class);
                startActivity(intocan);
            }
        });
        level3 = (Button) findViewById(R.id.zor3);
        level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intocan = new Intent(levelzor.this, oyun.class);
                startActivity(intocan);
            }
        });
        level4 = (Button) findViewById(R.id.zor4);
        level4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intocan = new Intent(levelzor.this, oyun.class);
                startActivity(intocan);
            }
        });
        level5 = (Button) findViewById(R.id.zor5);
        level5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intocan = new Intent(levelzor.this, oyun.class);
                startActivity(intocan);
            }
        });
        level6 = (Button) findViewById(R.id.zor6);
        level6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intocan = new Intent(levelzor.this, oyun.class);
                startActivity(intocan);
            }
        });
        level7 = (Button) findViewById(R.id.zor7);
        level7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intocan = new Intent(levelzor.this, oyun.class);
                startActivity(intocan);
            }
        });
        level8 = (Button) findViewById(R.id.zor8);
        level8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intocan = new Intent(levelzor.this, oyun.class);
                startActivity(intocan);
            }
        });
        level9 = (Button) findViewById(R.id.zor9);
        level9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intocan = new Intent(levelzor.this, oyun.class);
                startActivity(intocan);
            }
        });
        level10 = (Button) findViewById(R.id.zor10);
        level10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intocan = new Intent(levelzor.this, oyun.class);
                startActivity(intocan);
            }
        });
    }
}
