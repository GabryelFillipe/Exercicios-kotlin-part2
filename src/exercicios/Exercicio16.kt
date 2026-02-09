package exercicios

fun main() {

    var numero = 5

    var fatorial = (numero downTo  1).toList()

    var result = fatorial.reduce { acumulador, numero -> acumulador * numero }
    println(result)

}