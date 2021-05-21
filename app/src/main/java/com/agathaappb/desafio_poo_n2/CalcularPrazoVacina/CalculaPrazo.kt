package com.agathaappb.desafio_poo_n2.CalcularPrazoVacina

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.temporal.ChronoUnit

class CalculaPrazo(val nome: String, val dataNascimento: LocalDate, var sexo: String,
                   var contaminado: Boolean, val gestante: Boolean){

    @RequiresApi(Build.VERSION_CODES.O)
    fun calculaPrazoFaixa(): List<Any> {

        var timeNow = LocalDate.now()
        var idade = ChronoUnit.YEARS.between(dataNascimento,timeNow).toInt()


        if(idade > 70 || gestante == true){
            var prazo : CalculaPrazoVacinaFaixa1 = CalculaPrazoVacinaFaixa1()
            return prazo.calcularPrazo(nome, idade, sexo, contaminado,gestante)
        }else if(idade < 70 && idade > 60){
            var prazo : CalculaPrazoVacinaFaixa2 = CalculaPrazoVacinaFaixa2()
            return prazo.calcularPrazo(nome, idade, sexo, contaminado,gestante)
        }else if(idade < 60 && idade > 50){
            var prazo : CalculaPrazoVacinaFaixa3 = CalculaPrazoVacinaFaixa3()
            return prazo.calcularPrazo(nome, idade, sexo, contaminado,gestante)
        }else if (idade < 50 && idade > 30){
            var prazo : CalculaPrazoVacinaFaixa4 = CalculaPrazoVacinaFaixa4()
            return prazo.calcularPrazo(nome, idade, sexo, contaminado,gestante)
        }else if (idade < 20 && idade > 30){
            var prazo : CalculaPrazoVacinaFaixa5 = CalculaPrazoVacinaFaixa5()
            return prazo.calcularPrazo(nome, idade, sexo, contaminado,gestante)
        }else{
            var prazo : CalculaPrazoVacinaFaixa6 = CalculaPrazoVacinaFaixa6()
            return prazo.calcularPrazo(nome, idade, sexo, contaminado,gestante)
        }

        }

}