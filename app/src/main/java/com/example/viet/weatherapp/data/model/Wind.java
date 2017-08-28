package com.example.viet.weatherapp.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by viet on 25/08/2017.
 */

public class Wind {
    @SerializedName("speed")
    @Expose
    float speed;
    @SerializedName("deg")
    @Expose
    float deg;

    public Wind(float speed, float deg) {
        this.speed = speed;
        this.deg = deg;
    }

    @Override
    public String toString() {
        return "Wind - speed : " + speed
                + " - deg : " + deg;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getDeg() {
        return deg;
    }

    public void setDeg(float deg) {
        this.deg = deg;
    }
}
