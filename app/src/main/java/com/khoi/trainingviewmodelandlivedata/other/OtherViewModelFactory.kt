package com.khoi.trainingviewmodelandlivedata.other

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class OtherViewModelFactory (private val score:Int,private val stage:String):ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(OtherViewModel::class.java)){
            return OtherViewModel(score,stage) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}