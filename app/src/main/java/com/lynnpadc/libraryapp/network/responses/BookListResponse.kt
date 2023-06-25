package com.lynnpadc.libraryapp.network.responses

import com.google.gson.annotations.SerializedName
import com.lynnpadc.libraryapp.data.vos.list.BookListVO

data class BookListResponse(

    @SerializedName("status")
    val status: String?,

    @SerializedName("copyright")
    val copyright: String?,

    @SerializedName("num_results")
    val numResults: Int?,

    @SerializedName("last_modified")
    val lastModified: String?,

    @SerializedName("results")
    val results: List<BookListVO>?
)