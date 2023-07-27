package com.plcoding.weatherapp.domain.data.remote.repository

import com.plcoding.weatherapp.domain.data.remote.WeatherApi
import com.plcoding.weatherapp.domain.data.remote.mappers.toweatherInfo
import com.plcoding.weatherapp.domain.repositiry.WeatherRepository
import com.plcoding.weatherapp.domain.util.Resource
import com.plcoding.weatherapp.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val Api: WeatherApi
): WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try{
            Resource.Success(
                data = Api.getWeatherData(
                    lat = lat,
                    long = long
                ).toweatherInfo()
            )
        }
        catch (e: Exception)
        {
            e.printStackTrace()
            Resource.Error(e.message ?: " An unkown error ")
        }

    }
}