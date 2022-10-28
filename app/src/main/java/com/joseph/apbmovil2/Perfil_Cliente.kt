package com.joseph.apbmovil2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Perfil_Cliente : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_cliente)
    }
    fun volver(btningresar: View){
        val ingreso = Intent(this,MainActivity::class.java)
        startActivity(ingreso)
    }
    fun crear(btningresar: View){
        val ingreso = Intent(this,Crea_Control::class.java)
        startActivity(ingreso)
    }
    fun administrar(btningresar: View){
        val ingreso = Intent(this,Administrar_Controles::class.java)
        startActivity(ingreso)
    }
}