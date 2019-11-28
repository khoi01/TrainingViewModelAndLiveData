package com.khoi.trainingviewmodelandlivedata.other

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OtherViewModel(score:Int,stage:String) :ViewModel(){

    private val _score = MutableLiveData<Int>()

    private val _stage = MutableLiveData<String>()

    init {
        _score.value = score
        _stage.value = stage
    }
}