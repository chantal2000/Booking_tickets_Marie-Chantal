package com.example.transportapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        var fname=findViewById<EditText>(R.id.ptName)
        var btnBack=findViewById<Button>(R.id.btnBack)
        var btnCon=findViewById<Button>(R.id.btnContinue)

        btnBack.setOnClickListener {
            var intent= Intent(baseContext,MainActivity::class.java)
            startActivity(intent)

        }

        btnCon.setOnClickListener {
            var intent= Intent(baseContext,signup::class.java)
            startActivity(intent)

        }

    }
}