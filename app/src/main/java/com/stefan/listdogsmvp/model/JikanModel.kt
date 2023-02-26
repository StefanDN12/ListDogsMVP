package com.stefan.listdogsmvp.model

import com.stefan.listdogsmvp.interactor.JikanPresenterImpl
import com.stefan.listdogsmvp.interfaces.JikanModelInterface

class JikanModel (var jinkanPresenter: JikanPresenterImpl): JikanModelInterface {

    private lateinit var jinkanPrst:JikanPresenterImpl

    init {
        init()
    }
    
    fun init(){
        jinkanPrst = jinkanPresenter
    }
    override fun obtainCharacter() {
        TODO("Not yet implemented")
    }
}