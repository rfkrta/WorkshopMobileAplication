package com.example.intenapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterRecycler adaptor;
    ArrayList<PersonList> persons = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //berfungsi untuk memanggil fungsi
        recyclerViewSetting();
        addperson();


    }

    //berisikan value untuk link list
    private void addperson() {
          persons.add(new PersonList(R.drawable.logora,"Rafi Karta","TIF",3,"https://wa.me/6282147393380","https://www.instagram.com/rfkrta/"));
        persons.add(new PersonList(R.drawable.wil,"Wildan Asyrof","TIF",3,"https://wa.me/6282228905435","https://www.instagram.com/thisiswasyrof/"));
        persons.add(new PersonList(R.drawable.logo2,"Yuliana Dewi","TIF",3,"https://wa.me/6282228905435","https://www.instagram.com/yln.dewi/"));
       persons.add(new PersonList(R.drawable.logoboi,"Boy Dhimas","TIF",3,"https://wa.me/6285231143337","https://www.instagram.com/boydymas/"));
        persons.add(new PersonList(R.drawable.logoaciong,"Adam Hafizh","TIF",3,"https://wa.me/6287826562322","https://www.instagram.com/_cungkrng14/"));
      persons.add(new PersonList(R.drawable.ripez,"Rifqi Vandhika","TIF",3,"https://wa.me/6282228905435","https://www.instagram.com/rippezz/"));
        persons.add(new PersonList(R.drawable.nisa,"Khoirunnisa'" ,"TIF",3,"https://wa.me/6282228905435","https://www.instagram.com/khoirunnisa117/"));
       persons.add(new PersonList(R.drawable.antoin,"Anton Sebrianto","TIF",3,"https://wa.me/6282228905435","https://www.instagram.com/_antonsebrianto/"));

    }

    private void recyclerViewSetting() {

        recyclerView = findViewById(R.id.recyclerview); //set untuk recycler view dalam xml
        adaptor = new AdapterRecycler(persons); //recyclerview adapter untuk object di atas
        recyclerView.setAdapter(adaptor); //set adapter
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this)); //set layout linear
    }


}