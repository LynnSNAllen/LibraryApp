package com.lynnpadc.libraryapp.mvp.views

import com.lynnpadc.libraryapp.data.vos.ShelfVO
import com.lynnpadc.libraryapp.data.vos.overview.BookVO

interface AddToShelvesView: IBaseView {

    fun showShelfList(shelfList:List<ShelfVO>)
    fun showBook(book: BookVO?)

    fun closeAddToShelvesActivity()

    fun onClickCheckBox(shelfId:Int, checked:Boolean)
}