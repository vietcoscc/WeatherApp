package com.example.viet.weatherapp.ui.main.base;

/**
 * Created by viet on 28/08/2017.
 */

public interface MvpView {
    void showProgress();

    void hideProgress();

    void showMessage(String message);
}
