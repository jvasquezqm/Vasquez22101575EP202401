package com.example.vasquez22101575ep202401

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.vasquez22101575ep202401.menu.PrizesActivity
import com.example.vasquez22101575ep202401.menu.StadiumsActivity
import com.example.vasquez22101575ep202401.menu.TeamsActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnPrizes: Button = findViewById(R.id.btnPrizes)
        val btnStadiums: Button = findViewById(R.id.btnStadiums)
        val btnTeams: Button = findViewById(R.id.btnTeams)

        btnPrizes.setOnClickListener() {
            val intent = Intent(this, PrizesActivity::class.java)
            startActivity(intent)
        }
        btnStadiums.setOnClickListener() {
            val intent = Intent(this, StadiumsActivity::class.java)
            startActivity(intent)
        }
        btnTeams.setOnClickListener() {
            val intent = Intent(this, TeamsActivity::class.java)
            startActivity(intent)
        }
    }
}