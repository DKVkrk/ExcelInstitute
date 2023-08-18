package com.example.excelinstitute;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class loginactivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        TextView marqueeText3;
        marqueeText3=findViewById(R.id.marqueeText3);
        marqueeText3.setSelected(true);
        Button lo;
        lo = findViewById(R.id.lo);
        lo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent inext;
                //inext = new Intent(MainActivity.this, LoginsignupMainActivity2.class);
                //startActivity(inext);
                Toast.makeText(loginactivity.this, "Login Succesfully", Toast.LENGTH_SHORT).show();
            }
        });

    }
}