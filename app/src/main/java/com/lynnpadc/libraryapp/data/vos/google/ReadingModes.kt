package com.lynnpadc.libraryapp.data.vos.google

import com.google.gson.annotations.SerializedName

data class ReadingModes(

    @SerializedName("image")
    val image: Boolean?,

    @SerializedName("text")
    val text: Boolean?
)
