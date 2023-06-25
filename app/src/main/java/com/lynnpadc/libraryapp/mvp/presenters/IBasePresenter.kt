package com.lynnpadc.libraryapp.mvp.presenters

import androidx.lifecycle.LifecycleOwner

interface IBasePresenter {
    fun onUiReady(owner: LifecycleOwner)
}