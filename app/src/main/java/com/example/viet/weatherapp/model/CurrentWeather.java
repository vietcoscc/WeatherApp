package com.example.viet.weatherapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by viet on 25/08/2017.
 */

public class CurrentWeather {
    @SerializedName("coord")
    @Expose
    Coord coord;
    @SerializedName("weather")
    @Expose
    ArrayList<Weather> arrWeather;
    @SerializedName("base")
    @Expose
    String base;
    @SerializedName("main")
    @Expose
    Main main;
    @SerializedName("visiblity")
    @Expose
    int visiblity;
    @SerializedName("dt")
    @Expose
    int dt;
    @SerializedName("wind")
    @Expose
    Wind wind;
    @SerializedName("clouds")
    @Expose
    Clouds clouds;
    @SerializedName("sys")
    @Expose
    Sys sys;
    @SerializedName("id")
    @Expose
    int id;
    @SerializedName("cod")
    @Expose
    int cod;

    public CurrentWeather(Coord coord,
                          ArrayList<Weather> arrWeather,
                          String base,
                          Main main,
                          int visiblity,
                          int dt,
                          Wind wind,
                          Clouds clouds,
                          Sys sys,
                          int id,
                          int cod) {
        this.coord = coord;
        this.arrWeather = arrWeather;
        this.base = base;
        this.main = main;
        this.visiblity = visiblity;
        this.dt = dt;
        this.wind = wind;
        this.clouds = clouds;
        this.sys = sys;
        this.id = id;
        this.cod = cod;
    }

    @Override
    public String toString() {
        return coord.toString() + "\n"
                + base + "\n"
                + main.toString() + "\n"
                + wind.toString() + "\n"
                + clouds.toString() + "\n"
                + sys.toString() + "\n";
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public ArrayList<Weather> getArrWeather() {
        return arrWeather;
    }

    public void setArrWeather(ArrayList<Weather> arrWeather) {
        this.arrWeather = arrWeather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public int getVisiblity() {
        return visiblity;
    }

    public void setVisiblity(int visiblity) {
        this.visiblity = visiblity;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
