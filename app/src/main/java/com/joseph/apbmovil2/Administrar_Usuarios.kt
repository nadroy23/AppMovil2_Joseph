package com.joseph.apbmovil2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Administrar_Usuarios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_administrar_usuarios)
    }
    fun volver(btningresar: View){
        val ingreso = Intent(this,Perfil_User::class.java)
        startActivity(ingreso)
    }
    fun editar(btningresar: View){
        val ingreso = Intent(this,Editar_Usuarios::class.java)
        startActivity(ingreso)
    }
}