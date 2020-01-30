package com.example.fizzbuzz.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.fizzbuzz.viewModel.FizzBuzzLiveData
import androidx.databinding.DataBindingUtil
import com.example.fizzbuzz.R
import com.example.fizzbuzz.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: FizzBuzzLiveData
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(FizzBuzzLiveData::class.java)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this


        viewModel.textInputValue.observe( this, Observer {
            Log.d( "RR:", "${viewModel.textInputValue}" )

            if( it != "" ) {
                viewModel.updated(it.toInt())
            }
            else {
                viewModel.updated(0)
            }
        })

        viewModel.sliderInputValue.observe( this, Observer {
            Log.d( "RR:", "Slider: ${viewModel.sliderInputValue}" )
            viewModel.updated(it)
        })

        viewModel.outputTextField.observe( this, Observer { it
            output.text = it
        })

    }
}
