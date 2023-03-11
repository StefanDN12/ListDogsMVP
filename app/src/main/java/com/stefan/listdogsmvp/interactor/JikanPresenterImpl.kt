package com.stefan.listdogsmvp.interactor

import com.stefan.listdogsmvp.interfaces.JikanPresenter
import com.stefan.listdogsmvp.model.JikanModel
import com.stefan.listdogsmvp.view.ViewJinkan

class JikanPresenterImpl(jikanView: ViewJinkan): JikanPresenter {



    override suspend fun obtainCharacter() {
        TODO("Not yet implemented")
    }
}