package src.main.kotlin.one.digitalinnovation.collections

fun main() {

    val joao = Funcionario("joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("--------ADD--------")

    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("-------REMOVE------")

    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("--------SET-------")

    val funcionarioSet = mutableSetOf(joao)
    // funcionarioSet.forEach { println(it) }

    println("------------SET ADD ----------------")

    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)

    funcionarioSet.forEach { println(it) }

    println("------------SET REMOVE ----------------")

    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }
}