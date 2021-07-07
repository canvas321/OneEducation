package com.io.baraka.foodlyx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login()
        redirect()
        forgotPassword()
    }

    private fun login(){
        val login: Button = findViewById(R.id.login);

        login.setOnClickListener{
            startActivity(Intent(this, Dashboard::class.java))
            finish()
        }
    }

    private fun redirect(){
        val redirectBTN: TextView = findViewById(R.id.redirect_to_signup)
        redirectBTN.setOnClickListener{
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }

    private fun forgotPassword( ){
        val redirectBTN: TextView = findViewById(R.id.forgot_pwd)
        redirectBTN.setOnClickListener{
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }

    }

}