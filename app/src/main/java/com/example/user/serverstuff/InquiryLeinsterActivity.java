package com.example.user.serverstuff;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InquiryLeinsterActivity extends AppCompatActivity {

    private Button carlow, dublin, kildare, kilkenny, laois, longford, louth, meath, offaly, westmeath, wexford, wicklow;
    private static String county;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquiry_leinster);

        dublin = findViewById(R.id.Dublin);
        carlow = findViewById(R.id.Carlow);
        kildare = findViewById(R.id.Kildare);
        kilkenny = findViewById(R.id.Kilkenny);
        laois = findViewById(R.id.Laois);
        longford = findViewById(R.id.Longford);
        louth = findViewById(R.id.Louth);
        meath = findViewById(R.id.Meath);
        offaly = findViewById(R.id.Offaly);
        westmeath = findViewById(R.id.Westmeath);
        wexford = findViewById(R.id.Wexford);
        wicklow = findViewById(R.id.Wicklow);

        dublin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                dublin.setBackgroundResource(R.drawable.button_shape2);
                dublin.setTextColor(Color.parseColor("#E9E4F0"));

                setCounty("Dublin");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        carlow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                carlow.setBackgroundResource(R.drawable.button_shape2);
                carlow.setTextColor(Color.parseColor("#E9E4F0"));

                setCounty("Carlow");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        kildare.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                kildare.setBackgroundResource(R.drawable.button_shape2);
                kildare.setTextColor(Color.parseColor("#E9E4F0"));

                setCounty("Kildare");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        kilkenny.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                kilkenny.setBackgroundResource(R.drawable.button_shape2);
                kilkenny.setTextColor(Color.parseColor("#E9E4F0"));

                setCounty("Kilkenny");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        laois.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                laois.setBackgroundResource(R.drawable.button_shape2);
                laois.setTextColor(Color.parseColor("#E9E4F0"));

                setCounty("Laois");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        longford.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                longford.setBackgroundResource(R.drawable.button_shape2);
                longford.setTextColor(Color.parseColor("#E9E4F0"));

                setCounty("Longford");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        louth.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                louth.setBackgroundResource(R.drawable.button_shape2);
                louth.setTextColor(Color.parseColor("#E9E4F0"));

                setCounty("Louth");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        meath.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                meath.setBackgroundResource(R.drawable.button_shape2);
                meath.setTextColor(Color.parseColor("#E9E4F0"));

                setCounty("Meath");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        offaly.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                offaly.setBackgroundResource(R.drawable.button_shape2);
                offaly.setTextColor(Color.parseColor("#E9E4F0"));

                setCounty("Offaly");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        westmeath.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                westmeath.setBackgroundResource(R.drawable.button_shape2);
                westmeath.setTextColor(Color.parseColor("#E9E4F0"));

                setCounty("Westmeath");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        wexford.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                wexford.setBackgroundResource(R.drawable.button_shape2);
                wexford.setTextColor(Color.parseColor("#E9E4F0"));

                setCounty("Wexford");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        wicklow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                wicklow.setBackgroundResource(R.drawable.button_shape2);
                wicklow.setTextColor(Color.parseColor("#E9E4F0"));

                setCounty("Wicklow");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });
    }

    public void setCounty(String county){
        this.county = county;
    }

    public String getCounty(){
        return county;
    }

}
