package model

open class Carro (){

    var modelo: String = ""
        get() {
            return  field.uppercase()
        }

    var ano: Int = 0
        set(value){
            if (value > 0){
                field =  value
            } else {
                field = 0
            }
        }

    private  var kilometragem: Double = 0.0



   open fun acelerar(){
        println("vrum")
    }

    fun rodar(km: Double) {
        kilometragem += km
    }

    fun consultarKm(): Double {
        return kilometragem
    }

}