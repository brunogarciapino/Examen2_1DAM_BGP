import kotlin.math.sqrt

class Punto(var identificador: String) {

    var x: Int = 0
    var y: Int = 0

    constructor(identificador: String, x: Int, y: Int) : this(identificador) {
        this.x = x
        this.y = y
    }

    fun obtenerCoordenadas() { val (x, y) = Pair(x, y) }
    override fun toString(): String {
        return "<$identificador> -> [<$x>,<$y>]"
    }
    companion object {

        fun componenteDeVector(P1: Punto, P2: Punto) = Punto(P1.identificador+P2.identificador,P2.x-P1.x,P2.y-P1.y)

        fun distancia(Punto1: Punto, Punto2: Punto) {
            val diferencia: Double = sqrt(((Punto2.x - Punto1.x).toDouble()) * ((Punto2.x - Punto1.x).toDouble()) + (Punto2.y - Punto1.y) * (Punto2.y - Punto1.y))
            println(diferencia)
        }

        fun localizacionGeograficaNS(lista: Array<Punto>): Map<String, List<Punto>> {
            val norte = lista.filter { it.y >= 0  }
            val sur = lista.filter { it.y <0 }
            val clasificar:Map<String, List<Punto>> = mapOf("Norte" to norte, "Sur" to sur)

            return (clasificar)
        }
    }
}
fun main() {
    val parametroA = Punto("ParametroA", 3, 2)
    val parametroB = Punto("ParametroB", 1, 3)
    val parametroC = Punto.componenteDeVector(parametroA, parametroB)
    val parametroD = Punto("parametroD",4,1)
    val parametroE = Punto("parametroE",7,6)
    val parametroF = Punto("parametroF",-3,-1)
    val parametroG = Punto("parametroG",-4,5)
    val parametroH = Punto("parametroH",2,-1)
    val parametroI = Punto("parametroI",6,-3)
    val parametroJ = Punto("parametroJ",-1,4)
    val parametroK = Punto("parametroK",7,7)
    var lista = arrayOf(parametroA,parametroB,parametroD,parametroE,parametroF,parametroG,parametroH,parametroI,parametroJ,parametroK)
    println(parametroC)
    Punto.distancia(parametroA, parametroB)
    println (Punto.localizacionGeograficaNS(lista))
}