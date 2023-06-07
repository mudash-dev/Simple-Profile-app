package com.example.studentprofileapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    private lateinit var editbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        editbutton =findViewById(R.id.btnedit)

        editbutton.setOnClickListener {
            val intent = Intent(
                this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}