package com.example.knowledegehub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MachineLearning : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_machine_learning)
        val pythonDocs = findViewById<TextView>(R.id.pythonDocs)
        val sqlDocs = findViewById<TextView>(R.id.sqlDocs)
        val btnTeacher = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnTeacher)
        pythonDocs.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.python.org/"))
            startActivity(intent)
        }
        sqlDocs.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.com/sql/default.asp"))
            startActivity(intent)
        }
        btnTeacher.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:akhileshbltr2002@gmail.com")
            }
            startActivity(intent)
        }



    }
}