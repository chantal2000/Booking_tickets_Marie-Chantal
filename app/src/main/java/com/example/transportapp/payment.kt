package com.example.transportapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        var tvPay=findViewById<TextView>(R.id.tvPay)
        var btnM=findViewById<Button>(R.id.btnM)
        var btnMob=findViewById<Button>(R.id.btnMob)
        var btnBk=findViewById<Button>(R.id.btnBk)
        var btnOther=findViewById<Button>(R.id.btnOther)

        btnM.setOnClickListener {
            var intent= Intent(baseContext,call::class.java)
            startActivity(intent)
        }

        btnMob.setOnClickListener {
            var intent= Intent(baseContext,call::class.java)
            startActivity(intent)
        }

        btnBk.setOnClickListener {
            var intent= Intent(baseContext,call::class.java)
            startActivity(intent)
        }

        btnOther.setOnClickListener {
            var intent= Intent(baseContext,call::class.java)
            startActivity(intent)
        }

    }
}