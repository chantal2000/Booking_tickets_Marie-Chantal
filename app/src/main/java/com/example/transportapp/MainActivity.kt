package com.example.transportapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var pt = findViewById<EditText>(R.id.ptWelcome)
        var btn1 = findViewById<Button>(R.id.btn1)

        btn1.setOnClickListener{
            var intent = Intent(baseContext, welcome::class.java)
            startActivity(intent)
        }
    }
}