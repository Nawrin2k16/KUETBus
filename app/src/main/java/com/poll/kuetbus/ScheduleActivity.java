package com.poll.kuetbus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ScheduleActivity extends AppCompatActivity {

    private Button button;
    public static TextView textView0;
    public static TextView textView1;
    public static TextView textView2;
    public static TextView textView3;
    public static TextView textView4;
    public static TextView textView5;
    public static TextView textView6;
    public static TextView textView7;

    public static TextView time0;
    public static TextView time1;
    public static TextView time2;
    public static TextView time3;
    public static TextView time4;
    public static TextView time5;
    public static TextView time6;
    public static TextView time7;


    public static String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        init();

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            string = bundle.getString("tag");
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Parsing parsing = new Parsing();
                Toast.makeText(ScheduleActivity.this, "Please, Wait", Toast.LENGTH_LONG).show();
                parsing.execute();

            }
        });
    }

    private void init() {
        button = findViewById(R.id.button_refresh);
        textView0 = findViewById(R.id.index0);
        textView1 = findViewById(R.id.index1);
        textView2 = findViewById(R.id.index2);
        textView3 = findViewById(R.id.index3);
        textView4 = findViewById(R.id.index4);
        textView5 = findViewById(R.id.index5);
        textView6 = findViewById(R.id.index6);
        textView7 = findViewById(R.id.index7);

        time0 = findViewById(R.id.time0);
        time1 = findViewById(R.id.time1);
        time2 = findViewById(R.id.time2);
        time3 = findViewById(R.id.time3);
        time4 = findViewById(R.id.time4);
        time5 = findViewById(R.id.time5);
        time6 = findViewById(R.id.time6);
        time7 = findViewById(R.id.time7);

    }


}
