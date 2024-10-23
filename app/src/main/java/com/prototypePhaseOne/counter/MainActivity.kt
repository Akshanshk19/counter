package com.prototypePhaseOne.counter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val increase_counter_btn : Button = findViewById(R.id.button2)
        val decrease_counter_btn : Button = findViewById(R.id.button)
        val reset_button : Button = findViewById(R.id.button3)
        val txt : TextView = findViewById<TextView>(R.id.textView)

        increase_counter_btn.setOnClickListener {
            performOnClick(txt)
        }
        decrease_counter_btn.setOnClickListener {
            performOnClick1(txt)
        }
        reset_button.setOnClickListener{
            count =0
            txt.setText(count.toString())
        }

    }

    fun performOnClick(txt : TextView) {
        count++
        txt.setText(count.toString())
    }
    fun performOnClick1(txt : TextView) {
        count--
        txt.setText(count.toString())
    }
}