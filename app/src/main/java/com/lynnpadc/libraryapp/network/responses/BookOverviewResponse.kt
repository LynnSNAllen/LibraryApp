package com.lynnpadc.libraryapp.network.responses

import com.google.gson.annotations.SerializedName
import com.lynnpadc.libraryapp.data.vos.overview.BookOverviewVO

data class BookOverviewResponse(

    @SerializedName("status")
    val status: String?,

    @SerializedName("copyright")
    val copyright: String?,

    @SerializedName("num_results")
    val numResults: Int?,

    @SerializedName("results")
    val results: BookOverviewVO?
)