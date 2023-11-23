package com.hello;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {
    private ImageButton btnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnMove = findViewById(R.id.button_move_count);

        btnMove.setOnClickListener(view -> {
            Intent i = new Intent(home.this, FiboActivity.class);
            startActivity(i);
        });

        ImageButton buttonMovehallo = findViewById(R.id.button_move_hallo);
        buttonMovehallo.setOnClickListener(v -> {
            Intent intent = new Intent(home.this, MainActivity.class);
            startActivity(intent);
        });

        ImageButton buttonMoveToScroll = findViewById(R.id.button_move_to_other_scroll);
        buttonMoveToScroll.setOnClickListener(v -> {
            Intent intent = new Intent(home.this, scrollActivity.class);
            startActivity(intent);
        });

        ImageButton buttonMoveToOtherActivity = findViewById(R.id.buttonMoveToOtherActivity);
        buttonMoveToOtherActivity.setOnClickListener(v -> {
            Intent intent = new Intent(home.this, KeduaActivity.class);
            startActivity(intent);
        });

        ImageButton buttonMoveToalarm = findViewById(R.id.button_move_to_alarm);
        buttonMoveToalarm.setOnClickListener(v -> {
            Intent intent = new Intent(home.this, SetAlarm.class);
            startActivity(intent);
        });

        ImageButton buttonMoveToMap = findViewById(R.id.button_map);
        buttonMoveToMap.setOnClickListener(v -> {
            Intent intent = new Intent(home.this,MapActivity.class);
            startActivity(intent);
        });
    }
}