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

public class ProfileActivity extends AppCompatActivity {

    private TextView profile;
    private TextView query;
    private String queryText = "";
    private String profileText = "";
    private String address = "http://192.168.56.1/ServerStuff/ServerConnection/InsertRecord.php";
    private InputStream inputStream = null;
    private String result = "";
    private String [] data= null;
    private String [] data2= null;

    private String testing;
    JSONObject jsonObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        profile = findViewById(R.id.textViewFullProfile);
        query = findViewById(R.id.textView);

        InquiryPage3Activity q = new InquiryPage3Activity();

//        ArrayList<String> counties = q.getCounties();

        profileText += "Age Preference: " + q.getAge() + "\n";
        profileText += "Sex Preference: " + q.getSex() + "\n";
        profileText += "Cultural Preference: " + q.getCultural() + "\n";
        profileText += "Irish-Speaking Preference: " + q.getIrish() + "\n";
        profileText += "Student Preference: " + q.getStudent() + "\n";
        profileText += "Modern Preference: " + q.getModern() + "\n";
        profileText += "Employment Preference: " + q.getEmployment() + "\n";
        profileText += "Occupancy Preference: " + q.getOccupancy() + "\n";
        profileText += "\n Search for the following counties: \n";

//        for(int i=0;i<counties.size();i++){
//            profileText += counties.get(i) + "\n";
//        }

        profile.setText(profileText);

        StrictMode.setThreadPolicy((new StrictMode.ThreadPolicy.Builder().permitNetwork().build()));
        getData();

    }

    private void getData(){
        try {
            URL url = new URL(address);
            try {
                HttpURLConnection con =(HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");
                inputStream = new BufferedInputStream(con.getInputStream());

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try{

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            testing = bufferedReader.readLine();

            if(testing == null) {
                System.out.print("Null\n");
            }else{

                System.out.print("Should Work\n");
                System.out.print(testing + "\n");
            }

            inputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        try{
            JSONArray jsonArray = new JSONArray(testing);

            data = new String[jsonArray.length()];
            data2 = new String[jsonArray.length()];

            for(int i=0; i<jsonArray.length();i++){
                jsonObject=jsonArray.getJSONObject(i);
                data[i]=jsonObject.getString("GUID");
                data2[i]=jsonObject.getString("T1_1AGETM");
                queryText += "GUID: " + data[i] + "\n";
                queryText +="AGE: " + data2[i] + "\n";
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        query.setText(queryText);
    }
}
