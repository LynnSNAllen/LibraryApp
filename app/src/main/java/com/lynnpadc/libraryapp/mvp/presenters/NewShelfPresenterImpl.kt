package com.lynnpadc.libraryapp.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import com.lynnpadc.libraryapp.data.models.LibraryModel
import com.lynnpadc.libraryapp.data.models.LibraryModelImpl
import com.lynnpadc.libraryapp.data.vos.ShelfVO
import com.lynnpadc.libraryapp.mvp.views.NewShelfView

class NewShelfPresenterImpl: ViewModel(), NewShelfPresenter{

    private var mView:NewShelfView? = null
    private val mLibraryModel: LibraryModel = LibraryModelImpl

    override fun initView(view: NewShelfView) {
        mView = view
    }

    override fun insertShelf(shelf: ShelfVO) {
        mLibraryModel.insertShelf(shelf)
    }

    override fun onTapBack() {
        mView?.navigateToBackScreen()
    }

    override fun onUiReady(owner: LifecycleOwner) {
    }
}