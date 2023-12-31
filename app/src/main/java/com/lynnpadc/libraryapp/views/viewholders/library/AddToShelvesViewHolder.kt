package com.lynnpadc.libraryapp.views.viewholders.library

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.lynnpadc.libraryapp.data.vos.ShelfVO
import com.lynnpadc.libraryapp.databinding.ViewHolderAddToShelvesBinding
import com.lynnpadc.libraryapp.delegates.library.AddToShelvesViewHolderDelegate

class AddToShelvesViewHolder(itemView: View, private val delegate: AddToShelvesViewHolderDelegate)
    : RecyclerView.ViewHolder(itemView) {

    private var binding: ViewHolderAddToShelvesBinding
    private var mShelf: ShelfVO? = null

    init {
        binding = ViewHolderAddToShelvesBinding.bind(itemView)
    }

    fun bindData(shelf: ShelfVO) {
        mShelf = shelf

        binding.tvBookTitle.text = shelf.shelfName ?: ""

        var bookCount = "${shelf.bookCount} books"
        if(shelf.bookCount == 0) {
            bookCount = "0 book"
        }
        binding.tvBookCount.text = bookCount

        binding.cbAddToShelves.isChecked = shelf.isChecked ?: false

        binding.cbAddToShelves.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked) {
                delegate.onTapCheckBox(mShelf?.Id ?: 0,true)
            } else {
                delegate.onTapCheckBox(mShelf?.Id ?: 0,false)
            }
        }
    }
}