package exercicios

fun main() {
    fun acharImpares() {
        var numeros = (1..100).toList()

        var impares = numeros.filter { numero -> numero % 2 != 0}
        println(impares.toList())
    }
    acharImpares()
}