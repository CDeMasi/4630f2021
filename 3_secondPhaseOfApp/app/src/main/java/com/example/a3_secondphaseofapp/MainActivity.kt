package com.example.a3_secondphaseofapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToWeather(view: View) {
        val intent = Intent(this, WeatherActivity::class.java).apply {}
        startActivity(intent)
    }

    fun goToPortfolio(view: View) {
        val intent = Intent(this, PortfolioActivity::class.java).apply {}
        startActivity(intent)
    }

    fun goToResume(view: View) {
        val intent = Intent(this, ResumeActivity::class.java).apply {}
        startActivity(intent)
    }
}
