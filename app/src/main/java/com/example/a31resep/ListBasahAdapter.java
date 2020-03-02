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

public class ListBasahAdapter extends RecyclerView.Adapter<ListBasahAdapter.CardViewViewHolder> {

    private Context context;
    private Integer[] imgId;
    private ArrayList<Basah> listBasah;
    private ListBasahAdapter.OnClick onClick;

    public ListBasahAdapter(Context context, ListBasahAdapter.OnClick onClick) {
        this.context = context;
        this.onClick = onClick;
    }


    @NonNull
    @Override
    public ListBasahAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_basah, viewGroup, false);
        ListBasahAdapter.CardViewViewHolder viewHolder = new ListBasahAdapter.CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListBasahAdapter.CardViewViewHolder cardViewViewHolder, int i) {

        Basah p = getListBasah().get(i);
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
        return getListBasah().size();
    }

    public ArrayList<Basah> getListBasah() {
        return listBasah;
    }

    public void setListBasah(ArrayList<Basah> listBasah) {
        this.listBasah = listBasah;
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto;
        TextView tvNama,  tv_Date;
        CardView btnDetail;
        Basah basah;


        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.img_view);
            tvNama = (TextView) itemView.findViewById(R.id.txt_nama);
            tv_Date = (TextView) itemView.findViewById(R.id.txt_date);
            btnDetail = (CardView) itemView.findViewById(R.id.itm_card);

        }

        public void tampil(final Basah basah, final OnClick OnItemClick) {

            Glide.with(context)
                    .load(basah.getFoto())
                    .into(imgFoto);

            tvNama.setText(basah.getNama());
            tv_Date.setText(basah.getDate());

            btnDetail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    OnItemClick.onClick(basah);

                }
            });

        }
    }

    public interface OnClick {
        void onClick(Object basah);
    }
}
