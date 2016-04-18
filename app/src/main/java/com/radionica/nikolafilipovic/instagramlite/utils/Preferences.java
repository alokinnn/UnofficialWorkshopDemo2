package com.radionica.nikolafilipovic.instagramlite.utils;

import org.androidannotations.annotations.sharedpreferences.SharedPref;

/**
 * Created by Nikola Filipović on 16.4.2016..
 */

@SharedPref(SharedPref.Scope.UNIQUE)
public interface Preferences {

    boolean loggedIn();
}
