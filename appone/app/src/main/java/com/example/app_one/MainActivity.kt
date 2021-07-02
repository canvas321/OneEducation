package com.example.app_one

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btn_one)
        //assign an action to a button
        button.setOnClickListener{
            val toast = Toast.makeText(this, "Welcome to our store ", Toast.LENGTH_SHORT)
            toast.show()

            val intent  = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

    }
}