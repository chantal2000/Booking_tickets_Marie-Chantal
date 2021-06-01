package com.example.transportapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class locationf : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_locationf)

        var ptNow=findViewById<EditText>(R.id.ptNow)

        var btnExit=findViewById<Button>(R.id.btnExi)
        var btnCont=findViewById<Button>(R.id.btnConti)

        btnExit.setOnClickListener {
            var intent= Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
        btnCont.setOnClickListener {
            var intent= Intent(baseContext,destiny::class.java)
            startActivity(intent)
        }
    }
}