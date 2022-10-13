package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var display : TextView
    lateinit var firstText : EditText
    lateinit var secondText : EditText
    lateinit var Addition : Button
    lateinit var Substraction : Button
    lateinit var Multiplication : Button
    lateinit var Division : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        display = findViewById(R.id.display_result)
        firstText = findViewById(R.id.firstText)
        secondText = findViewById(R.id.secondText)
        Addition = findViewById(R.id.Addition)
        Substraction = findViewById(R.id.Subtraction)
        Multiplication = findViewById(R.id.Multiplication)
        Division = findViewById(R.id.Division)




        Addition.setOnClickListener {
            val answer1 = firstText.text.toString().toInt()
            val answer2 = secondText.text.toString().toInt()
            add(answer1, answer2)


        }

        Substraction.setOnClickListener {
            val answer1 = firstText.text.toString().toInt()
            val answer2 = secondText.text.toString().toInt()
            sub(answer1, answer2)
        }
        Multiplication.setOnClickListener {
            val answer1 = firstText.text.toString().toInt()
            val answer2 = secondText.text.toString().toInt()
            mul(answer1, answer2)
        }

        Division.setOnClickListener {
            val answer1 = firstText.text.toString().toInt()
            val answer2 = secondText.text.toString().toInt()
            div(answer1, answer2)
        }

    }
    private fun add(answer1:Int, answer2: Int)
    {
        val final = answer1 + answer2
        display.text = final.toString()
        var b = display.text
        val intent = Intent(this, activity2::class.java)
        intent.putExtra("b", b)
        startActivity(intent)
    }
    private fun sub(answer1:Int, answer2: Int)
    {
        val final = answer1 - answer2
        display.text = final.toString()
        var b = display.text
        val intent = Intent(this, activity2::class.java)
        intent.putExtra("b", b)
        startActivity(intent)
    }
    private fun mul(answer1:Int, answer2: Int)
    {
        val final = answer1 * answer2
        display.text = final.toString()
        var b = display.text
        val intent = Intent(this, activity2::class.java)
        intent.putExtra("b", b)
        startActivity(intent)
    }
    private fun div(answer1:Int, answer2: Int)
    {
        val final = answer1 / answer2
        display.text = final.toString()
        var b = display.text
        val intent = Intent(this, activity2::class.java)
        intent.putExtra("b", b)
        startActivity(intent)
    }


}
