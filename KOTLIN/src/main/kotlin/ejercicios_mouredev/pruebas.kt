package ejercicios_mouredev

fun pruebas() {
    val listaColores = mutableListOf("Azul", "Rojo", "Verde")
    println(listaColores)
    listaColores.remove("Azul")
    listaColores.removeAt(1)
    listaColores.add(0, "Rosa")
    println(listaColores)
    println(listaColores.get(0))
    println(listaColores.indexOf("Rosa"))
    listaColores.add("Fucsia")
    listaColores.add("Blanco")
    listaColores.add("Negro")
    println(listaColores)

    val objetosguapos = mutableListOf<String>()
    objetosguapos.add("Sofá")
    print(objetosguapos)

    val str = "Había una vez unn circo que llenaba el mundo de ilusión"
    val delim = " "
    val listacirco = str.split(delim)
    print(listacirco)

    var listacreadaconrango = 0.rangeTo(6) // Crea lista desde el 0 al 6
    println (listacreadaconrango)
    var listacreadaconrango_2 = 1..6 // Crea lista desde el 0 al 6
    println (listacreadaconrango_2)
    var listacreadaconrango_3 = 1 until 6 // Crea lista desde el 0 al 5
    println (listacreadaconrango_3)
    println(3 in listacreadaconrango_3) // Devuelve true


}