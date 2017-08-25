package com.example.viet.weatherapp.model;

import android.app.Application;

import com.example.viet.weatherapp.model.component.DaggerNetComponent;
import com.example.viet.weatherapp.model.component.NetComponent;
import com.example.viet.weatherapp.model.module.NetModule;

/**
 * Created by viet on 25/08/2017.
 */

public class CustomApplication extends Application {
    public static final String BASE_URL = "http://api.openweathermap.org/";
    public static final String APP_ID = "e1fb2a9813d1bc907e9d15fb26ffdbf0";
    public static final String LANG = "vi";

    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mNetComponent = DaggerNetComponent.builder()
                .netModule(new NetModule(BASE_URL))
                .build();
    }

    public NetComponent getmNetComponent() {
        return mNetComponent;
    }
}
