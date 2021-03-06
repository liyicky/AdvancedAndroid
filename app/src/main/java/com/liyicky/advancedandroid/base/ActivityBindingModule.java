package com.liyicky.advancedandroid.base;

import android.app.Activity;

import com.liyicky.advancedandroid.home.MainActivity;
import com.liyicky.advancedandroid.home.MainActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by liyicky on 3/13/18.
 */

@Module(subcomponents = {
        MainActivityComponent.class,
})

public abstract class ActivityBindingModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> provideMainActivityInjector(MainActivityComponent.Builder builder);
}
