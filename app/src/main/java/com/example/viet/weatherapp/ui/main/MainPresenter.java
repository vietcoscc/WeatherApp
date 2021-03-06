package com.example.viet.weatherapp.ui.main;

import android.util.Log;

import com.example.viet.weatherapp.api.WeatherApi;
import com.example.viet.weatherapp.base.BasePresenter;
import com.example.viet.weatherapp.model.CurrentWeather;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static com.example.viet.weatherapp.common.Constants.LANG;

/**
 * Created by viet on 25/08/2017.
 */

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {
    private static final String TAG = "MainPresenter";
    private Retrofit mRetrofit;

    @Inject
    public MainPresenter(Retrofit retrofit) {
        this.mRetrofit = retrofit;
    }

    @Override
    public void callApi(String city, String appId) {
        getmMvpView().showProgress();
        Call<CurrentWeather> call = mRetrofit.create(WeatherApi.class).getWeather(city, appId, LANG);
        call.enqueue(new Callback<CurrentWeather>() {
            @Override
            public void onResponse(Call<CurrentWeather> call, Response<CurrentWeather> response) {
                Log.i(TAG, response.message() + " ");
                CurrentWeather weather = response.body();
                Log.i(TAG, weather.toString());
                getmMvpView().displayResult(weather.toString());
                getmMvpView().hideProgress();
            }

            @Override
            public void onFailure(Call<CurrentWeather> call, Throwable t) {
                Log.i(TAG, t.getMessage());
            }
        });
    }

    private float fahrenheitToCelsius(float fahreheit) {
        return (fahreheit - 32) * 5 / 9;
    }

}
