package com.khoi.trainingviewmodelandlivedata

import android.icu.lang.UCharacter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel(){
    //apply live data update
    var word = MutableLiveData<String>()
    var score = MutableLiveData<Int>()
    var stage = MutableLiveData<String>()

    init {

        //initiliaze 1st time only
        word.value = "none"
        stage.value = "first stage"
        score.value = 1
    }



    fun newWord(){
        word.value = "kambing"
        stage.value ="second stage"
        score.value = 2
    }

}