package ejercicios_mouredev.hechos

/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun area_poligono (Poligono: poligono) :Double{
    Poligono.printarea()
    return Poligono.calculo()
}
interface poligono{
    fun calculo(): Double
    fun printarea()
}
data class Cuadrado (val base:Double) : poligono {
    override fun calculo(): Double {
        return base*base
    }
    override fun printarea() {
        println("El area del cuadrado es ${calculo()}")
    }
}
open class Rectangulo (open val base:Double, open val altura:Double) : poligono {
    open override fun calculo(): Double {
        return base*altura
    }
    open override fun printarea() {
        println("El area del rectángulo es ${calculo()}")
    }
}
class Triangulo (base: Double, altura: Double) : Rectangulo(base, altura) {
    override fun calculo(): Double {
        return (base*altura)/2
    }
    override fun printarea() {
        println("El área del triángulo es ${calculo()}")
    }
}