package com.lynnpadc.libraryapp.views.viewholders.library

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.lynnpadc.libraryapp.databinding.ViewHolderLibraryChipBinding
import com.lynnpadc.libraryapp.delegates.library.LibraryChipViewHolderDelegate

class LibraryChipViewHolder(itemView: View, private val delegate: LibraryChipViewHolderDelegate)
    : RecyclerView.ViewHolder(itemView) {

    private var binding: ViewHolderLibraryChipBinding

    private var mListName:String? = null

    init {
        binding = ViewHolderLibraryChipBinding.bind(itemView)

        binding.cbListName.setOnCheckedChangeListener { button, isChecked ->
            if (isChecked){
                delegate.onTapChip(mListName ?: "")
            }
        }
    }

    fun bindData(chipName: String, clearChip: Boolean) {
        mListName = chipName

        binding.cbListName.text = chipName

        if(clearChip) {
            binding.cbListName.isChecked = false
        }
    }
}