package com.example.practicadrawertab.adapters.Fragment3

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.practicadrawertab.R

class Tab3ViewModel:ViewModel() {
    val data: MutableLiveData<List<ItemsF3>> = MutableLiveData<List<ItemsF3>>().apply {
        value = listOf(
            ItemsF3(R.drawable.image1s),
            ItemsF3(R.drawable.image2s),
            ItemsF3(R.drawable.image3s),
            ItemsF3(R.drawable.image4s),
            ItemsF3(R.drawable.image5s),
            ItemsF3(R.drawable.image6s),
            ItemsF3(R.drawable.image7s),
            ItemsF3(R.drawable.image8s),
        )
    }
}