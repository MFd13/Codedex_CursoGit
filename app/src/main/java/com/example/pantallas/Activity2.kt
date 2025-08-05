package com.example.pantallas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val backBtn = findViewById<Button>(R.id.backBtn)
        val goPrevScreen = Intent(this, MainActivity::class.java)
        backBtn.setOnClickListener{ startActivity(goPrevScreen) }
    }
}