package com.chanda.lapaalap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_splash)
        window.setFlags(FLAG_FULLSCREEN, FLAG_FULLSCREEN)
        goToNext()
    }

    private fun goToNext() {
        Handler().postDelayed({
            val contentIntent = Intent(this@SplashActivity, MainActivity::class.java).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(contentIntent)
            finish()
        }, 4000)
    }
}