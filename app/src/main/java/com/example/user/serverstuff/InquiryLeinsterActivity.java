package com.example.user.serverstuff;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InquiryLeinsterActivity extends AppCompatActivity {

    private Button carlow, dublin, kildare, killkeny, laois, longford, louth, meath, offaly, westmeath, wexford, wicklow, continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquiry_leinster);

        dublin = findViewById(R.id.Dublin);

        dublin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),InquiryPage3Activity.class);
                startActivity(i);
            }
        });

    }
}
