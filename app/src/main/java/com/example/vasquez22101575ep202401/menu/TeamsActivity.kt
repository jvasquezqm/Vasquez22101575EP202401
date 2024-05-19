package com.example.vasquez22101575ep202401.menu

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.vasquez22101575ep202401.MainActivity
import com.example.vasquez22101575ep202401.R

class TeamsActivity : AppCompatActivity() {
    var listPaises = arrayOf(
        "Argentina", "Brasil", "Chile", "Colombia", "Ecuador", "Paraguay",
        "Perú", "Uruguay", "Venezuela")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_teams)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val lsvPaisesCopaAmerica: ListView = findViewById(R.id.listPaises)
        val adaptador: Any? =
            ArrayAdapter<Any?>(this, android.R.layout.simple_list_item_1, listPaises)
        lsvPaisesCopaAmerica.adapter = adaptador as ListAdapter?
        lsvPaisesCopaAmerica.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(applicationContext,"Estoy en la posición $position",
                Toast.LENGTH_LONG).show()

        }
        val btnBackMenu2: Button = findViewById(R.id.btnBackMenu2)
        btnBackMenu2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}