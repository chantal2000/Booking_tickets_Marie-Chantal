package com.example.transportapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class loginform : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginform)
        var fname=findViewById<EditText>(R.id.ptN)
        var pass=findViewById<TextView>(R.id.tv3)
        var pass2=findViewById<EditText>(R.id.pass1)

        var btn1=findViewById<Button>(R.id.btnexit)
        var btn2=findViewById<Button>(R.id.btnContinue)
        btn1.setOnClickListener {

            var intent= Intent(baseContext,MainActivity::class.java)
            startActivity(intent)

        }
        btn2.setOnClickListener {
            var intent= Intent(baseContext,location::class.java)
            startActivity(intent)

        }


    }
}