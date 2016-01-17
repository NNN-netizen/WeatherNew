package com.example.weathernew;

import com.example.weathernew.POJO.WeatherModelObjects;
import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by AL_META on 1/06/2016.
 */
public interface WeatherAPIInterface {

    @GET("/data/2.5/weather?q=New York&units=imperial&appid=6fc16eef9b04bb25d32af3643ec942f1")
    Call<WeatherModelObjects> getWeatherReport();
}
