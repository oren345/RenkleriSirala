package com.example.lenovo.renklerisirala;

/**
 * Created by LENOVO on 3.12.2017.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class kolayortazor extends AppCompatActivity {
    Button kolay;
    Button orta;
    Button zor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        kolay=(Button)findViewById(R.id.kolay);
        kolay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intocan = new Intent(kolayortazor.this, levelkolay.class);
                startActivity(intocan);
            }
        });

        orta=(Button)findViewById(R.id.orta);
        orta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intocan = new Intent(kolayortazor.this, levelorta.class);
                startActivity(intocan);
            }
        });

        zor=(Button)findViewById(R.id.zor);
        zor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intocan = new Intent(kolayortazor.this, levelzor.class);
                startActivity(intocan);
            }
        });
    }
}


