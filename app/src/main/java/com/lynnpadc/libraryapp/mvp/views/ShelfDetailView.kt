package com.lynnpadc.libraryapp.mvp.views

import com.lynnpadc.libraryapp.data.vos.ShelfVO

interface ShelfDetailView: IBaseView {

    fun showBottomSheetDialogForShelfTitle()
    fun showBottomSheetDialogForView()
    fun showBottomSheetDialogForSorting()

    fun showShelfDetail(shelfVO: ShelfVO?)

    fun navigateToBack()
    fun onTapChip(listName: String)
    fun onTapClearChip()


}