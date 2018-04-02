package com.liyicky.advancedandroid.base;

/**
 * Created by liyicky on 2/27/18.
 */

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
