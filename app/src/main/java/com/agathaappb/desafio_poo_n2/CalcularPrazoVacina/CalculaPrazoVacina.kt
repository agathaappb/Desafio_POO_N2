package com.agathaappb.desafio_poo_n2.CalcularPrazoVacina

import java.time.LocalDate


interface CalculaPrazoVacina{
    fun calcularPrazo(nome:String, idade : Int, sexo : String, contaminado : Boolean, gestante: Boolean):List<Any>





}