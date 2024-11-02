package com.example.knowledegehub

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)
        val letsGoButton = findViewById<Button>(R.id.button)
        letsGoButton.setOnClickListener{
            intent = Intent(applicationContext,SecondActivity::class.java)
            startActivity(intent)
        }

    }
}