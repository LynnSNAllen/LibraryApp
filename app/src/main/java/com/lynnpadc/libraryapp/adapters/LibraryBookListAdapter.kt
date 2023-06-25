package com.lynnpadc.libraryapp.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lynnpadc.libraryapp.R
import com.lynnpadc.libraryapp.data.vos.overview.BookVO
import com.lynnpadc.libraryapp.delegates.library.LibraryBookViewHolderDelegate
import com.lynnpadc.libraryapp.views.viewholders.library.ILibraryBaseViewHolder
import com.lynnpadc.libraryapp.views.viewholders.library.LibraryLargeListViewHolder
import com.lynnpadc.libraryapp.views.viewholders.library.LibraryMediumListViewHolder
import com.lynnpadc.libraryapp.views.viewholders.library.LibrarySmallListViewHolder as LibrarySmallListViewHolder

class LibraryBookListAdapter(
    private val viewList: Int,
    private val delegate: LibraryBookViewHolderDelegate
): RecyclerView.Adapter<ILibraryBaseViewHolder>() {

    private var mBookList: List<BookVO> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ILibraryBaseViewHolder {
        return when(viewList){
            1 -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_library_book_small_list, parent, false)
                LibrarySmallListViewHolder(view.rootView, delegate)
            }
            2 -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_book_list, parent, false)
                LibraryLargeListViewHolder(view.rootView, delegate)
            }
            3 -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_book, parent, false)
                LibraryMediumListViewHolder(view.rootView, delegate)
            }
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun getItemCount(): Int {
        return mBookList.count()
    }

    override fun onBindViewHolder(holder: ILibraryBaseViewHolder, position: Int) {

//        when(viewList){
//            1 -> (holder as LibrarySmallListViewHolder).bindData(mBookList[position])
//            2 -> (holder as LibraryMediumListViewHolder).bindData(mBookList[position])
//            3 -> (holder as LibraryLargeListViewHolder).bindData(mBookList[position])
//            else -> throw IllegalArgumentException("Invalid view type")
//        }


        when(viewList){
            1 -> {
                when(holder){
                    is LibrarySmallListViewHolder -> {
                        val small = holder as LibrarySmallListViewHolder
                        small.bindData(mBookList[position])
                    }
                }
            }
            2 -> {
                when(holder){
                    is LibraryLargeListViewHolder -> {
                        val large = holder as LibraryLargeListViewHolder
                        large.bindData(mBookList[position])
                    }
                }
            }
            3 -> {
                when(holder){
                    is LibraryMediumListViewHolder -> {
                        val medium = holder as LibraryMediumListViewHolder
                        medium.bindData(mBookList[position])
                    }
                }
            }
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(bookList: List<BookVO>?) {
        mBookList = bookList ?: listOf()
        notifyDataSetChanged()
    }
}