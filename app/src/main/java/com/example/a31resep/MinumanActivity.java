package com.example.a31resep;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;


public class MinumanActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Minuman> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minuman);

        recyclerView = (RecyclerView) findViewById(R.id.rv_category);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(MinumanResep.getListDAta());

        showRecyclerList();

        CardView btnInfo = (CardView) findViewById(R.id.btnInfo);
        btnInfo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(MinumanActivity.this,InfoActivity.class);
                startActivity(i);
            }
        });
    }

    private void showRecyclerList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListMinumanAdapter listMinumanAdapter= new ListMinumanAdapter(this,new ListMinumanAdapter.OnClick() {
            @Override
            public void onClick(Object minuman) {
                Minuman minuman1 = (Minuman) minuman;
                Intent intent = new Intent(MinumanActivity.this, DetailMinumanActivity.class);
                intent.putExtra("kunci", minuman1);
                startActivity(intent);
            }
        });
        listMinumanAdapter.setListMinuman(list);
        recyclerView.setAdapter(listMinumanAdapter);

    }
}