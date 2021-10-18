package com.example.twobuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var kotlinbutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        kotlinbutton = findViewById(R.id.button2)

        kotlinbutton.setOnClickListener {
            Toast.makeText(applicationContext, "Kotlin", Toast.LENGTH_LONG).show()
        }

    }

    fun key(view: android.view.View) {
        Toast.makeText(applicationContext,"xml", Toast.LENGTH_LONG).show()
    }
}