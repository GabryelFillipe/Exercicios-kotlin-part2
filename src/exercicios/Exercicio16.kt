package exercicios

fun main() {

    val numero = 5

    val fatorial = (numero downTo  1).toList()

    val result = fatorial.reduce { acumulador, numero -> acumulador * numero }
    println(result)

}