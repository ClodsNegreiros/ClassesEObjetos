package ClassesEObjetos

class ContaBancaria {
    var numeroConta: String = ""
    var nomeTitular: String = ""
        get() = field.replaceFirstChar{it.titlecaseChar()}
        set(value){
            field = value
        }

    var saldo: Double = 0.0
        get() = field
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                field = 0.0
            }
        }

    override fun toString(): String {
        return "ContaBancaria: numero da conta: '$numeroConta',\n nome do Titular: '$nomeTitular', saldo=$saldo)"
    }
}

fun main() {
    val conta = ContaBancaria()
    conta.numeroConta = "123.00.3444-5"
    conta.nomeTitular = "Clods"
    conta.saldo = -1400.0
    println(conta.toString())
}