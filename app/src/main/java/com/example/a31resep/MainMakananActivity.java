package com.example.a31resep;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMakananActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_makanan);

        CardView btnKering = (CardView) findViewById(R.id.crdKering);
        btnKering.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(MainMakananActivity.this,MakananActivity.class);
                startActivity(i);
            }
        });

        CardView btnKuah = (CardView) findViewById(R.id.crdBasah);
        btnKuah.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(MainMakananActivity.this,BasahActivity.class);
                startActivity(i);
            }
        });

    }
}
