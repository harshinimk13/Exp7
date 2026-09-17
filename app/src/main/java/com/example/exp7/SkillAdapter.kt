package com.example.exp7

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class SkillAdapter(
    private val context: Context,
    private val skills: ArrayList<Skill>
) : BaseAdapter() {

    override fun getCount(): Int {
        return skills.size
    }

    override fun getItem(position: Int): Skill {
        return skills[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View {

        val view = LayoutInflater.from(context)
            .inflate(R.layout.list_item, parent, false)

        val imageView = view.findViewById<ImageView>(R.id.imageView)
        val textView = view.findViewById<TextView>(R.id.textView)
        val subTextView = view.findViewById<TextView>(R.id.subTextView)
        val btnSelect = view.findViewById<Button>(R.id.btnSelect)

        val skill = skills[position]

        // Display skill information
        imageView.setImageResource(skill.image)
        textView.text = skill.name
        subTextView.text = skill.description

        // Open Page 2
        btnSelect.setOnClickListener {

            val intent = Intent(context, ResultActivity::class.java)

            intent.putExtra("selectedSkill", skill.name)
            intent.putExtra("selectedDescription", skill.description)

            context.startActivity(intent)
        }

        return view
    }
}