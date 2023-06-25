package com.lynnpadc.libraryapp.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import com.lynnpadc.libraryapp.data.models.LibraryModel
import com.lynnpadc.libraryapp.data.models.LibraryModelImpl
import com.lynnpadc.libraryapp.mvp.views.BookSearchView

class BookSearchPresenterImpl: ViewModel(), BookSearchPresenter {

    private var mView:BookSearchView? = null
    private val mLibraryModel: LibraryModel = LibraryModelImpl

    override fun initView(view: BookSearchView) {
        mView = view
    }

    override fun onUiReady(owner: LifecycleOwner) {
    }
}