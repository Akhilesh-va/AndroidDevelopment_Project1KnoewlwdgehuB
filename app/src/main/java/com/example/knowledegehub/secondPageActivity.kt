package com.example.knowledegehub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class secondPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_page)
       val appDev = findViewById<androidx.cardview.widget.CardView>(R.id.appDev)
        val appdevelopment = findViewById<TextView>(R.id.appDevelopment)
        val webDev= findViewById<androidx.cardview.widget.CardView>(R.id.webDev)
        val webDevelopment = findViewById<TextView>(R.id.webDevelopment)
        val ml = findViewById<androidx.cardview.widget.CardView>(R.id.ml)
        val machineLearning = findViewById<TextView>(R.id.machineLearning)
       val graphic = findViewById<androidx.cardview.widget.CardView>(R.id.graphic)
        val graphicDesigning = findViewById<TextView>(R.id.graphicDesigning)
        val dataStructure = findViewById<androidx.cardview.widget.CardView>(R.id.dataStructure)
        val dsa = findViewById<TextView>(R.id.dsa)



        val contactUs = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.button3)
        contactUs.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:6391082028"))
            startActivity(intent)
        }
        appDev.setOnClickListener{
            intent = Intent(applicationContext,appDevelopmentActivity::class.java)
            startActivity(intent)
        }
        appdevelopment.setOnClickListener{
            intent = Intent(applicationContext,appDevelopmentActivity::class.java)
            startActivity(intent)
        }
        webDev.setOnClickListener{
            intent = Intent(applicationContext,WebDevelopmentActivity::class.java)
            startActivity(intent)
        }
        webDevelopment.setOnClickListener{
            intent = Intent(applicationContext,WebDevelopmentActivity::class.java)
            startActivity(intent)
        }
        ml.setOnClickListener{
            intent = Intent(applicationContext,MachineLearning::class.java)
            startActivity(intent)
        }
        machineLearning.setOnClickListener{
            intent = Intent(applicationContext,MachineLearning::class.java)
            startActivity(intent)
        }
        graphic.setOnClickListener{
            intent = Intent(applicationContext,GraphicDesigning::class.java)
            startActivity(intent)
        }
        graphicDesigning.setOnClickListener{
            intent = Intent(applicationContext,GraphicDesigning::class.java)
            startActivity(intent)
        }
        dataStructure.setOnClickListener{
            intent = Intent(applicationContext,Dsa::class.java)
            startActivity(intent)
        }
        dsa.setOnClickListener{
            intent = Intent(applicationContext,Dsa::class.java)
            startActivity(intent)
        }








    }
}