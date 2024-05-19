package com.example.vasquez22101575ep202401.menu

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.vasquez22101575ep202401.R

class PrizesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_prizes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val etCantidad: EditText = findViewById(R.id.etCantidad)
        val btnCalcularPrizes: Button = findViewById(R.id.btnCalcularPrizes)
        val tv1Place: TextView = findViewById(R.id.tv1Place)
        val tv2Place: TextView = findViewById(R.id.tv2Place)
        val tv3Place: TextView = findViewById(R.id.tv3Place)
        val tv4Place: TextView = findViewById(R.id.tv4Place)

        btnCalcularPrizes.setOnClickListener {
            val cantidad = etCantidad.text.toString().toInt()
            val prize1 = cantidad * 0.25
            val prize2 = cantidad * 0.15
            val prize3 = cantidad * 0.1
            val prize4 = cantidad -(prize1 + prize2 + prize3)
            tv1Place.text = "1er lugar: $prize1"
            tv2Place.text = "2do lugar: $prize2"
            tv3Place.text = "3er lugar: $prize3"
            tv4Place.text = "4to lugar: $prize4"
        }

    }
}