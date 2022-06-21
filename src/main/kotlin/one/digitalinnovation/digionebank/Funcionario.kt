package src.main.kotlin.one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario (
     nome : String,
     cpf : String,
    val salario : Double
    ): Pessoa(nome,cpf){
   protected abstract fun calculoAuxlio():Double

    override fun toString(): String =  """
        Nome : $nome
        cpf : $cpf
        salario : $salario
        Auxilio : ${calculoAuxlio()}
    """.trimIndent()

    }