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
        AndroidSupportInjectionModule.class /* it makes Dagger generates DaggerNannyApplicationComponent */,
        ApplicationBindingModule.class /* it generates AndroidInjector.Builder<MainActivity>, which
        is used to inject requested dependencies by MainActivity */
})
public interface NannyApplicationComponent extends AndroidInjector<NannyApplication> {

    @Component.Builder /* Simply tells this Builder is DaggerNannyApplicationComponent’s inner Builder class */
    abstract class Builder extends AndroidInjector.Builder<NannyApplication> {
    }
}