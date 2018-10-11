package pushnotifications.com.wetherreportktl

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface APIInterface {

    @Headers("x-api-key:76032d7be8c2f7cd29c820e37207e15a")
    @GET("data/2.5/forecast/daily?q=Chennai&mode=json&units=metric&cnt=1")
    //fun getweatherData(@Query("api_key") apiKey: String): Call<WeatherResponse>
    abstract fun getweatherData(): Call<WeatherResponse>
}