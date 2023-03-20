package com.stefan.listdogsmvp.interfaces

import com.stefan.listdogsmvp.model.dtClases.characterDtModel

interface JikanPresenter {
    suspend fun obtainCharacter(): characterDtModel
}