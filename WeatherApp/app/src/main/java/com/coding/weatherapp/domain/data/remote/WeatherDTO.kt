package com.plcoding.weatherapp.domain.data.remote

import com.squareup.moshi.Json
import retrofit2.http.Field

//Data transfer object

data class WeatherDTO(
    @field:Json(name="hourly")
    val weatherData: WeatherDataDto
)

