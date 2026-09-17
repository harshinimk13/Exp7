package com.example.exp7

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvResult = findViewById<TextView>(R.id.tvResult)
        val tvMessage = findViewById<TextView>(R.id.tvMessage)
        val btnBack = findViewById<Button>(R.id.btnBack)

        val selectedSkill = intent.getStringExtra("selectedSkill")
        val selectedDescription = intent.getStringExtra("selectedDescription")

        tvResult.text = selectedSkill
        tvMessage.text = selectedDescription

        btnBack.setOnClickListener {
            finish()
        }
    }
}