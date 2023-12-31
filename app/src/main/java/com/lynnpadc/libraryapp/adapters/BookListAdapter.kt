package com.lynnpadc.libraryapp.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lynnpadc.libraryapp.R
import com.lynnpadc.libraryapp.data.vos.list.BookListVO
import com.lynnpadc.libraryapp.delegates.home.BookViewHolderDelegate
import com.lynnpadc.libraryapp.views.viewholders.home.BookListViewHolder

class BookListAdapter(
    private val delegate: BookViewHolderDelegate
): RecyclerView.Adapter<BookListViewHolder>() {

    private var mBookList: List<BookListVO> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_book_list, parent, false)
        return BookListViewHolder(view.rootView, delegate)
    }

    override fun getItemCount(): Int {
        return mBookList.count()
    }

    override fun onBindViewHolder(holder: BookListViewHolder, position: Int) {
        if (mBookList.isNotEmpty()){
            holder.bindData(mBookList[position])
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(bookList: List<BookListVO>) {
        mBookList = bookList
        notifyDataSetChanged()
    }
}