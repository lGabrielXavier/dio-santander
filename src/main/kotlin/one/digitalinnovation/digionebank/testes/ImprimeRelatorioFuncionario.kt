package src.main.kotlin.one.digitalinnovation.digionebank.testes

import src.main.kotlin.one.digitalinnovation.digionebank.Funcionario

class ImprimeRelatorioFuncionario {

    companion object {

        fun Imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}