package com.stefan.listdogsmvp.network.ApiService

import com.stefan.listdogsmvp.model.dtClases.characterDtModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("characters/{id}")
    suspend fun getCharacterById(@Path("id") id:Int): Response<characterDtModel>
}