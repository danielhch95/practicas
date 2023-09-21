package ejercicios_mouredev.hechos

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
fun anagrama(): Boolean {
    print("Primera palabra: ")
    val palabra_one: String = readln().toString()
    print("Segunda palabra: ")
    val palabra_two: String = readln().toString()
    if (palabra_one == palabra_two){
        print("No son anagramas por ser iguales")
        return false
    }
    val palabra_one_list = mutableListOf<Char>()
    val palabra_two_list = mutableListOf<Char>()
    for (index in palabra_one) {
        palabra_one_list.add(index)
        println(index)
    }
    for (index in palabra_two) {
        palabra_two_list.add(index)
        println(index)
    }
    palabra_one_list.sort()
    palabra_two_list.sort()
    if (palabra_one_list.equals(palabra_two_list)) {
        println("Son anagramas")
        return true

    }
    else {
        print("No son anagramas")
        return false
    }
}