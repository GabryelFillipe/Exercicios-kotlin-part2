package exercicios

fun main() {

    val idades = listOf(14,12,19,90,22)

    var totalIdades = idades.filter { idade -> idade > 18 }
    var media = totalIdades.reduce { acumulador, idade -> acumulador + idade  }.toDouble() / totalIdades.size

    println(media)
}