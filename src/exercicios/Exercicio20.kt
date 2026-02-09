package exercicios

import exercicios.model.ContaBancaria
import exercicios.model.Funcionario
import exercicios.model.Gerente


fun main() {

    var funcionario = Funcionario()
    funcionario.nome = "jose"
    funcionario.salario = 1518.00
    funcionario.consultarSalario()

    var gerente = Gerente()
    gerente.nome = "Jonas"
    gerente.salario = 1518.00

    gerente.consultarSalario()


}