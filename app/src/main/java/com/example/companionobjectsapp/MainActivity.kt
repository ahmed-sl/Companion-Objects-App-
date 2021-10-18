package com.example.companionobjectsapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout = findViewById<ConstraintLayout>(R.id.layout)
        val ent = findViewById<EditText>(R.id.ent)
        val btn = findViewById<Button>(R.id.btn)
        val txt = findViewById<TextView>(R.id.textView)

        btn.setOnClickListener{
            // step 3 we take the data from user to change background
            val stats = ent.text?.toString()
            when(stats?.toLowerCase()){
                "day" -> {
                    OurClass.createBK(layout,OurClass.day)
                    txt.setTextColor(Color.BLACK)
                    ent.setTextColor(Color.BLACK)
                }
                "night" -> {
                    OurClass.createBK(layout,OurClass.nghit)
                    txt.setTextColor(Color.WHITE)
                    ent.setTextColor(Color.WHITE)
                }
            }
        }
    }
}
