package exercicios

fun main() {

    val idades = listOf(14,12,19,90,22)

    val totalIdades = idades.filter { idade -> idade > 18 }
    val media = totalIdades.reduce { acumulador, idade -> acumulador + idade  }.toDouble() / totalIdades.size

    println(media)
}