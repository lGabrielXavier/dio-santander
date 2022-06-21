package src.main.kotlin.one.digitalinnovation.digionebank.testes

import src.main.kotlin.one.digitalinnovation.digionebank.Analista
import src.main.kotlin.one.digitalinnovation.digionebank.Funcionario
import src.main.kotlin.one.digitalinnovation.digionebank.Pessoa

fun main() {

   val joao = Analista(nome ="joao",cpf ="15232499", salario = 2000.00)
    ImprimeRelatorioFuncionario.Imprime(joao)

}
//fun imprimeRelatorio(Funcionario:Funcionario) = print(Funcionario.toString())
