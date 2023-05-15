package com.example.mathexec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Eadd = findViewById<ImageView>(R.id.Eadd)
        val Eminus = findViewById<ImageView>(R.id.Eminus)
        val Emulti = findViewById<ImageView>(R.id.Emultipulation)
        val Edivision = findViewById<ImageView>(R.id.Edivision)

        Eadd.setOnClickListener {
            val intent = Intent(this,ExecPage ::class.java)
            intent.putExtra("cal","+")
            startActivity(intent)
        }

        Eminus.setOnClickListener {
            val intent = Intent(this,ExecPage ::class.java)
            intent.putExtra("cal","-")
            startActivity(intent)
        }

        Emulti.setOnClickListener {
            val intent = Intent(this,ExecPage ::class.java)
            intent.putExtra("cal","x")
            startActivity(intent)
        }

        Edivision.setOnClickListener {
            val intent = Intent(this,ExecPage ::class.java)
            intent.putExtra("cal","/")
            startActivity(intent)
        }
    }
}