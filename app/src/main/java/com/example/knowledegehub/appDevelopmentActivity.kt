package com.example.knowledegehub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class appDevelopmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app_development)
        val androidDocs = findViewById<TextView>(R.id.androidDocs)
        val xmlDocs = findViewById<TextView>(R.id.xmlDocs)
        val kotlindocs = findViewById<TextView>(R.id.kotlindocs)
        val youtubedocs = findViewById<TextView>(R.id.youtubedocs)
        val btnTeacher = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnTeacher)
        androidDocs.setOnClickListener(){
            intent=Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://developer.android.com/develop"))
            startActivity(intent)

        }
        xmlDocs.setOnClickListener(){
            intent=Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://developer.mozilla.org/en-US/docs/Web/XML/XML_introduction"))
            startActivity(intent)

        }
        kotlindocs.setOnClickListener(){
            intent=Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://kotlinlang.org/docs/home.html"))
            startActivity(intent)

        }
        youtubedocs.setOnClickListener(){
            intent=Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.linkedin.com/in/akhilesh-singh-maurya-500b91257/"))
            startActivity(intent)

        }
        btnTeacher.setOnClickListener{
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:akhileshbltr2002@gmail.com")
            }
            startActivity(intent)

        }


    }
}