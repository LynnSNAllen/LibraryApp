package com.lynnpadc.libraryapp.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import com.lynnpadc.libraryapp.data.vos.overview.BookVO
import com.lynnpadc.libraryapp.mvp.views.BookDetailView

interface BookDetailPresenter: IBasePresenter {

    fun initView(view: BookDetailView)
    fun onUiReadyForBookDetail(owner: LifecycleOwner, listName:String, listId:Int, previousPlace:String)

    fun insertBookIntoLibrary(book: BookVO?)

    fun onTapBack()
    fun onTapAboutBook()
    fun onTapRatingAndReview()
}