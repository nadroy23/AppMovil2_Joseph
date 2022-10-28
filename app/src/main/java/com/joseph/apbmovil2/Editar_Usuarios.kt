package com.joseph.apbmovil2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Editar_Usuarios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar_usuarios)
    }
    fun volver(btningresar: View){
        val ingreso = Intent(this,Administrar_Usuarios::class.java)
        startActivity(ingreso)
    }
    fun finalizar(btningresar: View){
        val ingreso = Intent(this,Administrar_Usuarios::class.java)
        startActivity(ingreso)
    }
}