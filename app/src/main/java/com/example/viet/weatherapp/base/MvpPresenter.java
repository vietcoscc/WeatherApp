package com.example.viet.weatherapp.base;

/**
 * Created by viet on 28/08/2017.
 */

public interface MvpPresenter<V extends MvpView> {
    void onAttach(V MvpView);

    void onDetach();
}
