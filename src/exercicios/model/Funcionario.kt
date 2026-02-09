package exercicios.model

open class Funcionario{

    var nome: String = ""


    var salario: Double = 0.0
        set(value) {
            if (value > 0.0){
                field = value
            } else {
                field = 0.0
            }
        }

    open  fun consultarSalario(){
        println("O salario do funcionario $nome é $salario")
    }
}