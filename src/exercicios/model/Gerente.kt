package exercicios.model

class Gerente: Funcionario() {

    override  fun consultarSalario(){
        var bonificacao = (20.0 / 100.0) * salario
        println("O salario do funcionario $nome é ${salario+bonificacao}")

    }
}