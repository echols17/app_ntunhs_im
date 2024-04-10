package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val txttest = findViewById<TextView>(R.id.txttest)
        val btnBacktoFirst = findViewById<Button>(R.id.btnBacktoFirst)
        val text = intent.getBundleExtra("key")?.getString("name").toString()

        txttest.setText(text)

        btnBacktoFirst.setOnClickListener {
            var mainIntent = Intent(this,MainActivity::class.java)
            startActivity(mainIntent)
        }
    }
}