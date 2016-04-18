package com.radionica.nikolafilipovic.instagramlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;

@EActivity(R.layout.activity_navigation_acitivity)
public class NavigationAcitivity extends AppCompatActivity {

    @Extra
    String username;

    @AfterInject
    void welcomeUser(){
        if (username != null) {
            Toast.makeText(NavigationAcitivity.this, username, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed(); //modifikujemo desavanje na back
    }


}
