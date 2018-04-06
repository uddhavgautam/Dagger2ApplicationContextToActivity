package com.example.gaute.dagger2passapplicationcontext.di.module;

import com.example.gaute.dagger2passapplicationcontext.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface ApplicationBindingModule {


    /**
     * These two lines, actually, makes Dagger generates ApplicationBindingModule_MainActivity class
     * This generates AndroidInjector for the MainActivity (return type). I means, AndroidInjector which
     * holds Builder inner class where Builder class wraps MainActivity.
     *
     * I means,
     * ApplicationBindingModule_MainActivity.MainActivitySubcomponent.AndroidInjector.Builder<MainActivity></MainActivity>
     */
    @ContributesAndroidInjector
    MainActivity mainActivity(); // no parameter method

    //Because of above two lines, the Dagger Rule (explained below) got satisfied
    /*
    Rule: For any Service Component T, we must provide T’s instance as a seedInstance into
    the AndroidInjector.Builder<T> class. It means if you do AndroidInjector.inject(this) inside
    \MainActivity's lifecycle callback, you initialized seedInstance = mainActivity inside
    AndroidInjector.Builder<MainActivity> class.
     */

    /*
    The word @Binds binds (links) two classes. Here, it binds  AndroidInjector.Factory<? extends Activity>
    with ApplicationBindingModule_MainActivity.MainActivitySubcomponent.AndroidInjector.Builder<MainActivity></MainActivity>
     */
}
