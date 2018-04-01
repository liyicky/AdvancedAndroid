package com.liyicky.advancedandroid;

/**
 * Created by liyicky on 2/27/18.
 */

import android.app.Application;

import com.liyicky.advancedandroid.di.ActivityInjector;

import javax.inject.Inject;


public class MyApplication extends Application {

    @Inject
    ActivityInjector activityInjector;

    private ApplicationComponent component;

    @Override public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        component.inject(this);
    }

    public ActivityInjector getActivityInjector() {
        return activityInjector;
    }


}
