package com.nuryazid.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.nuryazid.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //region unused
    /*private var counter = 0*/
    //endregion
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        binding.lifecycleOwner = this

        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.viewModel = viewModel

        //region unused
        /*binding.btnPlus.setOnClickListener {
            increaseCount()
        }

        binding.btnMinus.setOnClickListener {
            decreaseCount()
        }*/
        //endregion
    }

    //region unused
    /*private fun increaseCount() {
        counter += 1
        binding.tvCount.text = "$counter"
    }

    private fun decreaseCount() {
        counter -= 1
        binding.tvCount.text = "$counter"
    }*/
    //endregion
}