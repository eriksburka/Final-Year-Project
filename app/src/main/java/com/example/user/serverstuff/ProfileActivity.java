package com.example.user.serverstuff;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {

    private TextView profile;
    private String queryText = "";
    private String address = "http://192.168.56.1/ServerStuff/ServerConnection/InsertRecord.php";
    private  String result;
    private static ArrayList<String> idealPlaces = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        profile = findViewById(R.id.textViewFullProfile);
        ArrayList<String> testArray = new ArrayList<>();

        Sender2 q = new Sender2(ProfileActivity.this,address,"","","");
        System.out.println("--------------Test Array2--------------");
        testArray = q.getsqlQueryList2();
        System.out.println(testArray);
        System.out.println("--------------Test Array2--------------");

        for(int i = 0; i<testArray.size();i++){
            if(!idealPlaces.contains(testArray.get(i))){
                idealPlaces.add(testArray.get(i));
                queryText += testArray.get(i) + "\n";
            }else{

           }
        }
        profile.setText(queryText);
    }

    public void setResult(String result){
        this.result = result;
    }

    public String getResult(){
        return this.result;
    }

}