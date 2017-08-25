package com.example.viet.weatherapp.model.component;

import com.example.viet.weatherapp.model.module.NetModule;
import com.example.viet.weatherapp.view.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by viet on 25/08/2017.
 */
@Singleton
@Component(modules = NetModule.class)
public interface NetComponent {
    void inject(MainActivity activity);

}
