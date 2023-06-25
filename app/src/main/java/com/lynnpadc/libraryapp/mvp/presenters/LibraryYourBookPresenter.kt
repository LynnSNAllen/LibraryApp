package com.lynnpadc.libraryapp.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import com.lynnpadc.libraryapp.data.vos.overview.BookVO
import com.lynnpadc.libraryapp.delegates.library.LibraryChipViewHolderDelegate
import com.lynnpadc.libraryapp.mvp.views.LibraryYourBookView

interface LibraryYourBookPresenter: IBasePresenter, LibraryChipViewHolderDelegate {

    fun initView(view: LibraryYourBookView)
    fun onUiReadyForListName(owner: LifecycleOwner, listName:String)

    fun deleteBookByTitle(title:String)
    fun sortByTitle() : List<BookVO>?
    fun sortByAuthor() : List<BookVO>?

    fun onTapView()
    fun onTapSort()
    fun onTapClose()
}