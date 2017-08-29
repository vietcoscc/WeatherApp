package com.example.viet.weatherapp.manager;

import android.app.Application;

import com.example.viet.weatherapp.di.component.ActivityComponent;
import com.example.viet.weatherapp.di.component.DaggerActivityComponent;
import com.example.viet.weatherapp.di.component.DaggerNetComponent;
import com.example.viet.weatherapp.di.component.NetComponent;
import com.example.viet.weatherapp.di.module.ActivityModule;
import com.example.viet.weatherapp.di.module.NetModule;

import static com.example.viet.weatherapp.common.Constants.BASE_URL;


/**
 * Created by viet on 25/08/2017.
 */

public class CustomApplication extends Application {

    private ActivityComponent mActivityComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        NetComponent component = DaggerNetComponent.builder()
                .netModule(new NetModule(BASE_URL))
                .build();
        mActivityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule())
                .netComponent(component)
                .build();
    }

    public ActivityComponent getmActivityComponent() {
        return mActivityComponent;
    }
}
