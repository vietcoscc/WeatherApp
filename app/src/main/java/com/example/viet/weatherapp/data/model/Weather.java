package com.example.viet.weatherapp.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by viet on 25/08/2017.
 */

public class Weather {
    @SerializedName("id")
    @Expose
    int id;
    @SerializedName("main")
    @Expose
    String main;
    @SerializedName("description")
    @Expose
    String description;
    @SerializedName("icon")
    @Expose
    String icon;

    public Weather(int id, String main, String description, String icon) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Weather - id : " + id
                + " - main : " + main
                + " - description : " + description
                + " - icon : " + icon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
