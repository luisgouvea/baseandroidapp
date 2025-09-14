package com.example.baseandroidapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(getStartIntent())
    }
    private fun getStartIntent(): Intent {
        return Intent("com.example.baseandroidapp.app.MainActivity")
    }
}
