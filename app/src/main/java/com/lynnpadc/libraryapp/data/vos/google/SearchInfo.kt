package com.lynnpadc.libraryapp.data.vos.google

import com.google.gson.annotations.SerializedName

data class SearchInfo(

    @SerializedName("textSnippet")
    val textSnippet: String?

)
