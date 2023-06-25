package com.lynnpadc.libraryapp.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import com.lynnpadc.libraryapp.delegates.home.BookViewHolderDelegate
import com.lynnpadc.libraryapp.mvp.views.BookListView

interface BookListPresenter: IBasePresenter, BookViewHolderDelegate {

    fun initView(view: BookListView)
    fun onUiReadyForBookList(owner: LifecycleOwner, listName:String)
    fun deleteTheWholeBookList()
    fun onTapBack()
}