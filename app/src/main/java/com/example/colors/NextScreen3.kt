package com.example.colors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.colors.java.MainActivity

class NextScreen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_screen3)

        val count = intent.getIntExtra("count", 0)
    }
    fun nextScreen(view: View) {
        var count = intent.getIntExtra("count", 0)
        count++

        if (count % 2 == 0) {
            // count четное, переходим на первый экран
            val intent = Intent(this, NextScreen3::class.java)
            intent.putExtra("count", count)
            startActivity(intent)
        } else {
            // count нечетное, переходим на следующий экран
            val intent = Intent(this, NextScreen::class.java)
            intent.putExtra("count", count)
            startActivity(intent)
        }
    }
}