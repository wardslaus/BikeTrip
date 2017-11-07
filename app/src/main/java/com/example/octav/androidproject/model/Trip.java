package com.example.octav.androidproject.model;

import java.util.ArrayList;


/**
 * Created by lenovo on 11/7/2017.
 */

public class Trip {

    private String title;

    private int complexity;

    private String description;

    private ArrayList<String> stops;

    private int duration;

    //CONSTRUCTORS
    public Trip() {

    }

    public Trip(String title) {
        this.title = title;
    }

    //GETTERS
    public String getTitle() {
        return title;
    }

    public int getComplexity() {
        return complexity;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<String> getStops() {
        return stops;
    }

    public int getDuration() {
        return duration;
    }

    //SETTER WITH BUILDING FUNCTIONALITY
    public Trip setTitle(String title) {
        this.title = title;
        return this;
    }

    public Trip setComplexity(int complexity) {
        this.complexity = complexity;
        return this;
    }

    public Trip setDescription(String description) {
        this.description = description;
        return this;
    }

    public Trip setStops(ArrayList<String> stops) {
        this.stops = stops;
        return this;
    }

    public Trip setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(!(obj instanceof Trip))
            return false;

        return ((Trip) obj).getTitle().equals(this.title);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
       return builder.append("TRIP: \n\t")
                .append("Title: " + this.title + "\n\t")
                 .append("Complexity: " + this.complexity+ "\n\t")
                  .append("Duration: " + this.duration + "minutes\n\t")
                   .append("Stops: " + this.stops.toString() + "\n\t")
                    .append("Description: " + this.description + "\n").toString();
    }
}
