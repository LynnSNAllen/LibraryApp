package com.lynnpadc.libraryapp.mvp.presenters

import com.lynnpadc.libraryapp.mvp.views.BookSearchView

interface BookSearchPresenter: IBasePresenter {
    fun initView(view: BookSearchView)

}