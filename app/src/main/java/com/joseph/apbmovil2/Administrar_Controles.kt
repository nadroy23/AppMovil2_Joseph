package com.joseph.apbmovil2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Administrar_Controles : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_administrar_controles)
    }
    fun volver(btningresar: View){
        val ingreso = Intent(this,Crea_Control::class.java)
        startActivity(ingreso)
    }
}