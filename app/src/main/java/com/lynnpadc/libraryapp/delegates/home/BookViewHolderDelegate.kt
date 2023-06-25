package com.lynnpadc.libraryapp.delegates.home

import com.lynnpadc.libraryapp.data.vos.overview.BookVO

interface BookViewHolderDelegate {
    fun onTapBook(bookName:String,listId:Int)
    fun onTapBookOption(book: BookVO?, listId: Int, listName: String)
}