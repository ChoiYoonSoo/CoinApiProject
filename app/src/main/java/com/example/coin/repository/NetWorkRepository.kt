package com.example.coin.repository

import com.example.coin.network.API
import com.example.coin.network.RetrofitInstance

class NetWorkRepository {

    private val client = RetrofitInstance.getInstance().create(API::class.java)

    suspend fun getCurrentCoinList() = client.getCurrentCoinList()
}