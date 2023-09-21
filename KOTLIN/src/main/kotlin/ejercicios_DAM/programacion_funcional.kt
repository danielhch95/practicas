package ejercicios_DAM

//Alcance de las funciones
//Igual que en un lenguaje tradicional hablamos del alcance “scope” de una variable, también las funciones tienen un alcance.
//
//Si clasificamos las funciones por alcance tenemos los siguientes tipos de funciones.
//
//funciones top-level. Si lo deseamos en kotlin podemos declarar una función el nivel superior de archivo,
// lo que significa que no se necesita crear una clase para contener una función como en java o c#
//
//funciones locales. Una función puede definirse dentro de una función y pasa a ser una función interna que llamamos local
//
//funciones miembro. El alcance de la función está ligado a un objeto, similar a un método java.
//
//funciones de extensión. El alcance es similar a las funciones miembro. Estuvimos utilizando constantemente funciones top-level
// y también escribimos funciones miembreo al ver contenidos de programación orientada objetos en Kotlin. Veremos a
// continuación ejemplos de funciones locales y de extensión.
fun sumar(a: Int, b: Int): Int {
    return a + b
}
// val resultado1 = sumar(2, 3)
//print(resultado1)
//val resultado2 = sumar(b = 3, a = 2) // usando nombres puedo cambiar orden
//print(resultado2)

fun suma(vararg numeros: Int): Int {
    var resultado = 0
    for (numero in numeros) {
        resultado += numero
    }
    return resultado
}
// Le puedo pasar varios parámetros con "varargs" antes de la variable a introducir en la función.
//println(suma(1, 2, 3, 4))
//println(suma(5, 10, 15))

// FUNCIONES GENÉRICAS

fun <T> imprimirValor(valor: T) {
    println("El valor es: $valor")
}
////observa como puedo invocar a la función con argumentos de distinto tipo
//imprimirValor(42)
//imprimirValor("hola")
//imprimirValor(true)


//Las funciones infix solo pueden tener un parámetro.
class Persona(val nombre: String) {
    infix fun esTocayoDe(persona:Persona): Boolean {
        return this.nombre == persona.nombre
    }
}

//val x = Persona("Juan")
//val y = Persona("Pedro")
//println(x.esTocayoDe(y))
//println(x esTocayoDe y) //uso innix