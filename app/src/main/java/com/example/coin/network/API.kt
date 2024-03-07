package com.example.coin.network

import com.example.coin.network.model.CurrentPriceList
import retrofit2.http.GET

interface API {

    @GET("public/ticker/All_KRW")
    suspend fun getCurrentCoinList() : CurrentPriceList
}