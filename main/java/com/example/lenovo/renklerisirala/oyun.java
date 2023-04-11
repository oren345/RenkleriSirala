package com.example.lenovo.renklerisirala;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by LENOVO on 4.12.2017.
 */

public class oyun extends AppCompatActivity {
    Button geri;
    Button ileri;
    Button donusum;
    Button ustsira1;
    Button ustsira2;
    Button ustsira3;
    Button ustsira4;
    Button altsira1;
    Button altsira2;
    Button altsira3;
    Button altsira4;
    Button altsira5;

    int zeytin1 = Color.parseColor("#67B46B");
    int zeytin2 = Color.parseColor("#AA09D5D");
    int zeytin3 = Color.parseColor("#898750");
    int zeytin4 = Color.parseColor("#727043");
    int zeytin5 = Color.parseColor("#5B5A35");
    int kahve1 = Color.parseColor("#894B4B");
    int kahve2 = Color.parseColor("#723E3E");
    int kahve3 = Color.parseColor("#5B3232");
    int kahve4 = Color.parseColor("#442525");
    int kahve5 = Color.parseColor("#2D1919");
    int turkuaz1 = Color.parseColor("#789C9A");
    int turkuaz2 = Color.parseColor("#698987");
    int turkuaz3 = Color.parseColor("#5A7573");
    int turkuaz4 = Color.parseColor("#4B6260");
    int turkuaz5 = Color.parseColor("#3C4E4D");
    int gri1 = Color.parseColor("#939EAD");
    int gri2 = Color.parseColor("#838C9A");
    int gri3 = Color.parseColor("#727B87");
    int gri4 = Color.parseColor("#626973");
    int gri5 = Color.parseColor("#525860");
    int krem1 = Color.parseColor("#FEE7F2");
    int krem2 = Color.parseColor("#E4CFCB");
    int krem3 = Color.parseColor("#CBB8B4");
    int krem4 = Color.parseColor("#B1A19E");
    int krem5 = Color.parseColor("#988A87");
    int mor1 = Color.parseColor("#8579CE");
    int mor2 = Color.parseColor("#776CB9");
    int mor3 = Color.parseColor("#6A60A4");
    int mor4 = Color.parseColor("#5D5490");
    int mor5 = Color.parseColor("#4F487B");


    int [] zeytin={zeytin1,zeytin2,zeytin3,zeytin4,zeytin5};
    int [] kahve={kahve1,kahve2,kahve3,kahve4,kahve5};
    int [] turkuaz={turkuaz1,turkuaz2,turkuaz3,turkuaz4,turkuaz5};
    int [] gri={gri1,gri2,gri3,gri4,gri5};
    int [] krem={krem1,krem2,krem3,krem4,krem5};
    int [] mor={mor1,mor2,mor3,mor4,mor5};

    @Override
    protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.oyunsayfasi);

            geri = (Button) findViewById(R.id.geri);
            geri.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intocan = new Intent(oyun.this, kolayortazor.class);
                    startActivity(intocan);
                }
            });
        public void kolayButonlar(int a){

            altsira2 = (Button) findViewById(R.id.altsira2);
            altsira3 = (Button) findViewById(R.id.altsira3);
            ustsira4 = (Button) findViewById(R.id.ustsira4);
            altsira5 = (Button) findViewById(R.id.altsira5);




            ustsira3 = (Button) findViewById(R.id.ustsira3);
            ustsira3.setBackgroundColor(zeytin[a]);
            ustsira3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ustsira1.setBackgroundColor(Color.TRANSPARENT);
                    altsira2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            altsira2.setBackgroundColor(zeytin[a]);
                        }
                    });
                    altsira3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            altsira3.setBackgroundColor(zeytin[a]);
                        }
                    });
                    altsira4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            altsira4.setBackgroundColor(zeytin[a]);
                        }
                    });
                    altsira5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            altsira5.setBackgroundColor(zeytin[a]);
                        }
                    });

                }
            });

            ustsira4 = (Button) findViewById(R.id.ustsira4);
            ustsira4.setBackgroundColor(zeytin[0]);
            ustsira4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ustsira1.setBackgroundColor(Color.TRANSPARENT);
                    altsira2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            altsira2.setBackgroundColor(zeytin[4]);
                        }
                    });
                    altsira3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            altsira3.setBackgroundColor(zeytin[3]);
                        }
                    });
                    altsira4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            altsira4.setBackgroundColor(zeytin[1]);
                        }
                    });
                    altsira5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            altsira5.setBackgroundColor(zeytin[2]);
                        }
                    });

                }
            });

            altsira1 = (Button) findViewById(R.id.altsira1);
            altsira1.setBackgroundColor(zeytin5);


        }

    }
}
