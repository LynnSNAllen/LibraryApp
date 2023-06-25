package com.lynnpadc.libraryapp.views.viewholders.home

import android.view.View
import com.lynnpadc.libraryapp.data.vos.overview.BookVO
import com.lynnpadc.libraryapp.databinding.ViewHolderAudiobookBannerBinding
import com.lynnpadc.libraryapp.delegates.home.BannerViewHolderDelegate

class AudioBookBannerViewHolder(itemView: View, private val delegate: BannerViewHolderDelegate) : IBookBannerViewHolder(itemView) {

    private var binding: ViewHolderAudiobookBannerBinding

    init {
        binding = ViewHolderAudiobookBannerBinding.bind(itemView)
    }

    override fun bindData(book: BookVO?) {
    }
}