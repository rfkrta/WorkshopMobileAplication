package com.example.fragment;

//class untuk inisiasi recycler view

public class Chat {
    private String Nama;
    private String No_hp;
    private int Photos;

    public Chat(String nama, String no_hp, int photos) {
        Nama = nama;
        No_hp = no_hp;
        Photos = photos;
    }

//getter

    public String getNama() {
        return Nama;
    }

    public String getNo_hp() {
        return No_hp;
    }

    public int getPhotos() {
        return Photos;
    }


    //setter


    public void setNama(String nama) {
        Nama = nama;
    }

    public void setNo_hp(String no_hp) {
        No_hp = no_hp;
    }

    public void setPhotos(int photos) {
        Photos = photos;
    }
}
