package com.colors.java

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.colors.NextScreen
import com.example.colors.R

class MainActivity : AppCompatActivity() {

    var count: Int = 0
    lateinit var myIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (count == 1) {
            count++
            myIntent = Intent(this, NextScreen::class.java)
            myIntent.putExtra("count", count)
            startActivity(myIntent)
        }
    }

    fun onClick(view: View) {
        count++
        if (count % 2 == 0) {
            myIntent = Intent(this, MainActivity::class.java)
            myIntent.putExtra("count", count)
            startActivity(myIntent)
        } else {
            myIntent = Intent(this, NextScreen::class.java)
            myIntent.putExtra("count", count)
            startActivity(myIntent)
        }
    }
}
