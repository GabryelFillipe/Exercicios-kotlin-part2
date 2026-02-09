package exercicios

fun main() {

    val numeros = (1..100).toList()

    for (numero in numeros) {
        val resultado = when {
            numero % 15 == 0 -> "BatataQuente"
            numero % 3 == 0 -> "Batata"
            numero % 5 == 0 -> "Quente"
            else -> numero.toString()
        }
        println(resultado)
    }
}