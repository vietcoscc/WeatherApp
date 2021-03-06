package com.example.viet.weatherapp.ui.main;

import com.example.viet.weatherapp.base.MvpPresenter;

import retrofit2.Retrofit;

/**
 * Created by viet on 25/08/2017.
 */

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {
    void callApi( String city, String appId);
}
