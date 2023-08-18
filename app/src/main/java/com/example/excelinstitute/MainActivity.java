package com.example.excelinstitute;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TextView Areyou;
        TextView marqueeText1;

       Button st;
       Button tu;
        st = findViewById(R.id.st);
        tu = findViewById(R.id.tu);
        marqueeText1=findViewById(R.id.marqueeText1);
        marqueeText1.setSelected(true);
        st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inext;
                inext = new Intent(MainActivity.this, LoginsignupMainActivity2.class);
                startActivity(inext);
            }
        });

        tu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inext1;
                inext1 = new Intent(MainActivity.this, LoginsignupMainActivity2.class);
                startActivity(inext1);
            }
        });






    }
}