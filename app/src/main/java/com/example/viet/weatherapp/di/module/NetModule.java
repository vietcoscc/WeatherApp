package com.example.viet.weatherapp.di.module;

import com.example.viet.weatherapp.ui.main.MainMvpView;
import com.example.viet.weatherapp.ui.main.MainPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by viet on 25/08/2017.
 */
@Module
@Singleton
public class NetModule {
    private String mBaseUrl;

    public NetModule(String baseUrl) {
        this.mBaseUrl = baseUrl;
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(mBaseUrl).build();
        return retrofit;
    }

}
