package com.example.a31resep;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView btnInfo = (CardView) findViewById(R.id.crdInfo);
        btnInfo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this,InfoActivity.class);
                startActivity(i);
            }
        });

        CardView btnMakanan = (CardView) findViewById(R.id.crdMakanan);
        btnMakanan.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this,MainMakananActivity.class);
                startActivity(i);
            }
        });

        CardView btnMinuman = (CardView) findViewById(R.id.crdMinuman);
        btnMinuman.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this,MinumanActivity.class);
                startActivity(i);
            }
        });
    }
}


