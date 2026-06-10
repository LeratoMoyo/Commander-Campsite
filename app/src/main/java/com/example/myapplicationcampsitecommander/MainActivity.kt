package com.example.myapplicationcampsitecommander

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash)
        val btnStart = findViewBy<Button>(R.id.btnStart)
        val btnExit = findViewById<Button>(R.id.btnExit)
        btnStart.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            StartActivity(intent)
        }
        btnExit.setOnClickListener {
            val intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnExit.setOnClickListener {
            finishAffinity()
        }
        }
    }
