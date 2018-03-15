package com.liyicky.advancedandroid.di;

/**
 * Created by liyicky on 3/13/18.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;


@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScope {
}
