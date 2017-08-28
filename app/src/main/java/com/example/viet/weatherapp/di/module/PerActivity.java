package com.example.viet.weatherapp.di.module;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by viet on 28/08/2017.
 */


@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
