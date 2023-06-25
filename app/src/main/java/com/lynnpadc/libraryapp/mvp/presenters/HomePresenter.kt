package com.lynnpadc.libraryapp.mvp.presenters

import com.lynnpadc.libraryapp.data.vos.overview.BookVO
import com.lynnpadc.libraryapp.delegates.home.BannerViewHolderDelegate
import com.lynnpadc.libraryapp.delegates.home.BookViewHolderDelegate
import com.lynnpadc.libraryapp.mvp.views.HomeView

interface HomePresenter: IBasePresenter, BannerViewHolderDelegate, BookViewHolderDelegate {

    fun initView(view: HomeView)
    fun insertBookIntoLibrary(book: BookVO?)
    fun onTapGoToBookListScreen(listName:String, listId: Int)
}