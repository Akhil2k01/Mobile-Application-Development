package com.example.unitconverter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView cv_tmp;
    CardView cv_weight;
    CardView cv_length;
    CardView cv_speed;
    CardView cv_volume;
    CardView cv_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cv_tmp = findViewById(R.id.cv_tmp);
        cv_weight = findViewById(R.id.cv_weight);
        cv_length = findViewById(R.id.cv_length);
        cv_speed = findViewById(R.id.cv_speed);
        cv_volume = findViewById(R.id.cv_Volume);
        cv_time = findViewById(R.id.cv_time);
        cv_tmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, temp_cal.class));
            }
        });
        cv_weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, weight_cal.class));
            }
        });
        cv_length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, length_cal.class));
            }
        });
        cv_speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, speed_cal.class));
            }
        });
        cv_volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, volume_cal.class));
            }
        });
        cv_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, time_cal.class));
            }
        });



    }
}