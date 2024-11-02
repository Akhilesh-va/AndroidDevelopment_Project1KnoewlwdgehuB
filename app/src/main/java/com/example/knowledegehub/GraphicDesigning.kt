package com.example.knowledegehub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GraphicDesigning : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_graphic_designing)
        val figmaDocs=findViewById<TextView>(R.id.figmaDocs)
        val canvaDocs=findViewById<TextView>(R.id.canvaDocs)
        val aidocs=findViewById<TextView>(R.id.aidocs)
        val psdocs=findViewById<TextView>(R.id.psdocs)
        val btnTeacher=findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnTeacher)




        figmaDocs.setOnClickListener(){
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://help.figma.com/hc/en-us/categories/360002042553"))
            startActivity(intent)

        }
        canvaDocs.setOnClickListener(){
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.canva.com/docs/"))
            startActivity(intent)

        }
        aidocs.setOnClickListener(){
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://helpx.adobe.com/in/illustrator/user-guide.html"))
            startActivity(intent)

        }
        psdocs.setOnClickListener(){
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.adobe.com/africa/learn/photoshop"))
            startActivity(intent)

        }
        btnTeacher.setOnClickListener{
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.linkedin.com/in/anshu-raj2006/"))
            startActivity(intent)

        }
    }
}