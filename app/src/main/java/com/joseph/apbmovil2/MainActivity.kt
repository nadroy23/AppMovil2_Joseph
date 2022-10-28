package com.joseph.apbmovil2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    private var primera: EditText?=null
    private var editPassword: EditText?=null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        primera = findViewById(R.id.primera)
        editPassword = findViewById(R.id.editPassword)

    }


    fun ingresar(btningresar: View){

        if (primera!!.text.toString()=="admin"){
            if (editPassword!!.text.toString()=="admin"){
                val ingreso = Intent(this,Perfil_User::class.java)
                startActivity(ingreso)
            }
        }
        else if(primera!!.text.toString()=="cliente"){
            if (editPassword!!.text.toString()=="cliente"){
                val ingreso = Intent(this,Perfil_Cliente::class.java)
                startActivity(ingreso)
            }
        }
        else{
            val dialogo = AlertDialog.Builder(this)
                .setTitle("¡Alerta!")
                .setMessage("Usuario o Contraseña incorrectos...") // R.string.variable
                .create().show()
        }
    }

}