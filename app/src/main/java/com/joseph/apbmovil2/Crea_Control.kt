package com.joseph.apbmovil2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Crea_Control : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crea_control)
    }
    fun volver(btningresar: View){
        val ingreso = Intent(this,Perfil_Cliente::class.java)
        startActivity(ingreso)
    }
    fun crea(btncrea: View){
        val ingreso = Intent(this,Perfil_Cliente::class.java)
        startActivity(ingreso)
    }
}