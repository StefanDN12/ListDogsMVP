package com.stefan.listdogsmvp.interfaces

import com.stefan.listdogsmvp.model.dtClases.characterDtModel

interface JikanModelInterface {
    suspend fun obtainCharacter():characterDtModel

}