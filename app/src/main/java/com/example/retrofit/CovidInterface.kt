package com.example.retrofit

import com.example.pojo.ResponseCountry
import com.example.pojo.ResponseSummary
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CovidInterface {

    // Path Url yang dituju adalah https://api.covid19api.com/summary,
    // karena base url-nya https://api.covid19api.com/
    // maka hanya perlu menulis summary saja
    @GET("summary")
    // response berupa data class dari pojo ResponseSummary
    suspend fun getSummary(): Response<ResponseSummary>

    @GET("dayone/country/{country_name}")


    suspend fun getCountryData(@Path("country_name") country_name: String): Response<List<ResponseCountry>>
}