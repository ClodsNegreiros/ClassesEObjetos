package ClassesEObjetos

interface FormaGeometrica {
    fun calcularArea() : Double
}

class Retangulo(val altura: Double, val largura: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        return altura * largura
    }
}

class Circulo(val raio: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        return Math.PI * (raio * 2)
    }
}

fun main() {
    // Crie instâncias dessas duas classes e chame o método calcularArea() em cada uma delas para verificar o resultado.
    var retangulo = Retangulo(10.0, 20.0)
    var circulo = Circulo(10.0)

    println(retangulo.calcularArea())
    println(circulo.calcularArea())
}