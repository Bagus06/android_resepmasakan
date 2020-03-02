package com.example.a31resep;


import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ListMinumanAdapter extends RecyclerView.Adapter<ListMinumanAdapter.CardViewViewHolder> {

    private Context context;
    private Integer[] imgId;
    private ArrayList<Minuman> listMinuman;
    private ListMinumanAdapter.OnClick onClick;

    public ListMinumanAdapter(Context context, ListMinumanAdapter.OnClick onClick) {
        this.context = context;
        this.onClick = onClick;
    }


    @NonNull
    @Override
    public ListMinumanAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_minuman, viewGroup, false);
        ListMinumanAdapter.CardViewViewHolder viewHolder = new ListMinumanAdapter.CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListMinumanAdapter.CardViewViewHolder cardViewViewHolder, int i) {

        Minuman p = getListMinuman().get(i);
        cardViewViewHolder.tampil(p, onClick);
//
//        cardViewViewHolder.btnShare.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
//
//            @Override
//            public void onItemClicked(View v, int position) {
//                Toast.makeText(context, "Share info tentang " + getListMeuble().get(position).getNama(), Toast.LENGTH_SHORT).show();
//            }
//        }));

    }

    @Override
    public int getItemCount() {
        return getListMinuman().size();
    }

    public ArrayList<Minuman> getListMinuman() {
        return listMinuman;
    }

    public void setListMinuman(ArrayList<Minuman> listMinuman) {
        this.listMinuman= listMinuman;
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto;
        TextView tvNama,  tv_Date;
        CardView btnDetail;
        Minuman minuman;


        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.img_view);
            tvNama = (TextView) itemView.findViewById(R.id.txt_nama);
            tv_Date = (TextView) itemView.findViewById(R.id.txt_date);
            btnDetail = (CardView) itemView.findViewById(R.id.itm_card);

        }

        public void tampil(final Minuman minuman, final OnClick OnItemClick) {

            Glide.with(context)
                    .load(minuman.getFoto())
                    .into(imgFoto);

            tvNama.setText(minuman.getNama());
            tv_Date.setText(minuman.getDate());

            btnDetail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    OnItemClick.onClick(minuman);

                }
            });

        }
    }

    public interface OnClick {
        void onClick(Object minuman);
    }
}
