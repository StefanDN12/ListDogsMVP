package com.stefan.listdogsmvp.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class JikanApiImpl {
    fun getRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://api.jikan.moe/v4/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}