package com.lynnpadc.libraryapp.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import com.lynnpadc.libraryapp.data.models.LibraryModel
import com.lynnpadc.libraryapp.data.models.LibraryModelImpl
import com.lynnpadc.libraryapp.data.vos.overview.BookVO
import com.lynnpadc.libraryapp.mvp.views.BookListView

class BookListPresenterImpl: ViewModel(), BookListPresenter {

    private var mView:BookListView? = null
    private val mLibraryModel: LibraryModel = LibraryModelImpl

    override fun initView(view: BookListView) {
        mView = view
    }

    override fun onUiReadyForBookList(owner: LifecycleOwner, listName: String) {
        mLibraryModel.getBookList(listName = listName, onFailure = {
            mView?.showError(it)
        })?.observe(owner) {
            mView?.showBookList(it)
        }
    }

    override fun deleteTheWholeBookList() {
        mLibraryModel.deleteTheWholeBookList()
    }

    override fun onTapBack() {
        mView?.navigateToBackScreen()
    }

    override fun onUiReady(owner: LifecycleOwner) {
    }

    override fun onTapBook(bookName: String, listId: Int) {
        mView?.navigateToBookDetailScreen(bookName,listId)
    }

    override fun onTapBookOption(book: BookVO?, listId: Int, listName: String) {
        mView?.onTapBookOption()
    }
}