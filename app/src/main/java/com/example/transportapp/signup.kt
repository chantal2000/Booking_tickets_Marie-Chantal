package com.example.transportapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        var name = findViewById<EditText>(R.id.ptEnter)
        var btnSign=findViewById<Button>(R.id.btnsignup)
        var btnLog=findViewById<Button>(R.id.btnLog)

        btnSign.setOnClickListener {
            var intent= Intent(baseContext,form::class.java)
            startActivity(intent)
        }
        btnLog.setOnClickListener {
            var intent=Intent(baseContext,loginform::class.java)
            startActivity(intent)
        }
    }
}