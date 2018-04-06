package com.example.gaute.dagger2passapplicationcontext;

import com.example.gaute.dagger2passapplicationcontext.di.component.DaggerNannyApplicationComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by gaute on 3/25/18.
 */
//Dagger support library is used so extend DaggerApplication
public class NannyApplication extends DaggerApplication {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    /**
     * applicationInjector() gets called inside onCreate()
     */
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {

        return DaggerNannyApplicationComponent
                .builder() /* Got AndroidInjector.Builder<NannyApplication> */
                .create(this); /* seedInstance(this); return build(); */
        /* seed Instance actually gets implemented inside DaggerNannyApplicationComponent's Builder class
        as below:
        @Override
        public void seedInstance(NannyApplication arg0) {
            this.seedInstance = Preconditions.checkNotNull(arg0);
            }
         */
    }
}
