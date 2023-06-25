package com.lynnpadc.libraryapp.mvp.presenters

import com.lynnpadc.libraryapp.delegates.library.ShelvesListViewHolderDelegate
import com.lynnpadc.libraryapp.mvp.views.LibraryYourShelvesView

interface LibraryYourShelvesPresenter: IBasePresenter, ShelvesListViewHolderDelegate {
    fun initView(view: LibraryYourShelvesView)
}