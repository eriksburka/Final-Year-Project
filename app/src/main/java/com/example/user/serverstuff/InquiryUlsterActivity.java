package com.example.user.serverstuff;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InquiryUlsterActivity extends AppCompatActivity {

    private String[] ulsterList = {"Cavan" , "Monaghan", "Donegal" , "Antrim" , "Down" , "Armagh" , "Derry" , "Fermanagh" , "Tyrone"};
    private Button cavan, monaghan, donegal, antrim, down, armagh, derry, fermanagh, tyrone;
    InquiryLeinsterActivity q = new InquiryLeinsterActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquiry_ulster);

        cavan = findViewById(R.id.Cavan);
        monaghan = findViewById(R.id.Monaghan);
        donegal = findViewById(R.id.Donegal);
        antrim = findViewById(R.id.Antrim);
        down = findViewById(R.id.Down);
        armagh = findViewById(R.id.Armagh);
        derry = findViewById(R.id.Derry);
        fermanagh = findViewById(R.id.Fermanagh);
        tyrone = findViewById(R.id.Tyrone);

        cavan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                cavan.setBackgroundResource(R.drawable.button_shape2);
                cavan.setTextColor(Color.parseColor("#E9E4F0"));

                q.setCounty("Cavan");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        monaghan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                monaghan.setBackgroundResource(R.drawable.button_shape2);
                monaghan.setTextColor(Color.parseColor("#E9E4F0"));

                q.setCounty("Monaghan");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        donegal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                donegal.setBackgroundResource(R.drawable.button_shape2);
                donegal.setTextColor(Color.parseColor("#E9E4F0"));

                q.setCounty("Donegal");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        antrim.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                antrim.setBackgroundResource(R.drawable.button_shape2);
                antrim.setTextColor(Color.parseColor("#E9E4F0"));

                q.setCounty("Cork");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        down.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                down.setBackgroundResource(R.drawable.button_shape2);
                down.setTextColor(Color.parseColor("#E9E4F0"));

                q.setCounty("Down");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        armagh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                armagh.setBackgroundResource(R.drawable.button_shape2);
                armagh.setTextColor(Color.parseColor("#E9E4F0"));

                q.setCounty("Armagh");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        derry.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                derry.setBackgroundResource(R.drawable.button_shape2);
                derry.setTextColor(Color.parseColor("#E9E4F0"));

                q.setCounty("Derry");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        fermanagh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                fermanagh.setBackgroundResource(R.drawable.button_shape2);
                fermanagh.setTextColor(Color.parseColor("#E9E4F0"));

                q.setCounty("Fermanagh");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

        tyrone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                tyrone.setBackgroundResource(R.drawable.button_shape2);
                tyrone.setTextColor(Color.parseColor("#E9E4F0"));

                q.setCounty("Tyrone");

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

    }
}
