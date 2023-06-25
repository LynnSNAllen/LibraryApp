package com.lynnpadc.libraryapp.views.viewpods

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.lynnpadc.libraryapp.adapters.BookAdapter
import com.lynnpadc.libraryapp.data.vos.overview.BookCategoryVO
import com.lynnpadc.libraryapp.databinding.ViewPodBookListBinding
import com.lynnpadc.libraryapp.delegates.home.BookViewHolderDelegate

class BookListViewPod @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : RelativeLayout(context, attrs) {

    private lateinit var binding: ViewPodBookListBinding
    private lateinit var mBookAdapter: BookAdapter
    private lateinit var mDelegate: BookViewHolderDelegate

    override fun onFinishInflate() {
        super.onFinishInflate()
        binding = ViewPodBookListBinding.bind(this)
    }

    fun setUpBookViewPod(delegate: BookViewHolderDelegate){
        this.mDelegate = delegate
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        mBookAdapter = BookAdapter(mDelegate)
        binding.rvBookList.adapter = mBookAdapter
        binding.rvBookList.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }

    fun setNewData(category: BookCategoryVO) {
        mBookAdapter.setData(category)
    }

}