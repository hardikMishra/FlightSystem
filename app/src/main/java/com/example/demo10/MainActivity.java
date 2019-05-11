package com.example.demo10;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;
    Fragment fragment;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.iHome:
                    fragment = new HomeFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
                    return true;

                case R.id.iBooking:
                    fragment = new BookingFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();


                    return true;
                case R.id.iProfile:
                    fragment = new ProfileFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();

                    return true;
            }

        return false;

        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragment = new HomeFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);



    }




}

