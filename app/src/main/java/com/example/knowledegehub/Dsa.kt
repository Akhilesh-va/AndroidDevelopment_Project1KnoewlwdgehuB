package com.example.knowledegehub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Dsa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dsa)
val javaDocs=findViewById<TextView>(R.id.javaDocs)
        val cDocs=findViewById<TextView>(R.id.cDocs)
        val leetcodeDocs=findViewById<TextView>(R.id.leetcodedocs)
        val hrdocs=findViewById<TextView>(R.id.hrdocs)
val btnTeacher=findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnTeacher)


        javaDocs.setOnClickListener(){
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.w3schools.com/java/java_ref_reference.asp"))
            startActivity(intent)

        }
        cDocs.setOnClickListener(){
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.w3schools.com/cpp/"))
            startActivity(intent)

        }
        leetcodeDocs.setOnClickListener(){
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://leetcode.com/"))
            startActivity(intent)

        }
        hrdocs.setOnClickListener(){
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.hackerrank.com/"))
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