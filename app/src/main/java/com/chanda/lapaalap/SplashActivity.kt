package com.chanda.lapaalap

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        fun goToNext() {
                Handler().postDelayed({
                val contentIntent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(contentIntent)
                finish()
            }, 4000)
        }

        fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_splash)
            goToNext()
        }


    }
}