package model

class CarroTunado: Carro() {
    var ranking: Char = 'f'

    override  fun acelerar(){
        println("PAH-PAH")
    }
}