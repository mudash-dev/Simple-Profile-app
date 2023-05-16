package com.example.studentprofileapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val editText = findViewById<EditText>(R.id.fullname)
        //val editText = findViewById<EditText>(R.id.reg_no)
       // val editText = findViewById<EditText>(R.id.course)

        val Button = findViewById<Button>(R.id.saveprofile)

    }
}