package com.example.gaute.dagger2passapplicationcontext.di.component;

import com.example.gaute.dagger2passapplicationcontext.NannyApplication;
import com.example.gaute.dagger2passapplicationcontext.di.module.ApplicationBindingModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by gaute on 3/25/18.
 */

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class /* no user here, in my case */,
        ApplicationBindingModule.class
})
public interface NannyApplicationComponent extends AndroidInjector<NannyApplication> {

    /**
     * Provides NannyApplication instance into the Graph and return AndroidInjector<NannyApplication>
     * when called create(this) method from Classes
     * <p>
     * Graph (Component) builder for NannyApplication
     */
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<NannyApplication> {
    }
}