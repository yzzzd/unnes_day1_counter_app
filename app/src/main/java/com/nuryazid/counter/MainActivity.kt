package com.nuryazid.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.nuryazid.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var counter = 0
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        binding.btnPlus.setOnClickListener {
            increaseCount()
        }

        binding.btnMinus.setOnClickListener {
            decreaseCount()
        }
    }

    private fun increaseCount() {
        counter += 1
        binding.tvCount.text = "$counter"
    }

    private fun decreaseCount() {
        counter -= 1
        binding.tvCount.text = "$counter"
    }
}