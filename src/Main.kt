import model.Carro
import model.CarroTunado

fun main() {

    val carro = CarroTunado()

    carro.modelo = "Fusca"
    carro.ano = 1999
    carro.ranking = 'S'

    carro.acelerar()
}