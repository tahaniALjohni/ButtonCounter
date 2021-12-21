package com.example.buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class ButtonCounterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_counter)
    }

    fun increaseNumber(view: View) {
        val num = findViewById<TextView>(R.id.tvNumber)
        num.text = (num.text.toString().toInt() + 1).toString()
    }
}