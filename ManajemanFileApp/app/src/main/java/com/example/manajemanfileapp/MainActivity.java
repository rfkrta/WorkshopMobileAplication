package com.example.manajemanfileapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    private int STORAGE_PERMISSION_CODE = 23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText2);

        //button 1 untuk menampilkan activity list view

        Button butt1=(Button)findViewById(R.id.button7);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten1 = new Intent(MainActivity.this,MainSqlLite.class);
                startActivity(inten1);
            }
        });

    }
    public void next(View view){
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        startActivity(intent);

    }

    public void savePublic(View view) {
        //perizinan untuk akses penyimmpanan external
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, STORAGE_PERMISSION_CODE );
        String info = editText.getText().toString();
        File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        File myFile = new File(folder,"myData1.txt");//nama file
        writeData(myFile,info);
        editText.setText("");

    }

    public void savePrivate(View view ){
        String info = editText.getText().toString();
        File folder = getExternalFilesDir("rafi");//folder name
        File myFile = new File (folder, "myData2.txt");//filename
        writeData(myFile, info);
        editText.setText("");

    }

    private  void writeData(File myFile, String data){
        FileOutputStream fileOutputStream = null;
        try {
            System.out.println("TES");
            fileOutputStream =  new FileOutputStream (myFile);
            fileOutputStream.write(data.getBytes());
            Toast.makeText(this, "Done"+myFile.getAbsolutePath(), Toast.LENGTH_SHORT).show();
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            if (fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }


}