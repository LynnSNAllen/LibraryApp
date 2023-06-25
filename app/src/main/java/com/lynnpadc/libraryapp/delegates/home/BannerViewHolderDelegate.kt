package com.lynnpadc.libraryapp.delegates.home

import com.lynnpadc.libraryapp.data.vos.overview.BookVO

interface BannerViewHolderDelegate {
    fun onTapBannerBook(bookName:String, listId:Int)
    fun onTapBannerBookOption(book: BookVO?, listId: Int, listName: String)
}