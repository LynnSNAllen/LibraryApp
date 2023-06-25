package com.lynnpadc.libraryapp.delegates.library

import com.lynnpadc.libraryapp.data.vos.overview.BookVO

interface LibraryBookViewHolderDelegate {
    fun onTapLibraryBook(bookName:String,listId:Int)
    fun onTapLibraryBookOption(book: BookVO)
}