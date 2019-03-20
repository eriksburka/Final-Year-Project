package com.example.user.serverstuff;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InquiryConnachtActivity extends AppCompatActivity {

    private Button galway, leitrim, mayo, roscommon, sligo;
    InquiryLeinsterActivity q = new InquiryLeinsterActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquiry_connacht);

        galway = findViewById(R.id.Galway);
        leitrim = findViewById(R.id.Leitrim);
        mayo = findViewById(R.id.Mayo);
        roscommon = findViewById(R.id.Roscommon);
        sligo = findViewById(R.id.Sligo);

        galway.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                galway.setBackgroundResource(R.drawable.button_shape2);
                galway.setTextColor(Color.parseColor("#E9E4F0"));

                q.setCounty("Galway");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        leitrim.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                leitrim.setBackgroundResource(R.drawable.button_shape2);
                leitrim.setTextColor(Color.parseColor("#E9E4F0"));

                q.setCounty("Leitrim");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        mayo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                mayo.setBackgroundResource(R.drawable.button_shape2);
                mayo.setTextColor(Color.parseColor("#E9E4F0"));

                q.setCounty("Mayo");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        roscommon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                roscommon.setBackgroundResource(R.drawable.button_shape2);
                roscommon.setTextColor(Color.parseColor("#E9E4F0"));

                q.setCounty("Roscommon");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        sligo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                sligo.setBackgroundResource(R.drawable.button_shape2);
                sligo.setTextColor(Color.parseColor("#E9E4F0"));

                q.setCounty("Sligo");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });
    }

}
