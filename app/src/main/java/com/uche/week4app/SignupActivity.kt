package com.uche.week4app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignupActivity : AppCompatActivity() {
    lateinit var signup_button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        signup_button = findViewById(R.id.signup_button)
        signup_button.setOnClickListener {
            var intent: Intent = Intent(this, HomepageActivity::class.java)
            startActivity(intent)

        }
    }
}