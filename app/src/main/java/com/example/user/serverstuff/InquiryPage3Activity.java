package com.example.user.serverstuff;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

public class InquiryPage3Activity extends AppCompatActivity implements OnItemSelectedListener{

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

        submitButton = findViewById(R.id.submitButton);

        final Spinner spinnerSex = findViewById(R.id.spinnerSex);
        final Spinner spinnerAge = findViewById(R.id.spinnerAge);
        final Spinner spinnerCultural = findViewById(R.id.spinnerCultural);
        final Spinner spinnerIrish = findViewById(R.id.spinnerIrish);
        final Spinner spinnerStudent = findViewById(R.id.spinnerStudent);
        final Spinner spinnerModern = findViewById(R.id.spinnerModern);
        final Spinner spinnerEmployment = findViewById(R.id.spinnerEmployment);
        final Spinner spinnerOccupancy = findViewById(R.id.spinnerOccupancy);

        spinnerSex.setOnItemSelectedListener(this);
        spinnerAge.setOnItemSelectedListener(this);
        spinnerCultural.setOnItemSelectedListener(this);
        spinnerIrish.setOnItemSelectedListener(this);
        spinnerStudent.setOnItemSelectedListener(this);
        spinnerModern.setOnItemSelectedListener(this);
        spinnerEmployment.setOnItemSelectedListener(this);
        spinnerOccupancy.setOnItemSelectedListener(this);

        final ArrayAdapter<String> dataAdapterSex = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sexList);
        final ArrayAdapter<String> dataAdapterAge = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ageList);
        final ArrayAdapter<String> dataAdapterIrish = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, irishList);
        final ArrayAdapter<String> dataAdapterCultural = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, culturalList);
        final ArrayAdapter<String> dataAdapterStudent = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, studentList);
        final ArrayAdapter<String> dataAdapterModern = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, modernList);
        final ArrayAdapter<String> dataAdapterEmployment = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, employmentList);
        final ArrayAdapter<String> dataAdapterOccupancy = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, occupancyList);

        dataAdapterSex.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapterAge.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapterIrish.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapterCultural.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapterStudent.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapterModern.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapterEmployment.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapterOccupancy.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerSex.setAdapter(dataAdapterSex);
        spinnerAge.setAdapter(dataAdapterAge);
        spinnerIrish.setAdapter(dataAdapterIrish);
        spinnerCultural.setAdapter(dataAdapterCultural);
        spinnerStudent.setAdapter(dataAdapterStudent);
        spinnerModern.setAdapter(dataAdapterModern);
        spinnerEmployment.setAdapter(dataAdapterEmployment);
        spinnerOccupancy.setAdapter(dataAdapterOccupancy);

        submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setSex(spinnerSex.getSelectedItem().toString());
                setAge(spinnerAge.getSelectedItem().toString());
                setIrish(spinnerIrish.getSelectedItem().toString());
                setCultural(spinnerCultural.getSelectedItem().toString());
                setStudent(spinnerStudent.getSelectedItem().toString());
                setModern(spinnerModern.getSelectedItem().toString());
                setEmployment(spinnerEmployment.getSelectedItem().toString());
                setOccupancy(spinnerOccupancy.getSelectedItem().toString());

                Intent i = new Intent(getApplicationContext(),ProfileActivity.class);
                startActivity(i);
            }
        });
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String item = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

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
