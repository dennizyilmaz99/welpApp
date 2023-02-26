package com.denniz.labb_1_androidutveckling

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LogInActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        supportActionBar?.hide()

        val loginIntent = intent.getStringExtra("username")
        val displayUsername: TextView = findViewById(R.id.displayUsername)

        displayUsername.text = loginIntent
    }
}