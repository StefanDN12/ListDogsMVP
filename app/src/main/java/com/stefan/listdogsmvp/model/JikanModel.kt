package com.stefan.listdogsmvp.model

import com.stefan.listdogsmvp.interactor.JikanPresenterImpl
import com.stefan.listdogsmvp.interfaces.JikanModelInterface
import com.stefan.listdogsmvp.network.ApiService.ApiService
import com.stefan.listdogsmvp.network.JikanApiImpl

class JikanModel (var jinkanPresenter: JikanPresenterImpl): JikanModelInterface {

    private lateinit var jinkanPrst:JikanPresenterImpl
    private lateinit var jinkanApi: JikanApiImpl
    private lateinit var jikanApiService: ApiService

    init {
        init()
    }
    
    fun init(){
        jinkanPrst = jinkanPresenter
        jinkanApi.getRetrofit().create(jikanApiService::class.java)
    }
    override suspend fun obtainCharacter() {
        jikanApiService.getCharacterById(5)
    }
}