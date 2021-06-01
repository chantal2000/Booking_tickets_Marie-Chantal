package com.example.transportapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class destiny : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destiny2)

        var Dest=findViewById<EditText>(R.id.ptDest)
        var btnDate=findViewById<Button>(R.id.btnDate)
        var btnback=findViewById<Button>(R.id.btnGoBa)

        btnDate.setOnClickListener {
            var intent= Intent(baseContext,thetime::class.java)
            startActivity(intent)
        }
        btnback.setOnClickListener {
            var intent= Intent(baseContext,location::class.java)
            startActivity(intent)
        }
    }
}