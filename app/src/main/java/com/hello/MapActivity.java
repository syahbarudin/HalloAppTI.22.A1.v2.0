package com.hello;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MapActivity extends AppCompatActivity {

    private EditText etAwal, etTujuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        etAwal = findViewById(R.id.etAwal);
        etTujuan = findViewById(R.id.etTujuan);
        ImageButton btnJalur = findViewById(R.id.btnJalur);

        btnJalur.setOnClickListener(view -> {

            String asal = etAwal.getText().toString();
            String tujuan = etTujuan.getText().toString();

            DisplayJalur(asal, tujuan);
        });
    }

    private void DisplayJalur(String asal, String tujuan) {
        try {
            Uri uri = Uri.parse("https://www.google.co.in/maps/dir/" + asal + "/" + tujuan + "?entry=ttu");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setPackage("com.google.android.apps.maps");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }catch (ActivityNotFoundException e){
            Uri uri = Uri.parse("https://www.google.com/maps");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }

    }
}