package com.liyicky.advancedandroid.home;

import com.bluelinelabs.conductor.Controller;
import com.liyicky.advancedandroid.di.ControllerKey;
import com.liyicky.advancedandroid.trending.TrendingReposComponent;
import com.liyicky.advancedandroid.trending.TrendingReposController;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {
        TrendingReposComponent.class,
})

public abstract class MainScreenBindingModule {

    @Binds
    @IntoMap
    @ControllerKey(TrendingReposController.class)
    abstract AndroidInjector.Factory<? extends Controller> bindTrendingReposController(TrendingReposComponent.Builder builder);

}
