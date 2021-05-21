package com.agathaappb.desafio_poo_n2

import android.app.Activity
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.agathaappb.desafio_poo_n2.DadosPacientes.Pacientes


class MainActivity : Activity(){
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonListagem : Button = findViewById(R.id.buttonListagem)
        val textListagem :TextView = findViewById(R.id.textListagemPrazo)


        buttonListagem.setOnClickListener{

            val list = Pacientes().pacientes()

            list.forEach{
                textListagem.append("${it.calculaPrazoFaixa() } \n\n")
            }




        }



    }
}