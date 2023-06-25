package com.lynnpadc.libraryapp.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.lynnpadc.libraryapp.R
import com.lynnpadc.libraryapp.databinding.ActivityMainBinding
import com.lynnpadc.libraryapp.fragments.HomeFragment
import com.lynnpadc.libraryapp.fragments.LibraryFragment


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    companion object{
        fun newIntent(context: Context): Intent {
            return Intent(context, MainActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpBottomNavigation()
        setUpListeners()
    }

    private fun setUpListeners() {
        binding.etSearch.setOnClickListener {
            startActivity(BookSearchActivity.newIntent(this))
        }
    }

    private fun setUpBottomNavigation() {
        switchFragment(HomeFragment())
        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.homeFragment -> {
                    switchFragment(HomeFragment())
                    true
                }
                R.id.libraryFragment -> {
                    switchFragment(LibraryFragment())
                    true
                }
                else -> false
            }
        }
    }

    private fun switchFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer,fragment)
            .commit()
    }
}