package com.example.viet.weatherapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by viet on 25/08/2017.
 */

public class Sys {
    @SerializedName("type")
    @Expose
    int type;
    @SerializedName("id")
    @Expose
    float id;
    @SerializedName("message")
    @Expose
    float message;
    @SerializedName("country")
    @Expose
    String country;
    @SerializedName("sunrise")
    @Expose
    float sunrise;
    @SerializedName("sunset")
    @Expose
    float sunset;

    public Sys(int type, float id, float message, String country, float sunrise, float sunset) {
        this.type = type;
        this.id = id;
        this.message = message;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    @Override
    public String toString() {
        return "Sys - type : " + type
                + " - id : " + id
                + " - message : " + message
                + " - country : " + country
                + " - sunrise : " + sunrise
                + " - sunset : " + sunset;
    }

    public float getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public float getMessage() {
        return message;
    }

    public void setMessage(float message) {
        this.message = message;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getSunrise() {
        return sunrise;
    }

    public void setSunrise(float sunrise) {
        this.sunrise = sunrise;
    }

    public float getSunset() {
        return sunset;
    }

    public void setSunset(float sunset) {
        this.sunset = sunset;
    }
}
