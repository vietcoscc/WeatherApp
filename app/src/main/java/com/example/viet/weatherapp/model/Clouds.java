package com.example.viet.weatherapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by viet on 25/08/2017.
 */

public class Clouds {
    @SerializedName("all")
    @Expose
    float all;

    public Clouds(float all) {
        this.all = all;
    }

    public float getAll() {
        return all;
    }

    public void setAll(float all) {
        this.all = all;
    }

    @Override
    public String toString() {
        return "Clouds - all : " + all;
    }
}
