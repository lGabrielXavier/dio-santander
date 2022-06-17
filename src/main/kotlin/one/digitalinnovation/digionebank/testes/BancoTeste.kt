package src.main.kotlin.one.digitalinnovation.digionebank.testes

import src.main.kotlin.one.digitalinnovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco(nome ="DigiOne",numero =12)
    println(digiOneBank.nome)
    println(digiOneBank.numero)
    digiOneBank.nome

    val bank2 = digiOneBank.copy("digione2",13)
    println(bank2.nome)
    println(bank2.numero)
}