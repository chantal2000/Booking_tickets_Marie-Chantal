package com.example.transportapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class form : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form2)

        var ptn=findViewById<EditText>(R.id.ptn)
        var ptn2=findViewById<EditText>(R.id.ptn2)
        var btnC=findViewById<Button>(R.id.btnC)
        var btnCon=findViewById<Button>(R.id.btnCon)

        btnC.setOnClickListener {
            var intent= Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
        btnCon.setOnClickListener {
            var intent= Intent(baseContext,locationf::class.java)
            startActivity(intent)
        }

    }
}