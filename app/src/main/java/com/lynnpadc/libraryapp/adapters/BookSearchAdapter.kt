package com.lynnpadc.libraryapp.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lynnpadc.libraryapp.R
import com.lynnpadc.libraryapp.data.vos.overview.BookVO
import com.lynnpadc.libraryapp.delegates.library.LibraryBookViewHolderDelegate
import com.lynnpadc.libraryapp.views.viewholders.library.LibrarySmallListViewHolder

class BookSearchAdapter(
    private val delegate: LibraryBookViewHolderDelegate
): RecyclerView.Adapter<LibrarySmallListViewHolder>() {

    private var mBookList:List<BookVO> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LibrarySmallListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_library_book_small_list, parent, false)
        return LibrarySmallListViewHolder(view.rootView, delegate)
    }

    override fun getItemCount(): Int {
        return mBookList.count()
    }

    override fun onBindViewHolder(holder: LibrarySmallListViewHolder, position: Int) {
        if (mBookList.isNotEmpty()){
            holder.bindData(mBookList[position])
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(bookList: List<BookVO>?) {
        mBookList = bookList ?: listOf()
        notifyDataSetChanged()
    }
}