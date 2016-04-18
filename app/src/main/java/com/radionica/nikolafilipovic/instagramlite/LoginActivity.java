package com.radionica.nikolafilipovic.instagramlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import com.radionica.nikolafilipovic.instagramlite.utils.Preferences;
import com.radionica.nikolafilipovic.instagramlite.utils.Preferences_;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;

@EActivity(R.layout.activity_login)
public class LoginActivity extends AppCompatActivity {

    private static final String TAG =
            LoginActivity.class.getSimpleName();

    @ViewById
    EditText username;

    @ViewById
    EditText password;

    @Pref
    Preferences_ prefs;

    @AfterInject
    void init(){

        if (prefs.loggedIn().getOr(false)){
            NavigationAcitivity_.intent(this).start();
        }
    }

    @Click
    void  login(){
        Log.d(TAG, username.getText().toString() + "  "
         + password.getText().toString());

        NavigationAcitivity_.intent(this).username(username.getText().toString()).start();
    }
}
