package com.example.user.serverstuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String urlAddress="http://192.168.56.1/ServerStuff/ServerConnection/InsertRecord.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //START ASYNC TASK
        Sender s=new Sender(MainActivity.this,urlAddress,"SELECT GEOGID FROM censusdata WHERE ","(T1_1AGE20_24T < 1)","AND (T1_1AGE25_29T < 1)");
        s.execute();

    }

}