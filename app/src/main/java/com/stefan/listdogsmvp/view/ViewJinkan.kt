package com.stefan.listdogsmvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.stefan.listdogsmvp.R
import com.stefan.listdogsmvp.databinding.ActivityMainBinding
import com.stefan.listdogsmvp.interactor.JikanPresenterImpl
import com.stefan.listdogsmvp.interfaces.JikanPresenter
import com.stefan.listdogsmvp.model.dtClases.characterDtModel
import com.stefan.listdogsmvp.view.adapters.JikanAdapter
import kotlinx.coroutines.*
import retrofit2.Response

class ViewJinkan : AppCompatActivity() {

    private lateinit var  jikanAppBinding: ActivityMainBinding
    private lateinit var jikanPresenter:JikanPresenter
    private lateinit var jikanAdapter: JikanAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        jikanAppBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = jikanAppBinding.root
        setContentView(view)

        init()

        jikanAdapter = JikanAdapter()
        var job1 = CoroutineScope(Dispatchers.IO).launch {
           jikanAdapter.characters.add(obtainCharacter())
            Log.d("PRUEBA", obtainCharacter().toString())
        }

        while (job1.isActive){
            jikanAdapter.notifyDataSetChanged()
        }

        recyclerView.adapter = jikanAdapter

    }


    fun init(){
        jikanPresenter = JikanPresenterImpl(this)
        recyclerView = jikanAppBinding.ReciclerJikan
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }


  suspend fun obtainCharacter(): characterDtModel{
      val character: characterDtModel
      withContext(Dispatchers.IO){
         character = jikanPresenter.obtainCharacter()
      }
      return character
    }
}