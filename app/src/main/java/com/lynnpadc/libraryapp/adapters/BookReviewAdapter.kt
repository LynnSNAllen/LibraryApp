package com.lynnpadc.libraryapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lynnpadc.libraryapp.R
import com.lynnpadc.libraryapp.views.viewholders.home.BookReviewViewHolder

class BookReviewAdapter: RecyclerView.Adapter<BookReviewViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookReviewViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_book_review, parent, false)
        return BookReviewViewHolder(view.rootView)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: BookReviewViewHolder, position: Int) {
    }
}