package com.example.practicadrawertab.adapters.Fragment1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.practicadrawertab.MyData
import com.example.practicadrawertab.R

class Fragment1ViewModel:ViewModel() {
    val data: MutableLiveData<List<MyData>> = MutableLiveData<List<MyData>>().apply {
        value = listOf(
            MyData(R.drawable.image1,"Contacto 1"),
            MyData(R.drawable.image1,"Contacto 2"),
            MyData(R.drawable.image1,"Contacto 3"),
            MyData(R.drawable.image1,"Contacto 4"),
            MyData(R.drawable.image1,"Contacto 5"),
            MyData(R.drawable.image1,"Contacto 6"),
            MyData(R.drawable.image1,"Contacto 7"),
            MyData(R.drawable.image1,"Contacto 8"),
            MyData(R.drawable.image1,"Contacto 9"),
        )
    }
}