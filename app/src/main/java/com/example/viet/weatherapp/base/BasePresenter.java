package com.example.viet.weatherapp.base;

/**
 * Created by viet on 28/08/2017.
 */

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {
    private V mMvpView;

    @Override
    public void onAttach(V MvpView) {
        this.mMvpView = MvpView;
    }

    @Override
    public void onDetach() {
        this.mMvpView = null;
    }

    public V getmMvpView() {
        return mMvpView;
    }
}
