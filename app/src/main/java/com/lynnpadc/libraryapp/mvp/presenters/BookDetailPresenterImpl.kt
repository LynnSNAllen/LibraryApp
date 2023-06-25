package com.lynnpadc.libraryapp.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import com.lynnpadc.libraryapp.data.models.LibraryModel
import com.lynnpadc.libraryapp.data.models.LibraryModelImpl
import com.lynnpadc.libraryapp.data.vos.overview.BookVO
import com.lynnpadc.libraryapp.mvp.views.BookDetailView

class BookDetailPresenterImpl: ViewModel(), BookDetailPresenter {

    private var mView: BookDetailView? = null
    private val mLibraryModel: LibraryModel = LibraryModelImpl

    override fun initView(view: BookDetailView) {
        mView = view
    }

    override fun onUiReadyForBookDetail(
        owner: LifecycleOwner,
        listName: String,
        listId: Int,
        previousPlace: String
    ) {
        when (previousPlace) {
            "HomeFragment" -> {
                mLibraryModel.getCategoryByListId(listId = listId)?.observe(owner) {
                    it?.let { category ->
                        mView?.getCategoryByName(category)
                    }
                }
            }

            "BookListActivity" -> {
                mLibraryModel.getBookFromBookListById(listId)?.observe(owner) {
                    it.bookDetails?.get(0)?.let { bookDetail ->
                        mView?.getBookFromBookList(bookDetail)
                    }
                }
            }

            "BookSearchActivity" -> {
                mLibraryModel.getSearchBookList()?.observe(owner) {
                    mView?.showSearchBook(it)
                }
            }

            else -> {
                mLibraryModel.getAllBooksFromLibrary()?.observe(owner) {
                    mView?.getAllBooksFromLibrary(it)
                }
            }
        }
    }

    override fun insertBookIntoLibrary(book: BookVO?) {
        mLibraryModel.insertBookIntoLibrary(book)
    }

    override fun onTapBack() {
        mView?.navigateToBackScreen()
    }

    override fun onTapAboutBook() {
        mView?.navigateToAboutBookScreen()
    }

    override fun onTapRatingAndReview() {
        mView?.navigateToRatingAndReviewScreen()
    }

    override fun onUiReady(owner: LifecycleOwner) {
    }
}