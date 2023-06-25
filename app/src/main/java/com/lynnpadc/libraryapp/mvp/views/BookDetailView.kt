package com.lynnpadc.libraryapp.mvp.views

import com.lynnpadc.libraryapp.data.vos.SearchBookVO
import com.lynnpadc.libraryapp.data.vos.list.BookDetailVO
import com.lynnpadc.libraryapp.data.vos.overview.BookCategoryVO
import com.lynnpadc.libraryapp.data.vos.overview.BookVO

interface BookDetailView: IBaseView {

    fun getCategoryByName(category: BookCategoryVO)
    fun getBookFromBookList(bookDetail: BookDetailVO)
    fun getAllBooksFromLibrary(bookList: List<BookVO>)


    fun navigateToRatingAndReviewScreen()
    fun navigateToAboutBookScreen()
    fun navigateToBackScreen()
    fun showSearchBook(bookList: List<SearchBookVO>)
}