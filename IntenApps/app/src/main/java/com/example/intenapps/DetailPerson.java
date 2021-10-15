package com.example.intenapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailPerson extends AppCompatActivity {

    TextView tvNama, tvProdi, tvSemester, tvWa, tvIg;
    ImageView ivImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_person);

        Intent intents = getIntent();


        //set item pada front end

        ivImg = findViewById(R.id.imgs);
        tvNama = findViewById(R.id.dtlnama);
        tvProdi = findViewById(R.id.dtlprodi);
        tvSemester = findViewById(R.id.dtlsemester);
        tvIg = findViewById(R.id.dtlig);
        tvWa = findViewById(R.id.dtlwa);

        //call value dari class anime list sesuai kodenya dan fungsinya
        PersonList persons = intents.getParcelableExtra("PERSON");
        ivImg.setImageResource(persons.getImagess());
        tvNama.setText(persons.getNama());
        tvProdi.setText(persons.getProdi());
        tvSemester.setText(String.valueOf(persons.getSemester()));

        tvWa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlig = persons.getWa();
                Intent intentig = new Intent(Intent.ACTION_VIEW, Uri.parse(urlig));
                startActivity(intentig);
            }
        });

        tvIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlig = persons.getIg();
                Intent intentig = new Intent(Intent.ACTION_VIEW, Uri.parse(urlig));
                startActivity(intentig);
            }
        });


    }


}