package com.amjad.counter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.countButton).setOnClickListener {
            counter()
        }
    }

        private fun counter(){
            val cnt: TextView = findViewById<TextView>(R.id.count)
            val Cnt=cnt.text.toString()
            val c=Cnt.toInt()+1
            findViewById<TextView>(R.id.count).text= c.toString()
        }



}

