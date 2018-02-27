package com.liyicky.advancedandroid;

/**
 * Created by liyicky on 2/27/18.
 */

import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {
        ApplicationModule.class,
})

public interface ApplicationComponent {

}
