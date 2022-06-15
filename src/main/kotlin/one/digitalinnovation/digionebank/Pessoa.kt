package src.main.kotlin.one.digitalinnovation.digionebank

class Pessoa {

    var nome : String = "gabriel"
    var cpf : String = "132.000.124-19"
}
fun main(){

    val gabriel = Pessoa()
    println(gabriel.nome)
    println(gabriel.cpf)
}