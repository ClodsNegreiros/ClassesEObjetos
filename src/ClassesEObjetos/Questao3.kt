package ClassesEObjetos

abstract class Personagem {
    // Crie um método abstrato atacar() conforme especificado na questão
    abstract fun atacar()
}

class Guerreiro : Personagem() {
    // Implemente o método atacar() de acordo com as características do Guerreiro
    override fun atacar() {
        println("Atacar com clave")
    }
}

class Mago : Personagem() {
    override fun atacar() {
        // Implemente o método atacar() de acordo com as características do Mago
        println("Atacar com magia!")
    }
}

fun main() {
    // Crie instâncias de Guerreiro e Mago e chame o método atacar() de cada um para verificar se estão realizando os ataques corretamente de acordo com suas respectivas classes.
    var guerreiro = Guerreiro()
    guerreiro.atacar()

    var mago = Mago()
    mago.atacar()
}