package ClassesEObjetos

class Cliente {
    var nome: String = ""
        get() = field
        set(value) {
            field = value
        }
    private var idade: Int = 0

    // Crie um método público na classe Cliente chamado mostrarIdade() conforme especificado na questão
    fun mostrarIdade(): String{
        return "idade = $idade"
    }
}

fun main() {
    var cliente = Cliente()
    cliente.nome = "Clods"
    println("Idade de ${cliente.nome} ${cliente.mostrarIdade()}")
}