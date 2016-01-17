package com.example.weathernew;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.weathernew.POJO.WeatherModelObjects;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.logging.HttpLoggingInterceptor;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by AL_META on 1/06/16.
 */
public class FetchCurrentFragment extends Fragment {

    protected TextView txt_city, txt_status, txt_wind, txt_coordlat, txt_coordlong, txt_minTemp,
            txt_maxTemp, txt_clouds, txt_temp;

    protected ImageView weatherIcons;
    private static final String WEATHER_URL = "http://api.openweathermap.org/data/2.5/weather?q=";



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_current, container, false);

        txt_city = (TextView) view.findViewById(R.id.txt_city);
        txt_status = (TextView) view.findViewById(R.id.txt_status);
        txt_wind = (TextView) view.findViewById(R.id.txt_wind);
        txt_coordlat = (TextView) view.findViewById(R.id.txt_coordLat);
        txt_coordlong = (TextView) view.findViewById(R.id.txt_coordLong);
        txt_minTemp = (TextView) view.findViewById(R.id.txt_minTemp);
        txt_maxTemp = (TextView) view.findViewById(R.id.txt_maxTemp);
        txt_clouds = (TextView) view.findViewById(R.id.txt_clouds);
        txt_temp = (TextView) view.findViewById(R.id.txt_temp);

        weatherIcons = (ImageView) view.findViewById((R.id.weatherIcons));

        getWeatherReport();

        return view;
    }


    public void getWeatherReport() {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();

        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient httpClient = new OkHttpClient();
        // add your other interceptors …

        // add logging as last interceptor
        httpClient.interceptors().add(logging);  // <-- this is the important line!

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(WEATHER_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient)
                .build();

        WeatherAPIInterface service = retrofit.create(WeatherAPIInterface.class);

        Call<WeatherModelObjects> call = service.getWeatherReport();

        call.enqueue(new Callback<WeatherModelObjects>() {
            @Override
            public void onResponse(Response<WeatherModelObjects> response, Retrofit retrofit) {

                try {
                    String city = response.body().getName();

                    String status = response.body().getWeather().get(0).getDescription();

                    double wind = response.body().getWind().getDeg();

                    double coordLat = response.body().getCoord().getLat();

                    double coordLong = response.body().getCoord().getLon();

                    int minTemp = (int) response.body().getMain().getTempMin();

                    int maxTemp = (int) response.body().getMain().getTempMax();

                    int clouds = response.body().getClouds().getAll();

                    int temp = (int) response.body().getMain().getTemp();


                    txt_city.setText("\n City : " + city);
                    txt_status.setText("\n Status : " + status);
                    txt_wind.setText("\n Wind Speed : " + wind + "mph");
                    txt_coordlat.setText("\n Coordinate Lat : " + coordLat);
                    txt_coordlong.setText("\n Coordinate Long : " + coordLong);
                    txt_minTemp.setText("\n MinTemp : " + minTemp + " \u2109");
                    txt_maxTemp.setText("\n MaxTemp : " + maxTemp + " \u2109");
                    txt_clouds.setText("\n Clouds : " + clouds);
                    txt_temp.setText("\n Temp : " + temp + " \u2109");

                    String icons = response.body().getWeather().get(0).getIcon();
                    switch (icons) {

                        case "01d":
                            weatherIcons.setImageResource(R.drawable.clear);
                            break;
                        case "02d":
                            weatherIcons.setImageResource(R.drawable.light_clouds);
                            break;
                        case "03d":
                            weatherIcons.setImageResource(R.drawable.clouds);
                            break;
                        case "04d":
                            weatherIcons.setImageResource(R.drawable.clouds);
                            break;
                        case "09d":
                            weatherIcons.setImageResource(R.drawable.light_rain);
                            break;
                        case "10d":
                            weatherIcons.setImageResource(R.drawable.rain);
                            break;
                        case "11d":
                            weatherIcons.setImageResource(R.drawable.storm);
                            break;
                        case "13d":
                            weatherIcons.setImageResource(R.drawable.snow);
                            break;
                        case "50d":
                            weatherIcons.setImageResource(R.drawable.fog);
                            break;
                        default:
                            weatherIcons.setImageResource(R.drawable.clear);

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }
}
