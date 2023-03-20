package com.stefan.listdogsmvp.interactor

import com.stefan.listdogsmvp.interfaces.JikanPresenter
import com.stefan.listdogsmvp.model.JikanModel
import com.stefan.listdogsmvp.view.ViewJinkan

class JikanPresenterImpl(jikanView: ViewJinkan): JikanPresenter {

    private var model = JikanModel(this)

    override suspend fun obtainCharacter() {
        model.obtainCharacter()
    }
}