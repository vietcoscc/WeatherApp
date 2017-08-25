package com.example.viet.weatherapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by viet on 25/08/2017.
 */

public class Main {
    @SerializedName("temp")
    @Expose
    float temp;
    @SerializedName("pressure")
    @Expose
    float pressure;
    @SerializedName("humidity")
    @Expose
    float humidity;
    @SerializedName("temp_min")
    @Expose
    float tempMin;
    @SerializedName("temp_max")
    @Expose
    float tempMax;

    public Main(float temp, float pressure, float humidity, float tempMin, float tempMax) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
    }

    @Override
    public String toString() {
        return "Main - temp : " + temp
                + " - pressure : " + pressure
                + " - humidity : " + humidity
                + " - tempMin : " + tempMin
                + " - tempMax : " + tempMax;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getTempMin() {
        return tempMin;
    }

    public void setTempMin(float tempMin) {
        this.tempMin = tempMin;
    }

    public float getTempMax() {
        return tempMax;
    }

    public void setTempMax(float tempMax) {
        this.tempMax = tempMax;
    }
}
