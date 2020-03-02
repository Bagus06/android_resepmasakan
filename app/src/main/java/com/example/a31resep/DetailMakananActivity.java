package com.example.a31resep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailMakananActivity extends AppCompatActivity {

    ImageView fotoku;
    TextView nama, bahan, date, cara;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        Makanan diterima = getIntent().getParcelableExtra("kunci");

        fotoku = (ImageView) findViewById(R.id.img_view);
        nama = (TextView) findViewById(R.id.txt_nama);
        bahan = (TextView) findViewById(R.id.txt_bahan);
        cara = (TextView) findViewById(R.id.txt_cara);
        date = (TextView) findViewById(R.id.txt_update);

        Glide.with(this).load(diterima.getFoto()).into(fotoku);

        nama.setText(diterima.getNama());
        bahan.setText(diterima.getBahan());
        cara.setText(diterima.getCara());
        date.setText(diterima.getDate());


    }
}
