package com.khoi.trainingviewmodelandlivedata.other

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.khoi.trainingviewmodelandlivedata.R
import com.khoi.trainingviewmodelandlivedata.databinding.ActivityMainBinding

class OtherActivity : AppCompatActivity() {

    private lateinit var viewModel: OtherViewModel
    private lateinit var viewModelFactory: OtherViewModelFactory



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_other)

        var score: Int = intent.getIntExtra("score",0)
        var stage: String = intent.getStringExtra("stage")


        viewModelFactory = OtherViewModelFactory(score, stage)
        viewModel = ViewModelProviders.of(this,viewModelFactory)
            .get(OtherViewModel::class.java)




    }
}
