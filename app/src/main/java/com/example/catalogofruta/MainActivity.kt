package com.example.catalogofruta

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<android.widget.ImageButton>(R.id.btnBananas).setOnClickListener   { abrir("bananas") }
        findViewById<android.widget.ImageButton>(R.id.btnCerezas).setOnClickListener   { abrir("cerezas") }
        findViewById<android.widget.ImageButton>(R.id.btnFrambuesas).setOnClickListener{ abrir("frambuesas") }
        findViewById<android.widget.ImageButton>(R.id.btnFresas).setOnClickListener    { abrir("fresas") }
        findViewById<android.widget.ImageButton>(R.id.btnKiwis).setOnClickListener     { abrir("kiwis") }
        findViewById<android.widget.ImageButton>(R.id.btnMangos).setOnClickListener    { abrir("mangos") }
        findViewById<android.widget.ImageButton>(R.id.btnManzanas).setOnClickListener  { abrir("manzanas") }
        findViewById<android.widget.ImageButton>(R.id.btnMelon).setOnClickListener     { abrir("melon") }
        findViewById<android.widget.ImageButton>(R.id.btnNaranjas).setOnClickListener  { abrir("naranjas") }
        findViewById<android.widget.ImageButton>(R.id.btnPera).setOnClickListener      { abrir("pera") }
        findViewById<android.widget.ImageButton>(R.id.btnPina).setOnClickListener      { abrir("pina") }
        findViewById<android.widget.ImageButton>(R.id.btnSandia).setOnClickListener    { abrir("sandia") }
        findViewById<android.widget.ImageButton>(R.id.btnUvas).setOnClickListener      { abrir("uvas") }
        findViewById<android.widget.ImageButton>(R.id.btnZarzamora).setOnClickListener { abrir("zarzamora") }
    }

    private fun abrir(clave: String) {
        val intent = Intent(this, DetalleActivity::class.java)
        intent.putExtra("FRUTA_CLAVE", clave)
        startActivity(intent)
    }
}