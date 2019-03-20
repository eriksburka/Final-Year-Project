package com.example.user.serverstuff;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InquiryMunsterActivity extends AppCompatActivity {

    private Button cork, clare, kerry, waterford, limerick, tipperary;
    InquiryLeinsterActivity q = new InquiryLeinsterActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquiry_munster);

        cork = findViewById(R.id.Cork);
        clare = findViewById(R.id.Clare);
        kerry = findViewById(R.id.Kerry);
        waterford = findViewById(R.id.Waterford);
        limerick = findViewById(R.id.Limerick);
        tipperary = findViewById(R.id.Tipperary);

        cork.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                cork.setBackgroundResource(R.drawable.button_shape2);
                cork.setTextColor(Color.parseColor("#E9E4F0"));

                q.setCounty("Cork");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        clare.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                clare.setBackgroundResource(R.drawable.button_shape2);
                clare.setTextColor(Color.parseColor("#E9E4F0"));

                q.setCounty("Clare");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        kerry.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                kerry.setBackgroundResource(R.drawable.button_shape2);
                kerry.setTextColor(Color.parseColor("#E9E4F0"));

                q.setCounty("Kerry");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        waterford.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                waterford.setBackgroundResource(R.drawable.button_shape2);
                waterford.setTextColor(Color.parseColor("#E9E4F0"));

                q.setCounty("Waterford");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        limerick.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                limerick.setBackgroundResource(R.drawable.button_shape2);
                limerick.setTextColor(Color.parseColor("#E9E4F0"));

                q.setCounty("Limerick");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        tipperary.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                tipperary.setBackgroundResource(R.drawable.button_shape2);
                tipperary.setTextColor(Color.parseColor("#E9E4F0"));

                q.setCounty("Tipperary");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

    }
}
