package exercicios

fun main() {
   var precos = listOf(12.09,14.55,16.80)

    var total = precos.reduce { acumulador, preco -> acumulador + preco  }

    println(total)
}