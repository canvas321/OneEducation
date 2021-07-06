package com.io.baraka.foodlyx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Toast.makeText(this, "Welcome to our Resturant",
        Toast.LENGTH_LONG
            ).show()

        val loginButton: Button =findViewById(R.id.button_login)
        val signUpButton:Button = findViewById(R.id.button_signup)

        loginButton.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        signUpButton.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}