package com.stefan.listdogsmvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.stefan.listdogsmvp.R
import com.stefan.listdogsmvp.interactor.JikanPresenterImpl
import com.stefan.listdogsmvp.interfaces.JikanPresenter
import kotlinx.coroutines.*

class ViewJinkan : AppCompatActivity() {

    private lateinit var jikanPresenter:JikanPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        GlobalScope.launch {
            obtainCharacter()
        }


    }


    fun init(){
        jikanPresenter = JikanPresenterImpl(this)
    }


  suspend fun obtainCharacter(){
      withContext(Dispatchers.IO){
          jikanPresenter.obtainCharacter()
      }
    }
}