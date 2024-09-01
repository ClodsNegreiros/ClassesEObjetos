package ClassesEObjetos

class Produto{
    var nome: String
    var preco: Double

    constructor(){
        this.nome = "Produto"
        this.preco = 0.0
    }

    constructor(nome : String){
        this.nome = nome
        this.preco = 0.0
    }

    constructor(nome: String, preco: Double){
        this.nome = nome
        this.preco = preco
    }

    override fun toString(): String {
        return "Produto('$nome', R$$preco)"
    }
}

fun main() {
    var produtoBase = Produto()
    println(produtoBase.toString())

    var cadeiraGamer = Produto("Cadeira Gamer")
    println(cadeiraGamer.toString())

    var notebookGamer = Produto("Notebook Gamer", 5500.0)
    println(notebookGamer.toString())
}