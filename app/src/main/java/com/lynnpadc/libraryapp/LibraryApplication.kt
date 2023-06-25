package com.lynnpadc.libraryapp

import android.app.Application
import com.lynnpadc.libraryapp.data.models.LibraryModelImpl

class LibraryApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        LibraryModelImpl.initDatabase(applicationContext)
    }
}