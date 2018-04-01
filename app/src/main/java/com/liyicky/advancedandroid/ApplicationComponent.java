package com.liyicky.advancedandroid;

/**
 * Created by liyicky on 2/27/18.
 */

import android.app.Activity;

import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        ActivityBindingModule.class,
})

public interface ApplicationComponent {

    void inject(MyApplication myApplication);
}
