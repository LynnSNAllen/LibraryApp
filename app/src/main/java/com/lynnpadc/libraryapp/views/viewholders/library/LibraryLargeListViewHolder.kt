package com.lynnpadc.libraryapp.views.viewholders.library

import android.view.View
import com.bumptech.glide.Glide
import com.lynnpadc.libraryapp.data.vos.overview.BookVO
import com.lynnpadc.libraryapp.databinding.ViewHolderBookListBinding
import com.lynnpadc.libraryapp.delegates.library.LibraryBookViewHolderDelegate

class LibraryLargeListViewHolder(itemView: View, private val delegate: LibraryBookViewHolderDelegate)
    : ILibraryBaseViewHolder(itemView) {

    private var binding: ViewHolderBookListBinding
    private var mBook: BookVO? = null

    init {
        binding = ViewHolderBookListBinding.bind(itemView)
        setUpListeners()
    }

    private fun setUpListeners() {
        itemView.setOnClickListener {
            delegate.onTapLibraryBook(mBook?.title ?: "", mBook?.listId ?: 0)
        }

        binding.btnOption.setOnClickListener {
            mBook?.let { book ->
                delegate.onTapLibraryBookOption(book)
            }
        }
    }

    override fun bindData(book: BookVO?) {
        mBook = book

        Glide.with(itemView.context)
            .load(book?.bookImage)
            .into(binding.ivBook)

        binding.tvBookTitle.text = book?.title ?: ""
        binding.tvAuthor.text = book?.author ?: ""
    }
}