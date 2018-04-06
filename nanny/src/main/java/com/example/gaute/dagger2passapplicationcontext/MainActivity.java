package com.example.gaute.dagger2passapplicationcontext;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;

/**
 * A transparent MainActivity
 */
public class MainActivity extends DaggerAppCompatActivity /* For Dagger Support Library */ {

    @Inject
    NannyApplication nannyApplication /* You got the ApplicationContext */;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);       
    }

    @Override
    protected void onStart() {
        super.onStart();
        //check nannyApplication
        Log.i("Cls-loader: ", nannyApplication.getClassLoader() + "");
    }
}
