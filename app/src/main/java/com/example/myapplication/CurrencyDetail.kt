package com.example.myapplication

import com.google.gson.annotations.SerializedName

class CurrencyDetail {

    @SerializedName("symbol")
    val symbol: String = ""

    @SerializedName("name")
    val name: String = ""

    @SerializedName("logo_url")
    val logo_url: String = ""

    @SerializedName("price")
    val price: Double = 0.0

    @SerializedName("high")
    val high: Double = 0.0
}