package com.pmdm.saludapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnHello: AppCompatButton = findViewById(R.id.btnHello)
        val etName:EditText = findViewById(R.id.etname)

        btnHello.setOnClickListener {
            val name = etName.toString()
            Log.i("Test","Boton Pulsado")

            if (name.isNotEmpty()) {
                Snackbar.make(btnHello, "Hola $name!", Snackbar.LENGTH_SHORT)
                    .setAnchorView(btnHello)
                    .setAction("RESET") { etName.setText(null) }
                    .show()

            } else {
                Toast.makeText(this, "Hola $name",Toast.LENGTH_SHORT).show()
            }

            val intentGA = Intent(this, GreetingActivity::class.java)
            intentGA.putExtra("EXTRA_NAME", name)
            startActivity(intentGA)
        }
    }
}