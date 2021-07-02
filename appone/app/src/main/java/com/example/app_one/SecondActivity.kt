package com.example.app_one

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val button: Button = findViewById(R.id.btn_two)
        //assign an action to a button
        button.setOnClickListener{
            val toast = Toast.makeText(this, "Thank you for visiting us ", Toast.LENGTH_LONG)
            toast.show()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }


}