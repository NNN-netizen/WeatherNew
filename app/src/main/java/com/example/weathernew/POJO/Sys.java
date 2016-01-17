package com.example.weathernew.POJO;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Sys {

    private int type;
    private int id;
    private double message;
    private String country;
    private int sunrise;
    private int sunset;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Sys() {
    }

    /**
     *
     * @param message
     * @param id
     * @param sunset
     * @param sunrise
     * @param type
     * @param country
     */
    public Sys(int type, int id, double message, String country, int sunrise, int sunset) {
        this.type = type;
        this.id = id;
        this.message = message;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    /**
     *
     * @return
     * The type
     */
    public int getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(int type) {
        this.type = type;
    }

    public Sys withType(int type) {
        this.type = type;
        return this;
    }

    /**
     *
     * @return
     * The id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(int id) {
        this.id = id;
    }

    public Sys withId(int id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @return
     * The message
     */
    public double getMessage() {
        return message;
    }

    /**
     *
     * @param message
     * The message
     */
    public void setMessage(double message) {
        this.message = message;
    }

    public Sys withMessage(double message) {
        this.message = message;
        return this;
    }

    /**
     *
     * @return
     * The country
     */
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param country
     * The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    public Sys withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     *
     * @return
     * The sunrise
     */
    public int getSunrise() {
        return sunrise;
    }

    /**
     *
     * @param sunrise
     * The sunrise
     */
    public void setSunrise(int sunrise) {
        this.sunrise = sunrise;
    }

    public Sys withSunrise(int sunrise) {
        this.sunrise = sunrise;
        return this;
    }

    /**
     *
     * @return
     * The sunset
     */
    public int getSunset() {
        return sunset;
    }

    /**
     *
     * @param sunset
     * The sunset
     */
    public void setSunset(int sunset) {
        this.sunset = sunset;
    }

    public Sys withSunset(int sunset) {
        this.sunset = sunset;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}