package src.main.kotlin.one.digitalinnovation.digionebank.testes
import src.main.kotlin.one.digitalinnovation.digionebank.Analista
import src.main.kotlin.one.digitalinnovation.digionebank.Funcionario
import src.main.kotlin.one.digitalinnovation.digionebank.Gerente
import src.main.kotlin.one.digitalinnovation.digionebank.Pessoa

fun main() {

    val maria = Gerente(nome ="maria santos ",cpf ="15232499", salario = 5000.00)
    ImprimeRelatorioFuncionario.Imprime(maria)

}
