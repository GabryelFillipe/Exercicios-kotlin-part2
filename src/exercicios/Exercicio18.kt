package exercicios

import exercicios.model.Produto

fun main() {

   var produto1 = Produto("Mouse", 123.00)
   var produto2 = Produto("Teclado", 250.00)
   var produto3 = Produto("Head-set", 300.00)

    var produtos = arrayOf<Produto>(produto1, produto2, produto3)

    var produtoMaisCaro = produtos.reduce { acumulador, produto ->
        if (acumulador.preco < produto.preco) produto else acumulador
    }
    println("O produto mais caro é o produto ${produtoMaisCaro.nome} e custa ${produtoMaisCaro.preco}")


}