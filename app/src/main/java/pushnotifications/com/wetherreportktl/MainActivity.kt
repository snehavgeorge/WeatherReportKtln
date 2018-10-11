package pushnotifications.com.wetherreportktl

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    val API_KEY = "x-api-key:76032d7be8c2f7cd29c820e37207e15a"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val reportTxt = findViewById<TextView>(R.id.reportTxt)

        val baseURL = "http://api.openweathermap.org/"
        var retrofit: Retrofit? = null
        retrofit = Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()


      /*  return retrofit.create(APIInterface::class.java);
        var APIInterface = APIClient.client.create(APIInterface::class.java)
        val call = APIInterface.getTopRatedMovies(API_KEY)
        call.enqueue(object : Callback<WeatherResponse> {
            override fun onResponse(call: Call<WeatherResponse>, response: Response<WeatherResponse>) {

            }

            override fun onFailure(call: Call<WeatherResponse>?, t: Throwable?) {

            }
        })*/
        val apiInterface = retrofit.create<APIInterface>(APIInterface::class.java!!)

        val call = apiInterface.getweatherData()
        call.enqueue(object : Callback<WeatherResponse> {
            override fun onResponse(call: Call<WeatherResponse>, response: Response<WeatherResponse>) {
                val weatherRespose = response.body()
               Log.e("MainActivity", "Response:::::" + Gson().toJson(weatherRespose))
                reportTxt.setText("City Name : " + weatherRespose!!.city!!.name + "\n" +
                        "Lat : " + weatherRespose!!.city!!.coord!!.lat + "\n" +
                        "lon :" + weatherRespose!!.city!!.coord!!.lon + "\n")
            }

            override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {
                Log.e("MainActivity", "Failure:::::" + t.message)
            }
        })
    }
}
