package com.io.baraka.foodlyx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        register()
        redirect()
    }

    private fun register(){
        val signup:Button = findViewById(R.id.signup);

        signup.setOnClickListener{
            startActivity(Intent(this, Dashboard::class.java))
            finish()
        }
    }

    private fun redirect(){
        val redirectBTN:TextView = findViewById(R.id.redirect_to_login)
        redirectBTN.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}