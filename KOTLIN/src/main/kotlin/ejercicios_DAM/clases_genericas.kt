package ejercicios_DAM

fun clases_genericas () {
    class Box<T>(dato: T){
        var dato_clase = dato
    }
    // Varianza
}

interface Source<out T> {
    fun nexT():T
}

fun demo(strs: Source<Number>) {
    val objeto: Source<Any> = strs
    //val objeto_4: Source<Int> = strs //Esto da error ya que INT es una subclase de Number y solo se permite con out las superclases de Number
}


interface Source_2<in F> {
    fun nexF():Number
}
fun demo_2(strs_2: Source_2<Number>) {
    //val objeto_2: Source_2<Any> = strs_2 //Esto da error ya que Any es una superclase de Number y solo se permite con in las subclases de Number
    val objeto_3: Source_2<Int> = strs_2
}