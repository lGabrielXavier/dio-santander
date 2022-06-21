package src.main.kotlin.one.digitalinnovation.digionebank

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {
    override fun calculoAuxlio() = salario * 0.1

}