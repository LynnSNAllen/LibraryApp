package com.lynnpadc.libraryapp.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lynnpadc.libraryapp.R
import com.lynnpadc.libraryapp.data.vos.overview.BookVO
import com.lynnpadc.libraryapp.delegates.home.BannerViewHolderDelegate
import com.lynnpadc.libraryapp.views.viewholders.home.AudioBookBannerViewHolder
import com.lynnpadc.libraryapp.views.viewholders.home.BookBannerViewHolder
import com.lynnpadc.libraryapp.views.viewholders.home.IBookBannerViewHolder

class BookBannerAdapter(
    private val bookType: Int,
    private val delegate: BannerViewHolderDelegate
): RecyclerView.Adapter<IBookBannerViewHolder>() {

    private var mBookList: List<BookVO> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IBookBannerViewHolder {
        return if (bookType == 0){
            val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_book_banner, parent, false)
            BookBannerViewHolder(view.rootView, delegate)
        }else{
            val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_audiobook_banner, parent, false)
            AudioBookBannerViewHolder(view.rootView, delegate)
        }
    }

    override fun getItemCount(): Int {
        return mBookList.count()
    }

    override fun onBindViewHolder(holder: IBookBannerViewHolder, position: Int) {
        when (bookType) {
            0 -> (holder as BookBannerViewHolder).bindData(mBookList[position])
            1 -> (holder as AudioBookBannerViewHolder).bindData(mBookList[position])
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setNewData(bookList: List<BookVO>?) {
        mBookList = bookList?.distinct() ?: listOf()
        notifyDataSetChanged()
    }
}