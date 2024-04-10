package com.example.user_input_text

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = findViewById<EditText>(R.id.input_name)
        val account = findViewById<EditText>(R.id.input_acconut)
        val psd = findViewById<EditText>(R.id.input_psd)
        val email = findViewById<EditText>(R.id.input_email)
        val phone = findViewById<EditText>(R.id.input_phone)
        val birth = findViewById<EditText>(R.id.input_birth)
        val button = findViewById<Button>(R.id.button)
        val spnGender = findViewById<Spinner>(R.id.spnGender)
        val adapter = ArrayAdapter.createFromResource(this,R.array.gender,
                                                android.R.layout.simple_spinner_dropdown_item)
        spnGender.adapter = adapter
        var spinnerView: Int
        spinnerView = 0
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
                spinnerView = pos
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }
        button.setOnClickListener{
            var name_m = name.text.toString()
            var account_m = account.text.toString()
            var psd_m = psd.text.toString()
            var birth_m = birth.text.toString()
            var email_m = email.text.toString()
            var phone_m = phone.text.toString()
            val gender= resources.getStringArray(R.array.gender)

            var gender_m =gender[spinnerView]
            AlertDialog.Builder(this).setTitle("基本資料").setMessage(name_m+"\n"+account_m
            +"\n"+psd_m+"\n"+birth_m+"\n"+email_m+"\n"+phone_m+"\n"+gender_m).create().show()
        }
    }
}