package com.example.lenovo.renklerisirala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class girissayfasi extends AppCompatActivity {
   Button oyna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girissayfasi);
        oyna=(Button)findViewById(R.id.oyna);
        oyna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intocan = new Intent(girissayfasi.this, kolayortazor.class);
                startActivity(intocan);
            }
        });
    }
}
