package com.example.intenapps;

import android.os.Parcel;
import android.os.Parcelable;

public class PersonList implements Parcelable  {

    private int imagess;
    private String nama;
    private String prodi;
    private int semester;
    private String wa;
    private String ig;

    public PersonList(int imagess, String nama, String prodi, int semester, String wa, String ig) {
        this.imagess = imagess;
        this.nama = nama;
        this.prodi = prodi;
        this.semester = semester;
        this.wa = wa;
        this.ig = ig;
    }

    public int getImagess() {
        return imagess;
    }

    public void setImagess(int imagess) {
        this.imagess = imagess;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getWa() {
        return wa;
    }

    public void setWa(String wa) {
        this.wa = wa;
    }

    public String getIg() {
        return ig;
    }

    public void setIg(String ig) {
        this.ig = ig;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.imagess);
        dest.writeString(this.nama);
        dest.writeString(this.prodi);
        dest.writeInt(this.semester);
        dest.writeString(this.wa);
        dest.writeString(this.ig);
    }

    protected PersonList(Parcel in) {

        this.imagess = in.readInt();
        this.nama = in.readString();
        this.prodi = in.readString();
        this.semester = in.readInt();
        this.wa = in.readString();
        this.ig = in.readString();
    }

    public void readFromParcel(Parcel source) {

        this.imagess = source.readInt();
        this.nama = source.readString();
        this.prodi = source.readString();
        this.semester = source.readInt();
        this.wa = source.readString();
        this.ig = source.readString();
    }

    public static final Creator<PersonList> CREATOR = new Creator<PersonList>() {
        @Override
        public PersonList createFromParcel(Parcel source) {
            return new PersonList(source);
        }

        @Override
        public PersonList[] newArray(int size) {
            return new PersonList[size];
        }
    };








}
