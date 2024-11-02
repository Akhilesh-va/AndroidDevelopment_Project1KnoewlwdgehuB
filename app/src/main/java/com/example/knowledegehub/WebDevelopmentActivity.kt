package com.example.knowledegehub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WebDevelopmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_web_development)
       val html=findViewById<TextView>(R.id.htmlDocs)
        val css=findViewById<TextView>(R.id.cssDocs)
        val js=findViewById<TextView>(R.id.jsdocs)
        val react=findViewById<TextView>(R.id.reactdocs)
        val btnTeacher=findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnTeacher)
        html.setOnClickListener(){
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://developer.mozilla.org/en-US/docs/Web/HTML"))
            startActivity(intent)

        }
        css.setOnClickListener(){
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://developer.mozilla.org/en-US/docs/Web/CSS"))
            startActivity(intent)

        }
        js.setOnClickListener(){
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://developer.mozilla.org/en-US/docs/Web/JavaScript"))
            startActivity(intent)

        }
        react.setOnClickListener(){
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://legacy.reactjs.org/docs/getting-started.html"))
            startActivity(intent)

        }
        btnTeacher.setOnClickListener{
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.linkedin.com/in/mohd-hadi-5a4638226?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app"))
            startActivity(intent)

        }

    }
}