package com.lynnpadc.libraryapp.data.vos.overview

import com.google.gson.annotations.SerializedName

data class BookBuyLinkVO(

    @SerializedName("name")
    val name: String?,

    @SerializedName("url")
    val url: String?
)
