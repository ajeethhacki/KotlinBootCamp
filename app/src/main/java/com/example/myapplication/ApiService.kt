package com.example.myapplication

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("v1/currencies/ticker?key=demo-26240835858194712a4f8cc0dc635c7a&ids=BTC,ETH,XRP&interval=1d,30d&convert=")
    fun getCurrencyList(): Call<List<CurrencyDetail>>
}