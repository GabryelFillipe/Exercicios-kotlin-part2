package exercicios

fun main() {
   val precos = listOf(12.09,14.55,16.80)

    val total = precos.reduce { acumulador, preco -> acumulador + preco  }

    println(total)
}