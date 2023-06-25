package com.lynnpadc.libraryapp.mvp.presenters

import com.lynnpadc.libraryapp.data.vos.ShelfVO
import com.lynnpadc.libraryapp.mvp.views.NewShelfView

interface NewShelfPresenter: IBasePresenter {

    fun initView(view: NewShelfView)
    fun insertShelf(shelf: ShelfVO)

    fun onTapBack()
}