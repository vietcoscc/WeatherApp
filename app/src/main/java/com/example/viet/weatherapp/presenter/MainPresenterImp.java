package com.example.viet.weatherapp.presenter;

import android.util.Log;

import com.example.viet.weatherapp.model.CurrentWeather;
import com.example.viet.weatherapp.model.api.WeatherApi;
import com.example.viet.weatherapp.view.MainView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static com.example.viet.weatherapp.model.CustomApplication.LANG;

/**
 * Created by viet on 25/08/2017.
 */

public class MainPresenterImp implements MainPresenter {
    private static final String TAG = "MainPresenterImp";
    private MainView mMainView;


    public MainPresenterImp(MainView mMainView) {
        this.mMainView = mMainView;
    }

    @Override
    public void callApi(Retrofit retrofit, String city, String appId) {
        Call<CurrentWeather> call = retrofit.create(WeatherApi.class).getWeather(city, appId, LANG);
        call.enqueue(new Callback<CurrentWeather>() {
            @Override
            public void onResponse(Call<CurrentWeather> call, Response<CurrentWeather> response) {
                Log.i(TAG, response.message() + " ");
                CurrentWeather weather = response.body();
                Log.i(TAG, weather.toString());
                mMainView.displayResult(weather.toString());
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
