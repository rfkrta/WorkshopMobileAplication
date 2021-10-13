package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button 1 untuk menampilkan activity FragmentAct

        Button butt1=(Button)findViewById(R.id.firstFragment);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten1 = new Intent(MainActivity.this,FragmentAct.class);
                startActivity(inten1);
            }
        });

       //button 1 untuk menampilkan activity FragmentAct

        Button butt2=(Button)findViewById(R.id.bottomNavigation);
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten1 = new Intent(MainActivity.this,BottomNavAct.class);
                startActivity(inten1);
            }
        });
    }
}