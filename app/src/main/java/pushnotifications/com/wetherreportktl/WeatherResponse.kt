package pushnotifications.com.wetherreportktl

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

open class WeatherResponse {



    @SerializedName("cod")
    @Expose
    open val cod: String? = null
    @SerializedName("city")
    @Expose
    open val city: CityModel? = null
    @SerializedName("message")
    @Expose
    open val message: String? = null
    @SerializedName("cnt")
    @Expose
    open val cnt: String? = null
    @SerializedName("list")
    @Expose
    open val list: List<DetailModel>? = null



    open class CityModel {

        @SerializedName("id")
        @Expose
        open val id: String? = null
        @SerializedName("name")
        @Expose
        open val name: String? = null
        @SerializedName("coord")
        @Expose
        open val coord: CoordinateModel? = null
        @SerializedName("country")
        @Expose
        open val country: String? = null
        @SerializedName("population")
        @Expose
        open val population: String? = null


        open class CoordinateModel {
            @SerializedName("lon")
            @Expose
            open val lon: String? = null
            @SerializedName("lat")
            @Expose
            open val lat: String? = null


        }


    }





    open class DetailModel {
        @SerializedName("dt")
        @Expose
        open val dt: String? = null
        @SerializedName("temp")
        @Expose
        open val temp: TempModel? = null
        @SerializedName("pressure")
        @Expose
        open val pressure: String? = null
        @SerializedName("humidity")
        @Expose
        open val humidity: String? = null
        @SerializedName("weather")
        @Expose
        open val weather: List<WeatherModel>? = null
        @SerializedName("speed")
        @Expose
        open val speed: String? = null
        @SerializedName("deg")
        @Expose
        open val deg: String? = null
        @SerializedName("clouds")
        @Expose
        open val clouds: String? = null


        open class TempModel {
            @SerializedName("day")
            @Expose
            open val day: String? = null
            @SerializedName("min")
            @Expose
            open val min: String? = null
            @SerializedName("max")
            @Expose
            open val max: String? = null
            @SerializedName("night")
            @Expose
            open val night: String? = null
            @SerializedName("eve")
            @Expose
            open val eve: String? = null
            @SerializedName("morn")
            @Expose
            open val morn: String? = null

        }




        open class WeatherModel {
            @SerializedName("id")
            @Expose
            open val weatherId: String? = null
            @SerializedName("main")
            @Expose
            open val main: String? = null
            @SerializedName("description")
            @Expose
            open val description: String? = null
            @SerializedName("icon")
            @Expose
            open val icon: String? = null

        }


    }


}