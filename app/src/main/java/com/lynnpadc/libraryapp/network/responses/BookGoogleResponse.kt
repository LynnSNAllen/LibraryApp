package com.lynnpadc.libraryapp.network.responses

import com.google.gson.annotations.SerializedName
import com.lynnpadc.libraryapp.data.vos.google.GoogleBookVO

data class BookGoogleResponse(

    @SerializedName("items")
    val items: List<GoogleBookVO>?,

    @SerializedName("kind")
    val kind: String?,

    @SerializedName("totalItems")
    val totalItems: Int?

)