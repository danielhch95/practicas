package ejercicios_mouredev.hechos

/*
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?
 * Fecha publicación enunciado: 17/01/22
 * Fecha publicación resolución: 24/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
fun numero_primo() {
    var primos_sino: Boolean = true
    var lista_primos = mutableListOf<Int>()
    for (numero in 2..100) {
        for (divisor in 0..numero-1){
            if (divisor == 0 || divisor == 1){
                continue
            }
            else if (numero%divisor != 0){
                primos_sino = true
            }
            else {
                primos_sino = false
                break
            }
        }
        if (primos_sino == true) {
            lista_primos.add(numero)
        }

    }
    for (number in lista_primos){
        print("$number ")
    }
}