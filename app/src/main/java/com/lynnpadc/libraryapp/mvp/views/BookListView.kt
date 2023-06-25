package com.lynnpadc.libraryapp.mvp.views

import com.lynnpadc.libraryapp.data.vos.list.BookListVO

interface BookListView: IBaseView {

    fun showBookList(bookList: List<BookListVO>)

    fun navigateToBookDetailScreen(bookName:String,listId:Int)
    fun onTapBookOption()
    fun navigateToBackScreen()
}