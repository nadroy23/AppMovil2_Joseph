package com.joseph.apbmovil2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Perfil_User : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_user)
    }
    fun crear_usuario(btningresar: View){
        val ingreso = Intent(this,Crear_Usuario::class.java)
        startActivity(ingreso)
    }
    fun editar_usuario(btningresar: View){
        val ingreso = Intent(this,Administrar_Usuarios::class.java)
        startActivity(ingreso)
    }
}