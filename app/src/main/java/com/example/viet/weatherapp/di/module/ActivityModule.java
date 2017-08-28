package com.example.viet.weatherapp.di.module;

import com.example.viet.weatherapp.ui.main.MainMvpPresenter;
import com.example.viet.weatherapp.ui.main.MainMvpView;
import com.example.viet.weatherapp.ui.main.MainPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by viet on 28/08/2017.
 */
@Module
public class ActivityModule {
    @Provides
    MainMvpPresenter<MainMvpView> provideMainPresenter(MainPresenter<MainMvpView> presenter) {
        return presenter;
    }
}
