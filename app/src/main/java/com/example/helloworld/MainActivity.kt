package com.example.helloworld

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.TypefaceSpan
import android.util.Log
import android.widget.Button
import android.widget.Toast
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var click = 0
        val heading = findViewById<TextView>(R.id.HeadingTextView)
        val intro = findViewById<TextView>(R.id.IntroTextView)
        val layout1 = findViewById<ConstraintLayout>(R.id.rLayout)
        val button = findViewById<Button>(R.id.helloButton)

        button.setOnClickListener {
            click += 1
            if (click > 3) click = 1
            if (click == 1) {
                Log.v("Hello World", "Button clicked! (Light Theme)")
                button.backgroundTintList = getColorStateList(android.R.color.black)
                button.setTextColor(Color.parseColor("#EEEEEE"))
                heading.setTextColor(Color.parseColor("#1A120B"))
                intro.setTextColor(Color.parseColor("#1A120B"))
                layout1.backgroundTintList = getColorStateList(android.R.color.background_light)
                Toast.makeText(this, getString(R.string.light_theme_msg), Toast.LENGTH_SHORT).show()
                click += 1
            } else if (click == 3) {
                Log.v("Hello World", "Button clicked! (Dark Theme)")
                button.backgroundTintList = getColorStateList(android.R.color.white)
                button.setTextColor(Color.parseColor("#1A120B"))
                heading.setTextColor(Color.parseColor("#EEEEEE"))
                intro.setTextColor(Color.parseColor("#EEEEEE"))
                layout1.backgroundTintList = getColorStateList(android.R.color.background_dark)
                Toast.makeText(this, getString(R.string.dark_theme_message), Toast.LENGTH_SHORT).show()
            }
        }
    }
}