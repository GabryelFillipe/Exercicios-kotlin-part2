package exercicios

fun main() {
    fun classificarNumero() {
        val numeros = (1 .. 100).toList()
        val result = mutableListOf<String>()

        for (numero in numeros){
            if (numero % 3 == 0 && numero % 5 == 0 ){
                val tipo =  "BatataQuente"
                result.add(tipo)
            }
            if (numero % 3 == 0){
                val tipo =  "Batata"
                result.add(tipo)
            }
            if (numero % 5 == 0){
                val tipo =  "quente"
                result.add(tipo)
            }

        }
        println(result)
    }
    classificarNumero()
}