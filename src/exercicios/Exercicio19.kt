package exercicios

import exercicios.model.ContaBancaria


fun main() {

    val conta = ContaBancaria("Alfredo", 10000.0)
    conta.consultarSaldo()
    conta.depositar(100.0)
    conta.sacar(50.0)

}