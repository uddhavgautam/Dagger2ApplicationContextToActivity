package com.example.gaute.dagger2passapplicationcontext.di.module;

import android.app.Activity;
import com.example.gaute.dagger2passapplicationcontext.MainActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ApplicationBindingModule_MainActivity.MainActivitySubcomponent.class)
public abstract class ApplicationBindingModule_MainActivity {
  private ApplicationBindingModule_MainActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(MainActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
  }
}
