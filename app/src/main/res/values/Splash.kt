package com.example.myapplicationcampsitecommander

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash)

        // Delay for 3 seconds
        Handler(Looper.getMainLooper()).postDelayed({

            // Open MainActivity
            val intent =
                Intent(this, MainActivity::class.java)

            startActivity(intent)
//Close splash screen
            finish()
        }, 3000)
    }
    <activity
    android:name="SplashActivity">

    <intent-filter>

    <action
    android:name="android.intent,action.MAIN"/>

    <category
    android:name="android.intent.category.LAUNCHER"
    </intent-filter>
    </activity>
}