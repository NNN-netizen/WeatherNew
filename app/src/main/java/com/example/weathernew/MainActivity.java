package com.example.weathernew;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_current);

        FragmentManager fragmentManager = getFragmentManager();
        FetchCurrentFragment fetchCurrentFragment = new FetchCurrentFragment();
        FragmentTransaction fragtransaction = getFragmentManager().beginTransaction();
        fragtransaction.add(R.id.fragment_current, fetchCurrentFragment);
        fragtransaction.commit();


    }
}