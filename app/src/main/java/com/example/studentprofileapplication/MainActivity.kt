package com.example.studentprofileapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /**EditText Input
        var fullname :EditText = findViewById(R.id.fullname)
        val registration : EditText = findViewById(R.id.reg_no)
        val course :EditText = findViewById(R.id.course)
    **/


        // Upload Profile photo
       /** val profilephoto = findViewById(R.id.profile) as ImageView
        profilephoto.setOnClickListener {
            Toast.makeText(this@MainActivity, "Click below button to upload here", Toast.LENGTH_SHORT).show()
        }**/
       imageView = findViewById(R.id.profile)
       button = findViewById(R.id.btnupload)

        button.setOnClickListener {
        }

        }
        //Save profile button
        val btnsaveprofile = findViewById<Button>(R.id.saveprofile)
        .setOnClickListener {
            Toast.makeText(this@MainActivity, "You profile has been saved.", Toast.LENGTH_SHORT).show()

        }
    }


