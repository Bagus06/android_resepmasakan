package com.example.a31resep;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;


public class MakananActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Makanan> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);

        recyclerView = (RecyclerView) findViewById(R.id.rv_category);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(MakananaResep.getListDAta());

        showRecyclerList();

        CardView btnInfo = (CardView) findViewById(R.id.btnInfo);
        btnInfo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(MakananActivity.this,InfoActivity.class);
                startActivity(i);
            }
        });
    }

    private void showRecyclerList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListMakananAdapter listMakananAdapter= new ListMakananAdapter(this,new ListMakananAdapter.OnClick() {
            @Override
            public void onClick(Object makanan) {
                Makanan makanan1 = (Makanan) makanan;
                Intent intent = new Intent(MakananActivity.this, DetailMakananActivity.class);
                intent.putExtra("kunci", makanan1);
                startActivity(intent);
            }
        });
        listMakananAdapter.setListMakanan(list);
        recyclerView.setAdapter(listMakananAdapter);

    }
}