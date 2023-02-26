package com.example.practicadrawertab

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ActivityImagen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imagen)

        val bundle = intent.extras
        val imageView = findViewById<ImageView>(R.id.ActivityImage)
        val imagen = bundle?.getInt("Foto")
        imageView.setImageResource(imagen!!)

    }
}