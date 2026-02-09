package exercicios

import exercicios.model.Produto

fun main() {

   val produto1 = Produto("Mouse", 123.00)
   val produto2 = Produto("Teclado", 250.00)
   val produto3 = Produto("Head-set", 300.00)

    val produtos = arrayOf<Produto>(produto1, produto2, produto3)

    val produtoMaisCaro = produtos.reduce { acumulador, produto ->
        if (acumulador.preco < produto.preco) produto else acumulador
    }
    println("O produto mais caro é o produto ${produtoMaisCaro.nome} e custa ${produtoMaisCaro.preco}")


}