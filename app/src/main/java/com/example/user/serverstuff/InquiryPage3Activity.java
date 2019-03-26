package com.example.user.serverstuff;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class InquiryPage3Activity extends AppCompatActivity{

    private Button sex1;
    private Button sex2;
    private Button sex3;
    private Button age1;
    private Button age2;
    private Button age3;
    private Button irish1;
    private Button irish2;
    private Button irish3;
    private Button cultural1;
    private Button cultural2;
    private Button cultural3;
    private Button student1;
    private Button student2;
    private Button student3;
    private Button modern1;
    private Button modern2;
    private Button modern3;
    private Button employment1;
    private Button employment2;
    private Button employment3;
    private Button house1;
    private Button house2;
    private Button house3;
    private Button broadband1;
    private Button broadband2;
    private Button broadband3;
    private Button submitButton;

    private static String sex;
    private static String age;
    private static String irish;
    private static String cultural;
    private static String student;
    private static String modern;
    private static String employment;
    private static String house;
    private static String broadband;
    private static ArrayList<String> testArray = new ArrayList<>();
    private static ArrayList<String> testArray2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquiry_page3);

        sex1 = findViewById(R.id.SexButton1);
        sex2 = findViewById(R.id.sexButton2);
        sex3 = findViewById(R.id.sexButton3);
        age1 = findViewById(R.id.AgeButton1);
        age2 = findViewById(R.id.AgeButton2);
        age3 = findViewById(R.id.AgeButton3);
        irish1 = findViewById(R.id.IrishButton1);
        irish2 = findViewById(R.id.IrishButton2);
        irish3 = findViewById(R.id.IrishButton3);
        cultural1 = findViewById(R.id.CulturalButton1);
        cultural2 = findViewById(R.id.CulturalButton2);
        cultural3 = findViewById(R.id.CulturalButton3);
        student1 = findViewById(R.id.studentButton1);
        student2 = findViewById(R.id.studentButton2);
        student3 = findViewById(R.id.studentButton3);
        modern1 = findViewById(R.id.modernButton1);
        modern2 = findViewById(R.id.modernButton2);
        modern3 = findViewById(R.id.modernButton3);
        employment1 = findViewById(R.id.unemploymentButton1);
        employment2 = findViewById(R.id.unemploymentButton2);
        employment3 = findViewById(R.id.unemploymentButton3);
        house1 = findViewById(R.id.houseButton1);
        house2 = findViewById(R.id.houseButton2);
        house3 = findViewById(R.id.houseButton3);
        broadband1 = findViewById(R.id.broadbandButton1);
        broadband2 = findViewById(R.id.broadbandButton2);
        broadband3 = findViewById(R.id.broadbandButton3);
        submitButton = findViewById(R.id.submitButton);

        sex1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setSex(" (`T1_1AGETM`>`T1_1AGETF`)");

                if(sex1.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    sex1.setBackgroundResource(R.drawable.button_shape2);
                    sex1.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    sex1.setBackgroundResource(R.drawable.button_shape);
                    sex1.setTextColor(Color.parseColor("#4286f4"));
                }

                if(sex2.getCurrentTextColor() == Color.parseColor("#E9E4F0") || sex3.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    sex2.setBackgroundResource(R.drawable.button_shape);
                    sex2.setTextColor(Color.parseColor("#4286f4"));
                    sex3.setBackgroundResource(R.drawable.button_shape);
                    sex3.setTextColor(Color.parseColor("#4286f4"));
                }

            }
        });

        sex2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setSex(" (`T1_1AGETM`<`T1_1AGETF`)");

                if(sex2.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    sex2.setBackgroundResource(R.drawable.button_shape2);
                    sex2.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    sex2.setBackgroundResource(R.drawable.button_shape);
                    sex2.setTextColor(Color.parseColor("#4286f4"));
                }

                if(sex1.getCurrentTextColor() == Color.parseColor("#E9E4F0") || sex3.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    sex1.setBackgroundResource(R.drawable.button_shape);
                    sex1.setTextColor(Color.parseColor("#4286f4"));
                    sex3.setBackgroundResource(R.drawable.button_shape);
                    sex3.setTextColor(Color.parseColor("#4286f4"));
                }
            }
        });

        sex3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setSex("");

                if(sex3.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    sex3.setBackgroundResource(R.drawable.button_shape2);
                    sex3.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    sex3.setBackgroundResource(R.drawable.button_shape);
                    sex3.setTextColor(Color.parseColor("#4286f4"));
                }

                if(sex2.getCurrentTextColor() == Color.parseColor("#E9E4F0") || sex1.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    sex2.setBackgroundResource(R.drawable.button_shape);
                    sex2.setTextColor(Color.parseColor("#4286f4"));
                    sex1.setBackgroundResource(R.drawable.button_shape);
                    sex1.setTextColor(Color.parseColor("#4286f4"));
                }
            }
        });

        age1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setAge("(((`T1_1AGE30_34T`+`T1_1AGE35_39T`+`T1_1AGE40_44T`+`T1_1AGE45_49T`+`T1_1AGE50_54T`+`T1_1AGE55_59T`+`T1_1AGE60_64T`+`T1_1AGE65_69T`+`T1_1AGE70_74T`+`T1_1AGE75_79T`+`T1_1AGE80_84T`+`T1_1AGEGE_85T`)/(`T1_1AGETT`)) < 0.5)");

                if(age1.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    age1.setBackgroundResource(R.drawable.button_shape2);
                    age1.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    age1.setBackgroundResource(R.drawable.button_shape);
                    age1.setTextColor(Color.parseColor("#4286f4"));
                }

                if(age2.getCurrentTextColor() == Color.parseColor("#E9E4F0") || age3.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    age2.setBackgroundResource(R.drawable.button_shape);
                    age2.setTextColor(Color.parseColor("#4286f4"));
                    age3.setBackgroundResource(R.drawable.button_shape);
                    age3.setTextColor(Color.parseColor("#4286f4"));
                }

            }
        });

        age2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setAge("(((`T1_1AGE30_34T`+`T1_1AGE35_39T`+`T1_1AGE40_44T`+`T1_1AGE45_49T`+`T1_1AGE50_54T`+`T1_1AGE55_59T`+`T1_1AGE60_64T`+`T1_1AGE65_69T`+`T1_1AGE70_74T`+`T1_1AGE75_79T`+`T1_1AGE80_84T`+`T1_1AGEGE_85T`)/(`T1_1AGETT`)) > 0.5)");

                if(age2.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    age2.setBackgroundResource(R.drawable.button_shape2);
                    age2.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    age2.setBackgroundResource(R.drawable.button_shape);
                    age2.setTextColor(Color.parseColor("#4286f4"));
                }

                if(age1.getCurrentTextColor() == Color.parseColor("#E9E4F0") || age3.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    age1.setBackgroundResource(R.drawable.button_shape);
                    age1.setTextColor(Color.parseColor("#4286f4"));
                    age3.setBackgroundResource(R.drawable.button_shape);
                    age3.setTextColor(Color.parseColor("#4286f4"));
                }
            }
        });

        age3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setAge("");

                if(age3.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    age3.setBackgroundResource(R.drawable.button_shape2);
                    age3.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    age3.setBackgroundResource(R.drawable.button_shape);
                    age3.setTextColor(Color.parseColor("#4286f4"));
                }

                if(age2.getCurrentTextColor() == Color.parseColor("#E9E4F0") || age1.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    age2.setBackgroundResource(R.drawable.button_shape);
                    age2.setTextColor(Color.parseColor("#4286f4"));
                    age1.setBackgroundResource(R.drawable.button_shape);
                    age1.setTextColor(Color.parseColor("#4286f4"));
                }
            }
        });

        irish1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setIrish("(((`T3_2DOEST`+`T3_2WOEST`+`T3_2LOOEST`)/`T1_1AGETT`)>0.25)");

                if(irish1.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    irish1.setBackgroundResource(R.drawable.button_shape2);
                    irish1.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    irish1.setBackgroundResource(R.drawable.button_shape);
                    irish1.setTextColor(Color.parseColor("#4286f4"));
                }

                if(irish2.getCurrentTextColor() == Color.parseColor("#E9E4F0") || irish3.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    irish2.setBackgroundResource(R.drawable.button_shape);
                    irish2.setTextColor(Color.parseColor("#4286f4"));
                    irish3.setBackgroundResource(R.drawable.button_shape);
                    irish3.setTextColor(Color.parseColor("#4286f4"));
                }

            }
        });

        irish2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setIrish("(((`T3_2DOEST`+`T3_2WOEST`+`T3_2LOOEST`)/`T1_1AGETT`)<0.25)");

                if(irish2.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    irish2.setBackgroundResource(R.drawable.button_shape2);
                    irish2.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    irish2.setBackgroundResource(R.drawable.button_shape);
                    irish2.setTextColor(Color.parseColor("#4286f4"));
                }

                if(irish1.getCurrentTextColor() == Color.parseColor("#E9E4F0") || irish3.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    irish1.setBackgroundResource(R.drawable.button_shape);
                    irish1.setTextColor(Color.parseColor("#4286f4"));
                    irish3.setBackgroundResource(R.drawable.button_shape);
                    irish3.setTextColor(Color.parseColor("#4286f4"));
                }
            }
        });

        irish3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setIrish("");

                if(irish3.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    irish3.setBackgroundResource(R.drawable.button_shape2);
                    irish3.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    irish3.setBackgroundResource(R.drawable.button_shape);
                    irish3.setTextColor(Color.parseColor("#4286f4"));
                }

                if(irish2.getCurrentTextColor() == Color.parseColor("#E9E4F0") || irish1.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    irish2.setBackgroundResource(R.drawable.button_shape);
                    irish2.setTextColor(Color.parseColor("#4286f4"));
                    irish1.setBackgroundResource(R.drawable.button_shape);
                    irish1.setTextColor(Color.parseColor("#4286f4"));
                }
            }
        });


        cultural1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setCultural("((`T2_2WI`/`T1_1AGETT`)<0.8)");

                if(cultural1.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    cultural1.setBackgroundResource(R.drawable.button_shape2);
                    cultural1.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    cultural1.setBackgroundResource(R.drawable.button_shape);
                    cultural1.setTextColor(Color.parseColor("#4286f4"));
                }

                if(cultural2.getCurrentTextColor() == Color.parseColor("#E9E4F0") || cultural3.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    cultural2.setBackgroundResource(R.drawable.button_shape);
                    cultural2.setTextColor(Color.parseColor("#4286f4"));
                    cultural3.setBackgroundResource(R.drawable.button_shape);
                    cultural3.setTextColor(Color.parseColor("#4286f4"));
                }

            }
        });

        cultural2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setCultural("((`T2_2WI`/`T1_1AGETT`)>0.8)");

                if(cultural2.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    cultural2.setBackgroundResource(R.drawable.button_shape2);
                    cultural2.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    cultural2.setBackgroundResource(R.drawable.button_shape);
                    cultural2.setTextColor(Color.parseColor("#4286f4"));
                }

                if(cultural1.getCurrentTextColor() == Color.parseColor("#E9E4F0") || cultural3.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    cultural1.setBackgroundResource(R.drawable.button_shape);
                    cultural1.setTextColor(Color.parseColor("#4286f4"));
                    cultural3.setBackgroundResource(R.drawable.button_shape);
                    cultural3.setTextColor(Color.parseColor("#4286f4"));
                }
            }
        });

        cultural3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setCultural("");

                if(cultural3.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    cultural3.setBackgroundResource(R.drawable.button_shape2);
                    cultural3.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    cultural3.setBackgroundResource(R.drawable.button_shape);
                    cultural3.setTextColor(Color.parseColor("#4286f4"));
                }

                if(cultural2.getCurrentTextColor() == Color.parseColor("#E9E4F0") || cultural1.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    cultural2.setBackgroundResource(R.drawable.button_shape);
                    cultural2.setTextColor(Color.parseColor("#4286f4"));
                    cultural1.setBackgroundResource(R.drawable.button_shape);
                    cultural1.setTextColor(Color.parseColor("#4286f4"));
                }
            }
        });

        student1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setStudent("((`T8_1_ST`/`T1_1AGETT`)>0.15)");

                if(student1.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    student1.setBackgroundResource(R.drawable.button_shape2);
                    student1.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    student1.setBackgroundResource(R.drawable.button_shape);
                    student1.setTextColor(Color.parseColor("#4286f4"));
                }

                if(student2.getCurrentTextColor() == Color.parseColor("#E9E4F0") || student3.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    student2.setBackgroundResource(R.drawable.button_shape);
                    student2.setTextColor(Color.parseColor("#4286f4"));
                    student3.setBackgroundResource(R.drawable.button_shape);
                    student3.setTextColor(Color.parseColor("#4286f4"));
                }

            }
        });

        student2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setStudent("((`T8_1_ST`/`T1_1AGETT`)<0.15)");

                if(student2.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    student2.setBackgroundResource(R.drawable.button_shape2);
                    student2.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    student2.setBackgroundResource(R.drawable.button_shape);
                    student2.setTextColor(Color.parseColor("#4286f4"));
                }

                if(student1.getCurrentTextColor() == Color.parseColor("#E9E4F0") || student3.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    student1.setBackgroundResource(R.drawable.button_shape);
                    student1.setTextColor(Color.parseColor("#4286f4"));
                    student3.setBackgroundResource(R.drawable.button_shape);
                    student3.setTextColor(Color.parseColor("#4286f4"));
                }
            }
        });

        student3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setStudent("");

                if(student3.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    student3.setBackgroundResource(R.drawable.button_shape2);
                    student3.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    student3.setBackgroundResource(R.drawable.button_shape);
                    student3.setTextColor(Color.parseColor("#4286f4"));
                }

                if(student2.getCurrentTextColor() == Color.parseColor("#E9E4F0") || student1.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    student2.setBackgroundResource(R.drawable.button_shape);
                    student2.setTextColor(Color.parseColor("#4286f4"));
                    student1.setBackgroundResource(R.drawable.button_shape);
                    student1.setTextColor(Color.parseColor("#4286f4"));
                }
            }
        });

        modern1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setModern("((`T6_2_11LP`/`T1_1AGETT`)>0.05)");

                if(modern1.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    modern1.setBackgroundResource(R.drawable.button_shape2);
                    modern1.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    modern1.setBackgroundResource(R.drawable.button_shape);
                    modern1.setTextColor(Color.parseColor("#4286f4"));
                }

                if(modern2.getCurrentTextColor() == Color.parseColor("#E9E4F0") || modern3.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    modern2.setBackgroundResource(R.drawable.button_shape);
                    modern2.setTextColor(Color.parseColor("#4286f4"));
                    modern3.setBackgroundResource(R.drawable.button_shape);
                    modern3.setTextColor(Color.parseColor("#4286f4"));
                }

            }
        });

        modern2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setModern("((`T6_2_11LP`/`T1_1AGETT`)<0.05)");

                if(modern2.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    modern2.setBackgroundResource(R.drawable.button_shape2);
                    modern2.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    modern2.setBackgroundResource(R.drawable.button_shape);
                    modern2.setTextColor(Color.parseColor("#4286f4"));
                }

                if(modern1.getCurrentTextColor() == Color.parseColor("#E9E4F0") || modern3.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    modern1.setBackgroundResource(R.drawable.button_shape);
                    modern1.setTextColor(Color.parseColor("#4286f4"));
                    modern3.setBackgroundResource(R.drawable.button_shape);
                    modern3.setTextColor(Color.parseColor("#4286f4"));
                }
            }
        });

        modern3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setModern("");

                if(modern3.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    modern3.setBackgroundResource(R.drawable.button_shape2);
                    modern3.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    modern3.setBackgroundResource(R.drawable.button_shape);
                    modern3.setTextColor(Color.parseColor("#4286f4"));
                }

                if(modern2.getCurrentTextColor() == Color.parseColor("#E9E4F0") || modern1.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    modern2.setBackgroundResource(R.drawable.button_shape);
                    modern2.setTextColor(Color.parseColor("#4286f4"));
                    modern1.setBackgroundResource(R.drawable.button_shape);
                    modern1.setTextColor(Color.parseColor("#4286f4"));
                }
            }
        });


        employment1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setEmployment("((`T8_1_ULGUPJT`/`T1_1AGETT`)<0.05)");

                if(employment1.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    employment1.setBackgroundResource(R.drawable.button_shape2);
                    employment1.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    employment1.setBackgroundResource(R.drawable.button_shape);
                    employment1.setTextColor(Color.parseColor("#4286f4"));
                }

                if(employment2.getCurrentTextColor() == Color.parseColor("#E9E4F0") || employment3.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    employment2.setBackgroundResource(R.drawable.button_shape);
                    employment2.setTextColor(Color.parseColor("#4286f4"));
                    employment3.setBackgroundResource(R.drawable.button_shape);
                    employment3.setTextColor(Color.parseColor("#4286f4"));
                }

            }
        });

        employment2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setEmployment("((`T8_1_ULGUPJT`/`T1_1AGETT`)>0.05)");

                if(employment2.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    employment2.setBackgroundResource(R.drawable.button_shape2);
                    employment2.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    employment2.setBackgroundResource(R.drawable.button_shape);
                    employment2.setTextColor(Color.parseColor("#4286f4"));
                }

                if(employment1.getCurrentTextColor() == Color.parseColor("#E9E4F0") || employment3.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    employment1.setBackgroundResource(R.drawable.button_shape);
                    employment1.setTextColor(Color.parseColor("#4286f4"));
                    employment3.setBackgroundResource(R.drawable.button_shape);
                    employment3.setTextColor(Color.parseColor("#4286f4"));
                }
            }
        });

        employment3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setEmployment("");

                if(employment3.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    employment3.setBackgroundResource(R.drawable.button_shape2);
                    employment3.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    employment3.setBackgroundResource(R.drawable.button_shape);
                    employment3.setTextColor(Color.parseColor("#4286f4"));
                }

                if(employment2.getCurrentTextColor() == Color.parseColor("#E9E4F0") || employment1.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    employment2.setBackgroundResource(R.drawable.button_shape);
                    employment2.setTextColor(Color.parseColor("#4286f4"));
                    employment1.setBackgroundResource(R.drawable.button_shape);
                    employment1.setTextColor(Color.parseColor("#4286f4"));
                }
            }
        });



        house1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setHouse("(`T6_1_HB_H`>`T6_1_FA_H`)");

                if(house1.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    house1.setBackgroundResource(R.drawable.button_shape2);
                    house1.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    house1.setBackgroundResource(R.drawable.button_shape);
                    house1.setTextColor(Color.parseColor("#4286f4"));
                }

                if(house2.getCurrentTextColor() == Color.parseColor("#E9E4F0") || house3.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    house2.setBackgroundResource(R.drawable.button_shape);
                    house2.setTextColor(Color.parseColor("#4286f4"));
                    house3.setBackgroundResource(R.drawable.button_shape);
                    house3.setTextColor(Color.parseColor("#4286f4"));
                }

            }
        });

        house2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setHouse("(`T6_1_HB_H`<`T6_1_FA_H`)");

                if(house2.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    house2.setBackgroundResource(R.drawable.button_shape2);
                    house2.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    house2.setBackgroundResource(R.drawable.button_shape);
                    house2.setTextColor(Color.parseColor("#4286f4"));
                }

                if(house1.getCurrentTextColor() == Color.parseColor("#E9E4F0") || house3.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    house1.setBackgroundResource(R.drawable.button_shape);
                    house1.setTextColor(Color.parseColor("#4286f4"));
                    house3.setBackgroundResource(R.drawable.button_shape);
                    house3.setTextColor(Color.parseColor("#4286f4"));
                }
            }
        });

        house3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setHouse("");

                if(house3.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    house3.setBackgroundResource(R.drawable.button_shape2);
                    house3.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    house3.setBackgroundResource(R.drawable.button_shape);
                    house3.setTextColor(Color.parseColor("#4286f4"));
                }

                if(house2.getCurrentTextColor() == Color.parseColor("#E9E4F0") || house1.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    house2.setBackgroundResource(R.drawable.button_shape);
                    house2.setTextColor(Color.parseColor("#4286f4"));
                    house1.setBackgroundResource(R.drawable.button_shape);
                    house1.setTextColor(Color.parseColor("#4286f4"));
                }
            }
        });




        broadband1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

               setBroadband("(((`T15_3_B`+`T15_3_OTH`)/`T15_3_T`)>0.8)");

                if(broadband1.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    broadband1.setBackgroundResource(R.drawable.button_shape2);
                    broadband1.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    broadband1.setBackgroundResource(R.drawable.button_shape);
                    broadband1.setTextColor(Color.parseColor("#4286f4"));
                }

                if(broadband2.getCurrentTextColor() == Color.parseColor("#E9E4F0") || broadband3.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    broadband2.setBackgroundResource(R.drawable.button_shape);
                    broadband2.setTextColor(Color.parseColor("#4286f4"));
                    broadband3.setBackgroundResource(R.drawable.button_shape);
                    broadband3.setTextColor(Color.parseColor("#4286f4"));
                }

            }
        });

        broadband2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setBroadband("(((`T15_3_B`+`T15_3_OTH`)/`T15_3_T`)<0.8)");

                if(broadband2.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    broadband2.setBackgroundResource(R.drawable.button_shape2);
                    broadband2.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    broadband2.setBackgroundResource(R.drawable.button_shape);
                    broadband2.setTextColor(Color.parseColor("#4286f4"));
                }

                if(broadband1.getCurrentTextColor() == Color.parseColor("#E9E4F0") || broadband3.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    broadband1.setBackgroundResource(R.drawable.button_shape);
                    broadband1.setTextColor(Color.parseColor("#4286f4"));
                    broadband3.setBackgroundResource(R.drawable.button_shape);
                    broadband3.setTextColor(Color.parseColor("#4286f4"));
                }
            }
        });

        broadband3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setBroadband("");

                if(broadband3.getCurrentTextColor() == Color.parseColor("#4286f4")) {
                    broadband3.setBackgroundResource(R.drawable.button_shape2);
                    broadband3.setTextColor(Color.parseColor("#E9E4F0"));
                }else{
                    broadband3.setBackgroundResource(R.drawable.button_shape);
                    broadband3.setTextColor(Color.parseColor("#4286f4"));
                }

                if(broadband2.getCurrentTextColor() == Color.parseColor("#E9E4F0") || broadband1.getCurrentTextColor() == Color.parseColor("#E9E4F0")){
                    broadband2.setBackgroundResource(R.drawable.button_shape);
                    broadband2.setTextColor(Color.parseColor("#4286f4"));
                    broadband1.setBackgroundResource(R.drawable.button_shape);
                    broadband1.setTextColor(Color.parseColor("#4286f4"));
                }
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String address = "http://192.168.56.1/ServerStuff/ServerConnection/InsertRecord.php";
                ArrayList<String> sqlQueryList = new ArrayList<>();
                String query = "";
                String query2 = "";

                submitButton.setBackgroundResource(R.drawable.button_shape2);
                submitButton.setTextColor(Color.parseColor("#E9E4F0"));

                sqlQueryList.add(getAge());
                sqlQueryList.add(getSex());
                sqlQueryList.add(getCultural());
                sqlQueryList.add(getIrish());
                sqlQueryList.add(getStudent());
                sqlQueryList.add(getModern());
                sqlQueryList.add(getEmployment());
                sqlQueryList.add(getBroadband());
                sqlQueryList.add(getHouse());

                for(int i = 0; i<sqlQueryList.size(); i++){

                    if(!sqlQueryList.get(i).equals("") && query.equals("")){
                        query += sqlQueryList.get(i);
                    }else if(!sqlQueryList.get(i).equals("") && !query.equals("")) {
                        query += " AND " + sqlQueryList.get(i);
                    }
                }

                StrictMode.setThreadPolicy((new StrictMode.ThreadPolicy.Builder().permitNetwork().build()));
                Sender s=new Sender(InquiryPage3Activity.this,address,"SELECT GEOGID FROM censusdata WHERE ",query,"");
                s.execute();

                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setIrish(String irish) {
        this.irish = irish;
    }

    public String getIrish() {
        return irish;
    }

    public void setCultural(String cultural) {
        this.cultural = cultural;
    }

    public String getCultural() {
        return cultural;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getStudent() {
        return student;
    }

    public void setModern(String modern) {
        this.modern = modern;
    }

    public String getModern() {
        return modern;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public String getEmployment() {
        return employment;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getHouse() {
        return house;
    }

    public void setBroadband(String broadband) {
        this.broadband = broadband;
    }

    public String getBroadband() {
        return broadband;
    }

}
