package com.lynnpadc.libraryapp.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lynnpadc.libraryapp.R
import com.lynnpadc.libraryapp.data.vos.ShelfVO
import com.lynnpadc.libraryapp.delegates.library.ShelvesListViewHolderDelegate
import com.lynnpadc.libraryapp.views.viewholders.library.ShelvesListViewHolder

class ShelvesListAdapter(
    private val delegate: ShelvesListViewHolderDelegate
): RecyclerView.Adapter<ShelvesListViewHolder>() {

    private var mShelfList: List<ShelfVO> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShelvesListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_shelves_list, parent, false)
        return ShelvesListViewHolder(view.rootView, delegate)
    }

    override fun getItemCount(): Int {
        return mShelfList.count()
    }

    override fun onBindViewHolder(holder: ShelvesListViewHolder, position: Int) {
        holder.bindData(mShelfList[position])
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setNewData(shelfList: List<ShelfVO>) {
        mShelfList = shelfList
        notifyDataSetChanged()
    }
}