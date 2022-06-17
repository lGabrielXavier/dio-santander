package src.main.kotlin.one.digitalinnovation.digionebank.testes

import src.main.kotlin.one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach {elemento ->
        print("${elemento.name} - ${elemento.descricao} ")
    }
    ClienteTipo.values().forEach {
        print("${it.name} - ${it.descricao} ")
    }
    val pf = ClienteTipo.PF
    print(" >> ${pf.name} - ${pf.descricao} ")

    val pj = ClienteTipo.PJ
    print(" >> ${pj.descricao} - ${pj.descricao}")
}