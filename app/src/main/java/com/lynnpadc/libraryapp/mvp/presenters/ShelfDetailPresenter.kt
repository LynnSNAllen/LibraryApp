package com.lynnpadc.libraryapp.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import com.lynnpadc.libraryapp.data.vos.ShelfVO
import com.lynnpadc.libraryapp.data.vos.overview.BookVO
import com.lynnpadc.libraryapp.delegates.library.LibraryChipViewHolderDelegate
import com.lynnpadc.libraryapp.mvp.views.ShelfDetailView

interface ShelfDetailPresenter: IBasePresenter, LibraryChipViewHolderDelegate {

    fun initView(view: ShelfDetailView)
    fun onUiReadyForShelfDetail(owner: LifecycleOwner, shelfId:Int)

    fun deleteShelf(shelfId: Int)
    fun updateShelf(shelf: ShelfVO)
    fun removeBook(title: String)

    fun sortByTitle() : List<BookVO>?
    fun sortByAuthor() : List<BookVO>?

    fun onTapBack()
    fun onTapOption()
    fun onTapView()
    fun onTapSort()
    fun onTapClearChip()
}