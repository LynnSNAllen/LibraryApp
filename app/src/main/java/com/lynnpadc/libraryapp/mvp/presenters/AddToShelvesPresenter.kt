package com.lynnpadc.libraryapp.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import com.lynnpadc.libraryapp.data.vos.ShelfVO
import com.lynnpadc.libraryapp.delegates.library.AddToShelvesViewHolderDelegate
import com.lynnpadc.libraryapp.mvp.views.AddToShelvesView

interface AddToShelvesPresenter: IBasePresenter, AddToShelvesViewHolderDelegate {

    fun initView(view: AddToShelvesView)
    fun onUiReadyForAddToShelves(owner: LifecycleOwner, title:String)

    fun onTapClose()

    fun updateShelf(shelf: ShelfVO)
}