package com.example.excelinstitute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        TextView tvLoginLink;
        tvLoginLink = findViewById(R.id.tvLoginLink);
        tvLoginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inext;
                inext = new Intent(Signup.this, loginactivity.class);
                startActivity(inext);
            }
        });
    }
}