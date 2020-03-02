package com.example.a31resep;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;


public class BasahActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Basah> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basah);

        recyclerView = (RecyclerView) findViewById(R.id.rv_category);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(BasahResep.getListDAta());

        showRecyclerList();

        CardView btnInfo = (CardView) findViewById(R.id.btnInfo);
        btnInfo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(BasahActivity.this,InfoActivity.class);
                startActivity(i);
            }
        });
    }

    private void showRecyclerList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListBasahAdapter listBasahAdapter= new ListBasahAdapter(this,new ListBasahAdapter.OnClick() {
            @Override
            public void onClick(Object basah) {
                Basah basah1 = (Basah) basah;
                Intent intent = new Intent(BasahActivity.this, DetailBasahActivity.class);
                intent.putExtra("kunci", basah1);
                startActivity(intent);
            }
        });
        listBasahAdapter.setListBasah(list);
        recyclerView.setAdapter(listBasahAdapter);

    }
}