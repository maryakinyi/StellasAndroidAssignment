package com.example.androidassessment

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
     var retrofit = Retrofit
        .Builder().baseUrl("http://13.244.243.129/calculator/add")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    var retrofit2 = Retrofit
        .Builder().baseUrl("http://13.244.243.129/calculator/subtract")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var retrofit3 = Retrofit
        .Builder().baseUrl("http://13.244.243.129/calculator/multiply")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var retrofit4= Retrofit
        .Builder().baseUrl("http://13.244.243.129/calculator/divide")
        .addConverterFactory(GsonConverterFactory.create())
        .build()



        fun<T>buildApiClient(apiInterface: Class<T>) {

        }
}
