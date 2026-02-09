package exercicios

fun main() {
    fun acharImpares() {
        val numeros = (1..100).toList()

        val impares = numeros.filter { numero -> numero % 2 != 0}
        println(impares.toList())
    }
    acharImpares()
}