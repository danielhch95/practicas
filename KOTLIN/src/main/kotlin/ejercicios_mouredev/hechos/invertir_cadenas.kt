package ejercicios_mouredev.hechos

/*
 * Reto #6
 * INVIRTIENDO CADENAS
 * Fecha publicación enunciado: 07/02/22
 * Fecha publicación resolución: 14/02/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun invertir_cadena(Cadena:String): String {
    val cadena_char = Cadena.toCharArray()
    val lista_char = cadena_char.clone()
    var iteraciones = (cadena_char.size)-1
    for (valor in cadena_char) {
        lista_char[iteraciones] = valor
        iteraciones -= 1
    }
    var cadena_final:String = ""
    for (letra in lista_char) {
        cadena_final += letra
    }
    return "La cadena invertida es: " + cadena_final
}