package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class activity2 : AppCompatActivity() {
    lateinit var display2 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        display2 = findViewById(R.id.display_result)

        val b = intent.getStringExtra("b")

        display2.text = b

    }

}