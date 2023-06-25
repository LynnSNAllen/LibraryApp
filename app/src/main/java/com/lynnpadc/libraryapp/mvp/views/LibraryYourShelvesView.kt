package com.lynnpadc.libraryapp.mvp.views

import com.lynnpadc.libraryapp.data.vos.ShelfVO

interface LibraryYourShelvesView: IBaseView {
    fun showShelfList(shelfList: List<ShelfVO>)
    fun navigateToShelfDetailScreen(shelfId: Int)
}