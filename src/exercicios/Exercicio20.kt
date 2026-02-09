package exercicios

import exercicios.model.Funcionario
import exercicios.model.Gerente


fun main() {

    val funcionario = Funcionario()
    funcionario.nome = "jose"
    funcionario.salario = 1518.00
    funcionario.consultarSalario()

    val gerente = Gerente()
    gerente.nome = "Jonas"
    gerente.salario = 1518.00

    gerente.consultarSalario()


}