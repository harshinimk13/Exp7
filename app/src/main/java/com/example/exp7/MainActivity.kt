package com.example.exp7

import android.os.Bundle
import android.view.MotionEvent
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        val skills = arrayListOf(
            Skill(
                "Android Development",
                "Build modern mobile applications",
                R.drawable.android
            ),
            Skill(
                "AI & Machine Learning",
                "Explore intelligent systems and data",
                R.drawable.ai
            ),
            Skill(
                "Web Development",
                "Create responsive websites and interfaces",
                R.drawable.web
            ),
            Skill(
                "Database Management",
                "Store and manage application data",
                R.drawable.database
            )
        )

        val adapter = SkillAdapter(this, skills)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->

            val selectedSkill = skills[position]

            Toast.makeText(
                this,
                "Selected: ${selectedSkill.name}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    }