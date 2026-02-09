package exercicios

fun main() {
    fun classificarNumero() {
        var numeros = (1 .. 100).toList()
        var result = mutableListOf<String>()

        for (numero in numeros){
            if (numero % 3 == 0 && numero % 5 == 0 ){
                var tipo =  "BatataQuente"
                result.add(tipo)
            }
            if (numero % 3 == 0){
                var tipo =  "Batata"
                result.add(tipo)
            }
            if (numero % 5 == 0){
                var tipo =  "quente"
                result.add(tipo)
            }

        }
        println(result)
    }
    classificarNumero()
}