package com.example.viet.weatherapp.presenter;

import retrofit2.Retrofit;

/**
 * Created by viet on 25/08/2017.
 */

public interface MainPresenter {
    void callApi(Retrofit retrofit, String city, String appId);
}
