package com.example.studentprofileapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private lateinit var editbutton: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val seename:TextView = findViewById(R.id.full)
        val seereg :TextView = findViewById(R.id.reg)
        val seecourse :TextView = findViewById(R.id.courses)

        val intent = intent
        val str = intent.getStringExtra("Name")
        val reg = intent.getStringExtra("Reg")
        val cos = intent.getStringExtra("course")

        seename.text = str
        seereg.text = reg
        seecourse.text = cos

        /**
        val bundle = intent.extras
        if(bundle != null){
            seename.text ="Name = ${bundle.getString("name")}"
            seereg.text = "Registration NUmber = ${bundle.getString("reg")}"
            seecourse.text = "Your Course = ${bundle.getString("course")}"
        }**/


        editbutton =findViewById(R.id.btnedit)
        editbutton.setOnClickListener {
            @Suppress("NAME_SHADOWING") val intent = Intent(
                this,MainActivity::class.java)
            startActivity(intent)
        }


    }
}