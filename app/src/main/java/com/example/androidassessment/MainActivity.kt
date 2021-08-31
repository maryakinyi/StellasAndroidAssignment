package com.example.androidassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Multiplication = findViewById<Button>(R.id.btnMultiply)
         var Dividivision=findViewById<Button>(R.id.btndivision)
         var addition=findViewById<Button>(R.id.btnAdd)
        var subtraction=findViewById<Button>(R.id.btnSubtract)


    }

}















