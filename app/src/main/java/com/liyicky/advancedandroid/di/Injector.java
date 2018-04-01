package com.liyicky.advancedandroid.di;

/**
 * Created by liyicky on 3/13/18.
 */

import android.app.Activity;

public class Injector {

    private Injector() {

    }

    public static void inject(Activity activity) {
        ActivityInjector.get(activity).inject(activity);
    }

    public static void clearComponent(Activity activity) {
        ActivityInjector.get(activity).clear(activity);
    }
}
