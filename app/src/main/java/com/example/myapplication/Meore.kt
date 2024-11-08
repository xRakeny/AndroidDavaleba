package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Meore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_meore)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val showMeNumber = findViewById<TextView>(R.id.showNumber)
        val increasing = findViewById<Button>(R.id.increaseNum)
        val decreasing = findViewById<Button>(R.id.decreaseNum)
        val previousActivity = findViewById<Button>(R.id.previousAct)
        var counter = 0

        decreasing.setOnClickListener {
            counter--
            showMeNumber.text = counter.toString()

        }
        increasing.setOnClickListener {
            counter++
            showMeNumber.text = counter.toString()

        }
        previousActivity.setOnClickListener{
            finish()
        }
    }




}