package com.uche.week4app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomepageActivity : AppCompatActivity() {
    lateinit var call_service: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        call_service = findViewById(R.id.call_service)
        call_service.setOnClickListener {
            var intent: Intent = Intent(Intent.ACTION_DIAL)
            startActivity(intent)
        }
    }
}