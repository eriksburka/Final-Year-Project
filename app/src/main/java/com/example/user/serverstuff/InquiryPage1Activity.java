package com.example.user.serverstuff;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InquiryPage1Activity extends AppCompatActivity {

    private static String province;
    private Button leinster, munster, connacht, ulster;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquiry_page1);

        leinster = findViewById(R.id.leinster);
        munster = findViewById(R.id.munster);
        connacht = findViewById(R.id.connacht);
        ulster = findViewById(R.id.ulster);
        textView = findViewById(R.id.textView1);

        leinster.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setProvince("leinster");
                Intent i = new Intent(getApplicationContext(),InquiryPage2Activity.class);
                startActivity(i);
                textView.setText(getProvince());
            }
        });

        munster.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setProvince("munster");
                Intent i = new Intent(getApplicationContext(),InquiryPage2Activity.class);
                startActivity(i);
                textView.setText(getProvince());
            }
        });

        connacht.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setProvince("connacht");
                Intent i = new Intent(getApplicationContext(),InquiryPage2Activity.class);
                startActivity(i);
                textView.setText(getProvince());
            }
        });

        ulster.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setProvince("ulster");
                Intent i = new Intent(getApplicationContext(),InquiryPage2Activity.class);
                startActivity(i);
                textView.setText(getProvince());
            }
        });
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {

        return province;
    }
}