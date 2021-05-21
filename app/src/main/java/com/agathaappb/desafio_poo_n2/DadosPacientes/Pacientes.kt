package com.agathaappb.desafio_poo_n2.DadosPacientes

import android.icu.text.DateFormat.*
import android.os.Build
import androidx.annotation.RequiresApi
import com.agathaappb.desafio_poo_n2.CalcularPrazoVacina.CalculaPrazo
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Pacientes {
    @RequiresApi(Build.VERSION_CODES.O)
    fun pacientes() = listOf(
                    CalculaPrazo("Andre", LocalDate.parse("2006-11-07", DateTimeFormatter.ISO_DATE), "Masculino", false, false),
                    CalculaPrazo("Gabriela", LocalDate.parse("1946-02-22", DateTimeFormatter.ISO_DATE), "Feminino", false, false),
                    CalculaPrazo("Larissa", LocalDate.parse("1989-05-20", DateTimeFormatter.ISO_DATE), "Feminino", false, true),
                    CalculaPrazo("Guilherme", LocalDate.parse("1981-03-01", DateTimeFormatter.ISO_DATE), "Masculino", true, false),
                    CalculaPrazo("Leticia", LocalDate.parse("1961-06-04", DateTimeFormatter.ISO_DATE), "Feminino", false, false),
                    CalculaPrazo("Maria", LocalDate.parse("1986-08-03", DateTimeFormatter.ISO_DATE), "Feminino", true, false))



}





