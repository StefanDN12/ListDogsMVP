package com.stefan.listdogsmvp.model

import android.util.Log
import com.stefan.listdogsmvp.interactor.JikanPresenterImpl
import com.stefan.listdogsmvp.interfaces.JikanModelInterface
import com.stefan.listdogsmvp.model.dtClases.characterDtModel
import com.stefan.listdogsmvp.network.ApiService.ApiService
import com.stefan.listdogsmvp.network.JikanApiImpl
import retrofit2.Call
import retrofit2.Response

class JikanModel (var jinkanPresenter: JikanPresenterImpl): JikanModelInterface {

    private lateinit var jinkanPrst:JikanPresenterImpl
    private var jinkanApi: JikanApiImpl

    init {
        jinkanApi = JikanApiImpl()
        init()
    }
    
    fun init(){
        jinkanPrst = jinkanPresenter

    }
    override suspend fun obtainCharacter() {
        val call:Response<characterDtModel> = jinkanApi.getRetrofit().create(ApiService::class.java).getCharacterById(5)
        Log.d("Prueba", call.body().toString())
    }

}