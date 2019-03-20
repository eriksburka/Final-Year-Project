package com.example.user.serverstuff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class InquiryPage3Activity extends AppCompatActivity{

    private String[] sexList = {"Majority Men", "Majority Women", "I Don't Care"};
    private String[] ageList = {"Young", "Old", "I Don't Care"};
    private String[] irishList = {"Irish Speaking", "Non-Irish Speaking", "I Don't Care"};
    private String[] culturalList = {"Cultural Diversity", "No Cultural Diversity", "I Don't Care"};
    private String[] studentList = {"Student populated", "Non-Student populated", "I Don't Care"};
    private String[] modernList = {"Modern Area", "Non-Modern area", "I Don't Care"};
    private String[] employmentList = {"Majorily Employed", "Majorily Unemployed", "I Don't Care"};
    private String[] occupancyList = {"Mostly Owner-occupied", "Mostly Rented", "I Don't Care"};

    private static String sex;
    private static String age;
    private static String irish;
    private static String cultural;
    private static String student;
    private static String modern;
    private static String employment;
    private static String occupancy;
    private static Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquiry_page3);

    }


    public void setAge(String age) {
        switch (age) {
            case "Young":
                this.age = "(T1_1AGE20_24T = 0)";
                break;
            case "Old":
                this.age = "(T1_1AGE20_24T = 1)";
                break;
            case "I Don't Care":
                this.age = "(T1_1AGE20_24T = 2)";
                break;
        }
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

    public void setOccupancy(String occupancy) {
        this.occupancy = occupancy;
    }

    public String getOccupancy() {
        return occupancy;
    }
}
