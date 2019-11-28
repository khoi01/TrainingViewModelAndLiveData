package com.khoi.trainingviewmodelandlivedata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.khoi.trainingviewmodelandlivedata.databinding.ActivityMainBinding
import com.khoi.trainingviewmodelandlivedata.other.OtherActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel:MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //setup viewmodel provider
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        // Set the viewmodel for databinding - this allows the bound layout access to all of the
        // data in the VieWModel
        binding.mainViewModel = viewModel

        // Specify the current activity as the lifecycle owner of the binding. This is used so that
        // the binding can observe LiveData updates
        binding.setLifecycleOwner(this)


        viewModel.word.observe(this, Observer {
            binding.text.text = it
        })


        binding.button.setOnClickListener{
            viewModel.newWord()
        }

        binding.buttonLastActivity.setOnClickListener{
            val intent= Intent(this,OtherActivity::class.java);
            intent.putExtra("score",viewModel.score.value?:0)
            intent.putExtra("stage",viewModel.stage.value?:"no value")

            startActivity(intent)
        }
    }
}
