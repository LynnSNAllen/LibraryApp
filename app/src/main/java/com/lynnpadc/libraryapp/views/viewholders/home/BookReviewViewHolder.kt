package com.lynnpadc.libraryapp.views.viewholders.home

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.lynnpadc.libraryapp.databinding.ViewHolderBookReviewBinding

class BookReviewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private var binding: ViewHolderBookReviewBinding

    init {
        binding = ViewHolderBookReviewBinding.bind(itemView)
    }
}