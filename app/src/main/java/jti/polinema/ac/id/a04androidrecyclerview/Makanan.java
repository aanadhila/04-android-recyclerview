package jti.polinema.ac.id.a04androidrecyclerview;

import android.os.Parcel;
import android.os.Parcelable;

public class Makanan implements Parcelable {
    private String nama;
    private String detail;
    private int photo;

    public Makanan(){

    }

    protected Makanan(Parcel in) {
        nama = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Makanan> CREATOR = new Creator<Makanan>() {
        @Override
        public Makanan createFromParcel(Parcel in) {
            return new Makanan(in);
        }

        @Override
        public Makanan[] newArray(int size) {
            return new Makanan[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(detail);
        parcel.writeInt(photo);
    }
}
