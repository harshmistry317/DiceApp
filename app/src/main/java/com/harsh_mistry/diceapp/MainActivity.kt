package com.harsh_mistry.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutoon : Button =  findViewById(R.id.btn_roll)
        rollbutoon.setOnClickListener {

            rolldice()

        }
    }
    private fun rolldice()
    {

        val dice =  Dice(6)
        val diceroll = dice.roll()

        val resulttxt : TextView =  findViewById(R.id.txt)
        resulttxt.text =  diceroll.toString()

    }
}
class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}