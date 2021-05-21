package com.agathaappb.desafio_poo_n2.CalcularPrazoVacina

class CalculaPrazoVacinaContaminado {
    fun contaminadoPrazo(contamindo:Boolean):Int{
        if (contamindo == true){
            return 0
        }else{
            return 30
        }
    }
}