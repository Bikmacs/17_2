package com.example.colors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    var count: Int = 0
    lateinit var myIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        count++
        when (count % 3) {
            0 -> {
                myIntent = Intent(this, MainActivity::class.java)
                myIntent.putExtra("count", count)
                startActivity(myIntent)
            }
            1 -> {
                myIntent = Intent(this, NextScreen::class.java)
                myIntent.putExtra("count", count)
                startActivity(myIntent)
            }
            2 -> {
                myIntent = Intent(this, NextScreen3::class.java)
                myIntent.putExtra("count", count)
                startActivity(myIntent)
            }
        }
    }

}
