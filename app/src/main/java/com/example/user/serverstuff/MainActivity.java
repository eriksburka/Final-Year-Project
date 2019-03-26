package com.example.user.serverstuff;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static int WELCOME_TIMEOUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String address = "http://192.168.56.1/ServerStuff/ServerConnection/InsertRecord.php";
        String query2 = "";
        ArrayList<String> emptyList = new ArrayList<>();

        InquiryLeinsterActivity inq = new InquiryLeinsterActivity();
        Sender f = new Sender(MainActivity.this,address,"","","");
        Sender2 g = new Sender2(MainActivity.this,address,"","","");
        ArrayList<String> queryList = f.getsqlQueryList();

        while(queryList.size()==0){
            queryList = f.getsqlQueryList();
        }

        if(queryList.get(0).equals("empty")){
            Toast.makeText(MainActivity.this,"No matches meet your ideal living conditions. \n\n Please try again. ",Toast.LENGTH_LONG).show();
            f.setSqlQueryList(emptyList);

            Intent i = new Intent(MainActivity.this, InquiryPage3Activity.class);
            startActivity(i);
        }else{

        // App gets stuck here in an infinite loop if the result doesn't give anything

        for(int i = 0; i<queryList.size(); i ++){
            if(i == 0 ){
                query2 += "(`Small_Area` = " + queryList.get(i);
            }else{
                query2 += " OR `Small_Area` = " + queryList.get(i);
            }
        }

        System.out.println("---------DID SMALL AREA QUERY WORK?---------");
        System.out.println("Query is:   "+ query2);
        System.out.println("-------------------------------------------");

        Sender2 p=new Sender2(MainActivity.this,address,"SELECT Electoral_District FROM ppr WHERE ",query2 + ") AND (`County` = '" + inq.getCounty() + "')","");
        p.execute();

        ArrayList<String> queryList2 = g.getsqlQueryList2();

            while(queryList2.size()==0){
                queryList2 = g.getsqlQueryList2();
            }

            if(queryList2.get(0).equals("empty")){
                Toast.makeText(MainActivity.this,"No matches meet your ideal living conditions. \n\n Please try again. ",Toast.LENGTH_LONG).show();
                g.setSqlQueryList(emptyList);

                Intent i = new Intent(MainActivity.this, InquiryPage3Activity.class);
                startActivity(i);
            }else {


                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(MainActivity.this, ProfileActivity.class);
                        startActivity(i);
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        finish();
                    }
                }, WELCOME_TIMEOUT);
            }
        }
    }

}