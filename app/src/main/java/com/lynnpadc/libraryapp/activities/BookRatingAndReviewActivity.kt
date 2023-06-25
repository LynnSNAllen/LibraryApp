package com.lynnpadc.libraryapp.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.lynnpadc.libraryapp.adapters.BookReviewAdapter
import com.lynnpadc.libraryapp.databinding.ActivityBookRatingAndReviewBinding

class BookRatingAndReviewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBookRatingAndReviewBinding

    private lateinit var mBookReviewAdapter: BookReviewAdapter

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, BookRatingAndReviewActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookRatingAndReviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setRecyclerView()
        setUpListeners()
    }

    private fun setUpListeners() {
        binding.btnBackRatingAndReview.setOnClickListener {
            onBackPressed()
        }
    }

    private fun setRecyclerView() {
        mBookReviewAdapter = BookReviewAdapter()
        binding.rvReview.adapter = mBookReviewAdapter
        binding.rvReview.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}