package com.agathaappb.desafio_poo_n2.CalcularPrazoVacina

import java.time.LocalDate

class CalculaPrazoVacinaFaixa1 : CalculaPrazoVacina{
    override fun calcularPrazo( nome: String, idade: Int, sexo: String, contaminado: Boolean, gestante: Boolean): List<Any> {
        val prazo = 0
        val prazoVacina = listOf("Nome: $nome" , "Idade: $idade", "Prazo: $prazo dias - Vacinação imediata!" )
        return prazoVacina
    }
}