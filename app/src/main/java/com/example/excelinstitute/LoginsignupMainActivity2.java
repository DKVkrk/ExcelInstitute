package com.example.excelinstitute;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginsignupMainActivity2 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginsignup_main2);
        TextView marqueeText2;
        marqueeText2 = findViewById(R.id.marqueeText1);
        marqueeText2.setSelected(true);
        Button loginButton ;
        Button signUpButton;
        loginButton=findViewById(R.id.loginButton);
        signUpButton=findViewById(R.id.signUpButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inext;
                inext = new Intent(LoginsignupMainActivity2.this, loginactivity.class);
                startActivity(inext);
            }
        });
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inext;
                inext = new Intent(LoginsignupMainActivity2.this, Signup.class);
                startActivity(inext);
            }
        });

    }
}