package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val enterTheNumber = findViewById<EditText>(R.id.enterNum)
        val buttonShow = findViewById<Button>(R.id.buttonNum)
        val ShowNumber = findViewById<TextView>(R.id.showNum)
        val nextactivity = findViewById<Button>(R.id.gotonext)
        buttonShow.setOnClickListener {
            val num = enterTheNumber.text
            ShowNumber.text = "Your number is: $num"
        }
        nextactivity.setOnClickListener {
            val intent = Intent(this, Meore::class.java)
            startActivity(intent)
        }
    }



}