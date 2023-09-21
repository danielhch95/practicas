package ejercicios_DAM


typealias Lista_strings = List<String>

fun print_lista (lista: Lista_strings){
    for (palabra in lista) {
        println(palabra)
    }
}

fun hola_lista (){
    val names: Lista_strings = listOf("AAAAA", "BBBBB", "CCCCC")
    print_lista(names)
}