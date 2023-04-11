package com.example.lenovo.renklerisirala;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by LENOVO on 3.12.2017.
 */

public class levelkolay extends AppCompatActivity {
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
        setContentView(R.layout.levelsayfasi);

        level1=(Button)findViewById(R.id.kly1);
        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intocan = new Intent(levelkolay.this, oyun.class);
                startActivity(intocan);
                oyun butonlar = new oyun();
                butonlar.kolayButonlar(0);

            }
        });

        level2=(Button)findViewById(R.id.kly2);
        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intocan = new Intent(levelkolay.this, oyun.class);
                startActivity(intocan);
            }
        });

        level3=(Button)findViewById(R.id.kly3);
        level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intocan = new Intent(levelkolay.this, oyun.class);
                startActivity(intocan);
            }
        });

            level4=(Button)findViewById(R.id.kly4);
            level4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intocan = new Intent(levelkolay.this, oyun.class);
                    startActivity(intocan);
                }
            });

            level5=(Button)findViewById(R.id.kly5);
            level5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intocan = new Intent(levelkolay.this, oyun.class);
                    startActivity(intocan);
                }
            });

            level6=(Button)findViewById(R.id.kly6);
            level6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intocan = new Intent(levelkolay.this, oyun.class);
                    startActivity(intocan);
                }
            });

                level7=(Button)findViewById(R.id.kly7);
                level7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intocan = new Intent(levelkolay.this, oyun.class);
                        startActivity(intocan);
                    }
                });

                level8=(Button)findViewById(R.id.kly8
                );
                level8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intocan = new Intent(levelkolay.this, oyun.class);
                        startActivity(intocan);
                    }
                });

                level9=(Button)findViewById(R.id.kly9);
                level9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intocan = new Intent(levelkolay.this, oyun.class);
                        startActivity(intocan);
                    }
                });
                level10=(Button)findViewById(R.id.kly10);
                level10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intocan = new Intent(levelkolay.this, oyun.class);
                        startActivity(intocan);
                    }
                });
    }
}




