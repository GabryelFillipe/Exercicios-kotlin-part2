package exercicios.model

class Pessoa (var nome: String, var idade: Int, var cidade: String) {

    fun apresentacao(){
        println("$nome tem $idade e mora em $cidade")
    }

}