package com.example.gaute.dagger2passapplicationcontext.di.module;

import com.example.gaute.dagger2passapplicationcontext.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface ApplicationBindingModule {

    @ContributesAndroidInjector
    MainActivity mainActivity();
}
