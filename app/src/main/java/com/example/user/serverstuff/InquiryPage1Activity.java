package com.example.user.serverstuff;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class InquiryPage1Activity extends AppCompatActivity {

    private Button leinster, munster, connacht, ulster;
    private static String county;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquiry_page1);

        leinster = findViewById(R.id.County1);
        munster = findViewById(R.id.munster);
        connacht = findViewById(R.id.connacht);
        ulster = findViewById(R.id.ulster);

        leinster.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                leinster.setBackgroundResource(R.drawable.button_shape2);
                leinster.setTextColor(Color.parseColor("#E9E4F0"));

                Intent i = new Intent(getApplicationContext(),InquiryLeinsterActivity.class);
                startActivity(i);

            }
        });

        munster.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                munster.setBackgroundResource(R.drawable.button_shape2);
                munster.setTextColor(Color.parseColor("#E9E4F0"));

                Intent i = new Intent(getApplicationContext(),InquiryMunsterActivity.class);
                startActivity(i);

            }
        });

        connacht.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                connacht.setBackgroundResource(R.drawable.button_shape2);
                connacht.setTextColor(Color.parseColor("#E9E4F0"));

                Intent i = new Intent(getApplicationContext(),InquiryConnachtActivity.class);
                startActivity(i);

            }
        });

        ulster.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                ulster.setBackgroundResource(R.drawable.button_shape2);
                ulster.setTextColor(Color.parseColor("#E9E4F0"));

                Intent i = new Intent(getApplicationContext(),InquiryUlsterActivity.class);
                startActivity(i);
            }
        });
    }

}