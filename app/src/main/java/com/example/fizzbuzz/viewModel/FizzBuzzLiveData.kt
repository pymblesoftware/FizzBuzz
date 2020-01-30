package com.example.fizzbuzz.viewModel

import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.databinding.PropertyChangeRegistry
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FizzBuzzLiveData : ViewModel(), Observable {

    private val callbacks: PropertyChangeRegistry by lazy { PropertyChangeRegistry() }

    @Bindable
    val textInputValue = MutableLiveData<String>()
    @Bindable
    val sliderInputValue = MutableLiveData<Int>()
    @Bindable
    val outputTextField = MutableLiveData<String>()

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        callbacks.remove(callback)
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        callbacks.add(callback)
    }


    fun updated( i : Int ) {
        if(i == 0) {
            outputTextField.postValue("")
            textInputValue.postValue("")
            sliderInputValue.postValue(0)
        }
        else {
            outputTextField.postValue(UseCase.calc(i))
            textInputValue.postValue("${i}")
            sliderInputValue.postValue(i)
        }
    }
}