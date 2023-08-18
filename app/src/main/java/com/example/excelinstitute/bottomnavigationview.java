package com.example.excelinstitute;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class bottomnavigationview extends AppCompatActivity {
    BottomNavigationView bnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottomnavigationview);
        bnView = findViewById(R.id.bnview);
        bnView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if(id==R.id.nav_home){
                    loadFrag(new excelFragment(),false);




                }
                else if(id==R.id.nav_aboutfac){
                    loadFrag(new excelFragment2(),false);

                }
                else if(id==R.id.nav_Seafac){
                    loadFrag(new ExcelFrageent3(),false);

                }
                else{//contactus
                    loadFrag(new ExcelFragement4(),true);

                }
                return true;
            }
        });
        bnView.setSelectedItemId(R.id.Conus);



    }
    public void loadFrag(Fragment fragment, boolean flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(flag){
            ft.add(R.id.container, fragment);

        }
        else{
            ft.replace(R.id.container,fragment);
            ft.commit();
        }


    }
}