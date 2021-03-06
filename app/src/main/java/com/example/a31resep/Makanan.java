package com.example.a31resep;

import android.os.Parcel;
import android.os.Parcelable;

public class Makanan implements Parcelable {
    private String nama, bahan, date, foto, cara;

    protected Makanan(Parcel in) {
        nama = in.readString();
        bahan = in.readString();
        date = in.readString();
        foto = in.readString();
        cara = in.readString();

    }

    public static final Parcelable.Creator<Makanan> CREATOR = new Parcelable.Creator<Makanan>() {
        @Override
        public Makanan createFromParcel(Parcel in) {
            return new Makanan(in);
        }

        @Override
        public Makanan[] newArray(int size) {
            return new Makanan[size];
        }
    };

    public Makanan() {

    }


    public String getNama() {

        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCara() {
        return cara;
    }

    public void setCara(String cara) {
        this.cara = cara;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.nama);
        parcel.writeString(this.bahan);
        parcel.writeString(this.date);
        parcel.writeString(this.foto);
        parcel.writeString(this.cara);
    }
}