package ejercicios_DAM

fun pruebas_errores (a:Int, b:Int) :Int {
    val resultado =
        try {
            a / b
        }
        catch (a: ArithmeticException) {
            0
        }
    return resultado
}
