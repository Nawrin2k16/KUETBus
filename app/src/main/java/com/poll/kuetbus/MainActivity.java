package com.poll.kuetbus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button morning;
    private Button noon;
    private Button afternoon;
    private Button night;
    private Button saturday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        morning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScheduleActivity.class);
                intent.putExtra("tag", "Morning");
                startActivity(intent);
            }
        });
        noon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScheduleActivity.class);
                intent.putExtra("tag", "Noon");
                startActivity(intent);
            }
        });
        afternoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScheduleActivity.class);
                intent.putExtra("tag", "Afternoon");
                startActivity(intent);
            }
        });
        night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScheduleActivity.class);
                intent.putExtra("tag", "Night");
                startActivity(intent);
            }
        });
        saturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScheduleActivity.class);
                intent.putExtra("tag", "Saturday");
                startActivity(intent);
            }
        });

    }

    private void init() {
        morning = findViewById(R.id.morning);
        noon = findViewById(R.id.noon);
        afternoon = findViewById(R.id.afternoon);
        night = findViewById(R.id.night);
        saturday = findViewById(R.id.saturday);
    }
}
