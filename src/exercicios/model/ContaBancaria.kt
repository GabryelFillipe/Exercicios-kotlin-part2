package exercicios.model

class ContaBancaria(var nomeTitular: String, private var saldo: Double) {

    fun depositar(valor: Double){
        saldo+=valor
        println(saldo)
    }
    fun  sacar(valor: Double){
        if (saldo == 0.0){
            println("Não tem saldo para sacar")
        } else {
            saldo-= valor
            println("Voce sacou $valor do seu saldo e sobrou em sua conta ${saldo-valor}")
        }
    }

    fun consultarSaldo(){
        println(saldo)
    }
}