package com.nuryazid.counter

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val counter = MutableLiveData(0)

    fun increaseCount() {
        counter.value = counter.value?.plus(1)
    }

    fun decreaseCount() {
        counter.value = counter.value?.minus(1)
    }
}