package ejercicios_DAM.bloques

// Intro_B3_E1
fun Intro_B3_E1(){
    var lista = mutableListOf<Int>()
    print("Con for: ")
    for (i in 0..10){
        print("$i ")
    }
    println()
    print("Con while: ")
    var i: Int = 0
    while (i < 11) {
        print("$i ")
        i += 1
    }
    println()
    print("Con do while: ")
    i = 0
    do {
        print("$i ")
        i += 1
    } while (i < 11)
}

// Intro_B3_E2
fun Intro_B3_E2(){
 for (i in 0..10)
     if (i % 2 == 0){
         print("$i ")
     }
}

// Intro_B3_E3
fun Intro_B3_E3(){
    val lista = mutableListOf<Int>()
    for (i in 0..50)
        if (i % 2 == 0){
            lista.add(i)
        }
    for (index in lista.reversed()) {
        print("$index ")
    }
}

// Intro_B3_E4
fun Intro_B3_E4(){
    var valor: Int = 1
    while (valor <= 1024) {
        print("$valor ")
        valor *= 2
    }
}

// Intro_B3_E5
fun Intro_B3_E5(){
    var x: Int = 1
    var y: Int = 1
    while (x in 1..3){
        while (y in 1..3) {
            print("$x$y")
            x += 1
            y += 1
        }
    }
}

// Intro_B3_E6
fun Intro_B3_E6(){
    for (multiplo in 1..9){
        println("Tabla de multiplicar del $multiplo\n---------------------------")
        for (i in 1..9){
            println("$i * $multiplo = ${i*multiplo}")
        }
    }
}