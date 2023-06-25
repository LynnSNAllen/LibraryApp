package com.lynnpadc.libraryapp.views.viewholders.home

import android.view.View
import com.bumptech.glide.Glide
import com.lynnpadc.libraryapp.R
import com.lynnpadc.libraryapp.data.vos.overview.BookVO
import com.lynnpadc.libraryapp.databinding.ViewHolderBookBannerBinding
import com.lynnpadc.libraryapp.delegates.home.BannerViewHolderDelegate

class BookBannerViewHolder(itemView: View, private val delegate: BannerViewHolderDelegate) : IBookBannerViewHolder(itemView) {

    private var binding: ViewHolderBookBannerBinding

    private var mBook:BookVO? = null

    init {
        binding = ViewHolderBookBannerBinding.bind(itemView)
        setUpListeners()
    }

    private fun setUpListeners() {
        itemView.setOnClickListener {
            delegate.onTapBannerBook(mBook?.title ?: "", mBook?.listId ?: 0)
        }

        binding.ivOption.setOnClickListener {
            mBook?.let { delegate.onTapBannerBookOption(it, 0, "") }
        }
    }

    override fun bindData(book: BookVO?) {
        mBook = book

        Glide.with(itemView.context)
            .load(book?.bookImage)
            .placeholder(R.drawable.empty_image)
            .into(binding.ivBannerImage)
    }
}