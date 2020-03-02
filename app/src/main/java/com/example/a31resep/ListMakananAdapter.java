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

public class ListMakananAdapter extends RecyclerView.Adapter<ListMakananAdapter.CardViewViewHolder> {

    private Context context;
    private Integer[] imgId;
    private ArrayList<Makanan> listMakanan;
    private ListMakananAdapter.OnClick onClick;

    public ListMakananAdapter(Context context, ListMakananAdapter.OnClick onClick) {
        this.context = context;
        this.onClick = onClick;
    }


    @NonNull
    @Override
    public ListMakananAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_makanan, viewGroup, false);
        ListMakananAdapter.CardViewViewHolder viewHolder = new ListMakananAdapter.CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListMakananAdapter.CardViewViewHolder cardViewViewHolder, int i) {

        Makanan p = getListMakanan().get(i);
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
        return getListMakanan().size();
    }

    public ArrayList<Makanan> getListMakanan() {
        return listMakanan;
    }

    public void setListMakanan(ArrayList<Makanan> listMakanan) {
        this.listMakanan= listMakanan;
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto;
        TextView tvNama,  tv_Date;
        CardView btnDetail;
        Makanan makanan;


        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.img_view);
            tvNama = (TextView) itemView.findViewById(R.id.txt_nama);
            tv_Date = (TextView) itemView.findViewById(R.id.txt_date);
            btnDetail = (CardView) itemView.findViewById(R.id.itm_card);

        }

        public void tampil(final Makanan makanan, final OnClick OnItemClick) {

            Glide.with(context)
                    .load(makanan.getFoto())
                    .into(imgFoto);

            tvNama.setText(makanan.getNama());
            tv_Date.setText(makanan.getDate());

            btnDetail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    OnItemClick.onClick(makanan);

                }
            });

        }
    }

    public interface OnClick {
        void onClick(Object makanan);
    }
}
