package com.example.moragame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    private lateinit var txtCom: TextView
    private lateinit var txtResult: TextView
    private lateinit var btnPaper:Button
    private lateinit var btnRock:Button
    private lateinit var btnScissors: Button
    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtCom = findViewById(R.id.txtCom)
        txtResult = findViewById(R.id.txtResult)
        btnScissors = findViewById(R.id.btnScissor)
        btnRock = findViewById(R.id.btnRock)
        btnPaper = findViewById(R.id.btnPaper)
        imageView = findViewById(R.id.imageView)

        btnScissors.setOnClickListener {
            imageView.setImageResource(R.drawable.scissor)
//            playGame(Choice.SCISSORS)
        }
        btnRock.setOnClickListener {
            imageView.setImageResource(R.drawable.rock)
//            playGame(Choice.ROCK)
        }
        btnPaper.setOnClickListener {
            imageView.setImageResource(R.drawable.paper)
//            playGame(Choice.PAPER)
        }
    }
//    enum class Choice {
//        SCISSORS,ROCK,PAPER
//    }
//    fun playGame(playerChoice: Choice){
//        val choices = Choice.values()
//        val computerChoice = choices[Random().nextInt(choices.size)]
//
//        when{
//            playerChoice == computerChoice ->{
//                txtCom.setText(getChoiceString(computerChoice))
//                txtResult.setText(R.string.draw)
//            }
//            (playerChoice == Choice.SCISSORS && computerChoice == Choice.PAPER) ||
//                    (playerChoice == Choice.ROCK && computerChoice == Choice.SCISSORS) ||
//                    (playerChoice == Choice.PAPER && computerChoice == Choice.ROCK) -> {
//                        txtCom.setText(getChoiceString(computerChoice))
//                        txtResult.setText(R.string.win)
//                    }
//            else ->{
//                txtCom.setText(getChoiceString(computerChoice))
//                txtResult.setText(R.string.lose)
//            }
//        }
//    }
//    fun getChoiceString(choice: Choice): Int{
//        return  when (choice){
//            Choice.SCISSORS -> R.string.scissors
//            Choice.ROCK -> R.string.rock
//            Choice.PAPER -> R.string.paper
//        }
//    }
}