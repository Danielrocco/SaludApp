package com.pmdm.saludapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnHello: AppCompatButton = findViewById(R.id.btnHello)
        val etName:EditText = findViewById(R.id.etname)

        btnHello.setOnClickListener {
            val name = etName.toString()
            Log.i("Test","Boton Pulsado")
            Toast.makeText(this, "Hola $name",Toast.LENGTH_SHORT).show()
        }
    }
}