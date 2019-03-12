package com.example.user.serverstuff;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class InquiryPage2Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private ArrayList<String> counties = new ArrayList<>();
    private static ArrayList<String> chosenCounties = new ArrayList<>();
    private String county;
    private Spinner spinner;
    private Button addCountyButton;
    private Button continueButton;
    private TextView chosen;
    private String countiesList="";

    private String[] leinster = {"Carlow", "Dublin", "Kildare", "Kilkenny", "Laois", "Longford", "Louth", "Meath", "Offaly", "Westmeath", "Wexford", "Wicklow"};
    private String[] munster = {"Cork", "Clare", "Kerry", "Waterford", "Limerick", "Tipperary"};
    private String[] connacht = {"Galway", "Leitrim" , "Mayo" , "Roscommon", "Sligo"};
    private String[] ulster = {"Cavan" , "Monaghan", "Donegal" , "Antrim" , "Down" , "Armagh" , "Derry" , "Fermanagh" , "Tyrone"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquiry_page2);

        addCountyButton = findViewById(R.id.addCountyButton);
        continueButton = findViewById(R.id.continueButton);

        chosen = findViewById(R.id.textView2);
        chosen.setText(countiesList);

        InquiryPage1Activity I1 = new InquiryPage1Activity();
        String province = I1.getProvince();

        switch(province){
            case "leinster":
                counties.addAll(Arrays.asList(leinster));
                break;

            case "munster":
                counties.addAll(Arrays.asList(munster));
                break;

            case "connacht":
                counties.addAll(Arrays.asList(connacht));
                break;

            case "ulster":
                counties.addAll(Arrays.asList(ulster));
                break;
        }

        // Spinner element
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        // Spinner click listener
        spinner.setOnItemSelectedListener(this);
        // Creating adapter for spinner
        final ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, counties);
        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        addCountyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!chosenCounties.contains(spinner.getSelectedItem().toString())) {
                    chosenCounties.add(spinner.getSelectedItem().toString());
                    countiesList += spinner.getSelectedItem().toString() + "\n";
                    chosen.setText(countiesList);
                }else{
                    Toast.makeText(dataAdapter.getContext(), "You have already added this county", Toast.LENGTH_LONG).show();
                }
            }
        });

        continueButton.setOnClickListener(new View.OnClickListener()  {
            public void onClick (View v){
                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public ArrayList<String> getCounties() {
        return this.chosenCounties;
    }

    }

