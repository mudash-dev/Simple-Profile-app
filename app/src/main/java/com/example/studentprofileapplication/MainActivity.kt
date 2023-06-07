package com.example.studentprofileapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnsaveprofile: Button
    private lateinit var uploadbutton: Button
    private lateinit var profilephoto: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //Upload Profile Photo
        profilephoto = findViewById(R.id.profile)
        uploadbutton = findViewById(R.id.btnupload)
        uploadbutton.setOnClickListener {

        }

        var fullname: EditText = findViewById(R.id.fullname)
        val registration: EditText = findViewById(R.id.reg_no)
        val course: EditText = findViewById(R.id.course)

        val btnsaveprofile = findViewById<Button>(R.id.saveprofile)
            .setOnClickListener {
                Toast.makeText(this@MainActivity, "You profile has been saved.", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, SecondActivity::class.java)
                    startActivity(intent) }

    }




}



