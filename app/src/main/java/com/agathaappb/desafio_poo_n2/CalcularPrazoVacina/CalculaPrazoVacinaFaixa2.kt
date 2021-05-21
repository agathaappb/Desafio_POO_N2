package com.agathaappb.desafio_poo_n2.CalcularPrazoVacina

import java.time.LocalDate
import java.time.LocalDate.now

class CalculaPrazoVacinaFaixa2:CalculaPrazoVacina {
    override fun calcularPrazo(nome: String, idade: Int, sexo: String, contaminado: Boolean, gestante:Boolean): List<Any> {

        if (sexo == "Masculino"){
            val prazoContaminado = CalculaPrazoVacinaContaminado()
            val prazo = 30 + prazoContaminado.contaminadoPrazo(contaminado)
            val prazoVacina = listOf("Nome: $nome", "Idade: idade", "Prazo: $prazo dias")
            return prazoVacina
        }else if (gestante == true ){
            val prazoGestante = CalculaPrazoVacinaGestante()
            prazoGestante.calculaGestante(nome, idade, sexo,gestante,contaminado)
            val prazoVacina = listOf("Nome: $nome", "Idade: idade", "Prazo: $prazoGestante dias - Vacinação imediata!")
            return prazoVacina
        }else{
            val prazoContaminado = CalculaPrazoVacinaContaminado()
            val prazo = 30 + prazoContaminado.contaminadoPrazo(contaminado)
            val prazoVacina = listOf("Nome: $nome", "Idade: $idade", "Prazo: $prazo dias")
            return prazoVacina
        }
    }

}

