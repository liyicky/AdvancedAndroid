package com.liyicky.advancedandroid.home;


import com.bluelinelabs.conductor.Controller;
import com.liyicky.advancedandroid.R;
import com.liyicky.advancedandroid.base.BaseActivity;
import com.liyicky.advancedandroid.trending.TrendingReposController;

public class MainActivity extends BaseActivity {


    @Override
    protected int layoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected Controller initialScreen() {
        return new TrendingReposController();
    }
}
