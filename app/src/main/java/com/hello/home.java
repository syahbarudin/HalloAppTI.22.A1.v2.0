package com.hello;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.cdMenu1).setOnClickListener(v -> {
            Intent helloworld = new Intent(home.this, MainActivity.class);
            startActivity(helloworld);
        });

        findViewById(R.id.cdMenu2).setOnClickListener(v -> {
            Intent toast = new Intent(home.this, FiboActivity.class);
            startActivity(toast);
        });

        findViewById(R.id.cdMenu3).setOnClickListener(v -> {
            Intent toast = new Intent(home.this, scrollActivity.class);
            startActivity(toast);
        });

        findViewById(R.id.cdMenu4).setOnClickListener(v -> {
            Intent toast = new Intent(home.this, SetAlarm.class);
            startActivity(toast);
        });

        findViewById(R.id.cdMenu5).setOnClickListener(v -> {
            Intent toast = new Intent(home.this, pertamaActivity.class);
            startActivity(toast);
        });

        findViewById(R.id.cdMenu6).setOnClickListener(v -> {
            Intent toast = new Intent(home.this, MapActivity.class);
            startActivity(toast);
        });

        findViewById(R.id.cdMenu7).setOnClickListener(v -> {
            Intent toast = new Intent(home.this, WebActivity.class);
            startActivity(toast);
        });

        findViewById(R.id.cdMenu8).setOnClickListener(v -> {
            Intent toast = new Intent(home.this, FragActivity.class);
            startActivity(toast);
        });
    }

}