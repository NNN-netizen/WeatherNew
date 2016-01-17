package com.example.weathernew.POJO;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Main {


    private double temp;
    private int pressure;
    private int humidity;
    private double tempMin;
    private double tempMax;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Main() {
    }

    /**
     * @param humidity
     * @param pressure
     * @param tempMax
     * @param temp
     * @param tempMin
     */
    public Main(double temp, int pressure, int humidity, double tempMin, double tempMax) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
    }

    /**
     * @return The temp
     */
    public double getTemp() {
        return temp;
    }

    /**
     * @param temp The temp
     */
    public void setTemp(double temp) {
        this.temp = temp;
    }

    public Main withTemp(double temp) {
        this.temp = temp;
        return this;
    }

    /**
     * @return The pressure
     */
    public int getPressure() {
        return pressure;
    }

    /**
     * @param pressure The pressure
     */
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public Main withPressure(int pressure) {
        this.pressure = pressure;
        return this;
    }

    /**
     * @return The humidity
     */
    public int getHumidity() {
        return humidity;
    }

    /**
     * @param humidity The humidity
     */
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public Main withHumidity(int humidity) {
        this.humidity = humidity;
        return this;
    }

    /**
     * @return The tempMin
     */
    public double getTempMin() {
        return tempMin;
    }

    /**
     * @param tempMin The temp_min
     */
    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public Main withTempMin(double tempMin) {
        this.tempMin = tempMin;
        return this;
    }

    /**
     * @return The tempMax
     */
    public double getTempMax() {
        return tempMax;
    }

    /**
     * @param tempMax The temp_max
     */
    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    public Main withTempMax(double tempMax) {
        this.tempMax = tempMax;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Main withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
