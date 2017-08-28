package com.example.viet.weatherapp.di.component;

import com.example.viet.weatherapp.di.module.ActivityModule;
import com.example.viet.weatherapp.di.module.PerActivity;
import com.example.viet.weatherapp.ui.main.MainActivity;

import dagger.Component;

/**
 * Created by viet on 28/08/2017.
 */
@Component(dependencies = NetComponent.class, modules = ActivityModule.class)
@PerActivity
public interface ActivityComponent {
    void inject(MainActivity activity);
}
