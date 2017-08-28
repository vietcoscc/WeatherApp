package com.example.viet.weatherapp.di.component;

import com.example.viet.weatherapp.di.module.NetModule;
import com.example.viet.weatherapp.ui.main.MainMvpView;
import com.example.viet.weatherapp.ui.main.MainPresenter;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by viet on 25/08/2017.
 */

@Singleton
@Component(modules = NetModule.class)
public interface NetComponent {
    Retrofit retrofit();
}
