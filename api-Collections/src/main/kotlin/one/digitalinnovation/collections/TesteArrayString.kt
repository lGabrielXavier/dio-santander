package src.main.kotlin.one.digitalinnovation.collections

fun main (){

    val nomes = Array<String>(3) {""}
    nomes [0] = "Maria"
    nomes [1] = "zazá"
    nomes [2] = "José"


    for (nome in nomes){
        println(nome)
    }
    println("----------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("----------")
    val nomes2 = arrayListOf("maria","Ruan","Pedro")
    nomes2.sort()
    nomes2.forEach{ println(it) }
}