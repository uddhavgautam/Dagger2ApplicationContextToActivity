package com.example.gaute.dagger2passapplicationcontext.di.component;

import com.example.gaute.dagger2passapplicationcontext.NannyApplication;
import com.example.gaute.dagger2passapplicationcontext.di.module.ApplicationBindingModule;
import com.example.gaute.dagger2passapplicationcontext.di.module.NannyApplicationModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by gaute on 3/25/18.
 */

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        ApplicationBindingModule.class,
        NannyApplicationModule.class
})
public interface NannyApplicationComponent extends AndroidInjector<NannyApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<NannyApplication> {
    }
}