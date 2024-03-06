package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val guess_button = findViewById<Button>(R.id.guess_button)
        val reset_button = findViewById<Button>(R.id.reset_button)
        val editText = findViewById<EditText>(R.id.editText)
        val head_text = findViewById<TextView>(R.id.head_text)
        val tail_text = findViewById<TextView>(R.id.tail_text)
        val showtext = findViewById<TextView>(R.id.showtext)
        val testnum = findViewById<TextView>(R.id.testnum)
        //定義範圍值
        var validate_num:Int
        var min = 1;
        var max = 100;
        //取亂數
        var secret : Int = Random().nextInt(100)+1
        testnum.text=secret.toString()
        var ans_str:String
        guess_button.setOnClickListener{
            validate_num = editText.text.toString().toInt()
            if(validate_num>secret){
                tail_text.text = validate_num.toString()
            }
            else if(validate_num<secret){
                head_text.text = validate_num.toString()
            }
            else{
                ans_str="BINGO!"
                showtext.text=ans_str
            }
        }
        reset_button.setOnClickListener{
            head_text.text=min.toString()
            tail_text.text=max.toString()
            secret = Random().nextInt(100)+1
            testnum.text=secret.toString()
            ans_str=""
            showtext.text=ans_str
        }
    }
}
