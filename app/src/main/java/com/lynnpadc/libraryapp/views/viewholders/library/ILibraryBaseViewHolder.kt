package com.lynnpadc.libraryapp.views.viewholders.library

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.lynnpadc.libraryapp.data.vos.overview.BookVO

abstract class ILibraryBaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun bindData(book: BookVO?)
}