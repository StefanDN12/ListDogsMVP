package com.stefan.listdogsmvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.stefan.listdogsmvp.R
import com.stefan.listdogsmvp.interactor.JikanPresenterImpl
import com.stefan.listdogsmvp.interfaces.JikanPresenter

class ViewJinkan : AppCompatActivity() {

    private lateinit var jikanPresenter:JikanPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }


    fun init(){
        jikanPresenter = JikanPresenterImpl(this)
    }


    fun obtainCharacter(){
        //jikanPresenter.obtainCharacter()
    }
}