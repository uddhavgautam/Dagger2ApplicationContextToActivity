package com.example.gaute.dagger2passapplicationcontext.di.module;

import com.example.gaute.dagger2passapplicationcontext.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface ApplicationBindingModule {

    /**
     * Installs mainActivity instance to the generated Component graph
     *
     * @return arrays of class pointers wrapping type T
     */
    @ContributesAndroidInjector
    MainActivity mainActivity();
}
