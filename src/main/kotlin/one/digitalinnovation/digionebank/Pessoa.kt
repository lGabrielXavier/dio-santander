package src.main.kotlin.one.digitalinnovation.digionebank

class Pessoa {

    var nome: String = "gabriel"
    var cpf: String = "132.000.124-19"
    private set

    constructor()

    fun pessoaInfo() ="$nome e $cpf"
}
fun main() {

    val gabriel = Pessoa()
    println(gabriel.pessoaInfo())



}