package com.myapplicationdev.android.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        // Get the intent so as to get the "things" inside the intent
        Intent i = getIntent();
        // Get the String array named "info" we passed in
        String[] info = i.getStringArrayExtra("info");
        // Get the TextView object
        TextView tv1 = (TextView) findViewById(R.id.tvQn1);
        TextView tv2 = (TextView) findViewById(R.id.tvQn2);
        TextView tv3 = (TextView) findViewById(R.id.tvQn3);
        TextView tv4 = (TextView) findViewById(R.id.tvQn4);
        // Display the name and age on the TextView
        tv1.setText(info[0]);
        tv2.setText(info[1]);
        tv3.setText(info[2]);
        tv4.setText(info[3]);

        Button btnClose = (Button) findViewById(R.id.buttonClose);
        btnClose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(summary.this,
                        MainActivity.class);
                startActivity(i);
            }
        });
    }
}
