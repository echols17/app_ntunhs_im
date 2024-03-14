package com.example.user_input_text

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spnGender = findViewById<Spinner>(R.id.spnGender)
        val adapter = ArrayAdapter.createFromResource(this,R.array.gender,
                                                android.R.layout.simple_spinner_dropdown_item)
        spnGender.adapter = adapter

        spnGender.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                pos: Int,
                id: Long
            ) {
                val gender= resources.getStringArray(R.array.gender)
                if(pos>0)
                    Toast.makeText(this@MainActivity,"你選的是"+gender[pos],
                        Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }
    }
}