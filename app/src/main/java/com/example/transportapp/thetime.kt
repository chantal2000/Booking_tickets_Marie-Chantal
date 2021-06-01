package com.example.transportapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class thetime : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thetime)

        var Time=findViewById<EditText>(R.id.ptTime)
        var btnback=findViewById<Button>(R.id.btnBack)
        var btnCon=findViewById<Button>(R.id.btnContinu)

        btnback.setOnClickListener {
            var intent= Intent(baseContext,destiny::class.java)
            startActivity(intent)
        }
        btnCon.setOnClickListener {
            var intent= Intent(baseContext,payment::class.java)
            startActivity(intent)
        }
    }
}