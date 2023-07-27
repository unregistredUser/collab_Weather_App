package com.plcoding.weatherapp.domain.weather

data class WeatherInfo(
    val weatherDataForDay: Map<Int,List<WeatherData>>,
    val currWeatherData: WeatherData?
)
