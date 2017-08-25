package com.example.viet.weatherapp.model.api;

import com.example.viet.weatherapp.model.CurrentWeather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by viet on 25/08/2017.
 */

public interface WeatherApi {

    @GET("/data/2.5/weather")
    Call<CurrentWeather> getWeather(@Query("q") String city, @Query("appid") String appId);

}
