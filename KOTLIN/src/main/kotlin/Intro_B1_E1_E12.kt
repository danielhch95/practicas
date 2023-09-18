fun ejercicios(){

    // Intro_B1_E1:
    val ladoCuadrado = 14
    val areaCuadrado = ladoCuadrado*ladoCuadrado
    println("El área del cuadrado de lado $ladoCuadrado es $areaCuadrado")
    println("\n\n")

    // Intro_B1_E2:
    var x =10
    var y = 20
    var z:Int
    println("ANTES: x vale $x e y vale $y")
    z = x
    x = y
    y = z
    println("DESPUES: x vale $x e y vale $y")

    println("\n\n")

    // Intro_B1_E3:
    val peso:Float = 80f
    val altura:Float = 1.80f
    val IMC: Float = peso/altura
    val Tabla_IMC:String = "TABLA IMC\n -----------\nDelgado: <18.5\nNormal: > 18.5 y 24.9 <\nSobrepeso: entre 25 y 29.9\nObeso: >= 30.0"
    print("peso: $peso\naltura: $altura\nIMC: $IMC\n\n$Tabla_IMC")
    println("\n\n")

// Intro_B1_E4:
    val segundos_iniciales: Int = 500000
    val segundos: Int = 500000%60
    val minutos: Int = (500000/60)%60
    val horas: Int = ((500000/60)/60)%24
    val dias: Int = (((500000/60)/60)/24)%365
    val años: Int = (((500000/60)/60)/24)/365
    print("Segundos: $segundos\nMinutos: $minutos\nHoras: $horas\nDias: $dias\nAños: $años")
    println("\n\n")

    // Intro_B1_E5:
    var x_e5:Int = 0
    while (x_e5 < 10){
        x_e5 += 1
    }
    print(x_e5)
    println("\n\n")

    // Intro_B1_E6:
    var x_e6 = 3
    val y_e6: Int
    y_e6 = x*2
    print("x: $x_e6 y: $y_e6")
    println("\n\n")

    // Intro_B1_E7:
    var x_e7 = true
    var y_e7 = true
    println("x\t\ty\t\tresultado\n---------------------\n$x_e7\t$y_e7\t${x_e7==y_e7}")

    y_e7 = false
    println("$x_e7\t$y_e7\t${x_e7==y_e7}")

    y_e7 = true
    x_e7 = false
    println("$x_e7\t$y_e7\t${x_e7==y_e7}")

    y_e7 = false
    print("$x_e7\t$y_e7\t${x_e7==y_e7}")
    println("\n")

    // Intro_B1_E8:
    print("Introduce la longitud del lado de un cuadrado: ")
    val lado_cuadrado: String = readln()
    val lado_cuadrado_int = lado_cuadrado.toInt()
    print("Para un cuadrado de lado ${lado_cuadrado_int} su área es ${lado_cuadrado_int*lado_cuadrado_int}")
    println("\n\n")

    // Intro_B1_E10:
    print("Mete dos números separados por espacio: ")
    val entrada = readln()
    val lista = entrada.split(" ")
    var x_e9 = lista[0]
    var y_e9 = lista[1]
    println("ANTES: x vale $x_e9 y vale $y_e9")
    var z_e9 = x_e9
    x_e9 = y_e9
    y_e9 = z_e9
    println("DESPUES: x vale $x_e9 y vale $y_e9")

    // Intro_B1_E11:
    print("Mete una palabra de 3 caracteres bro: ")
    val entrada_e10: String = readln()
    val cadena_final: String = entrada_e10[0].toString() + entrada_e10[2].toString() + entrada_e10[1].toString()
    print(cadena_final)
    println("\n\n")

    // Intro_B1_E12:
    println("Mete una frase con al menos 2 veces \'elefante\' y no contenga \'kotlin\'")
    var entrada_e11 = readln()
    entrada_e11 = entrada_e11.lowercase()

    var kotlin_sino= "\n La palabra \"kotlin\" no se encuentra en la frase"

    if (entrada_e11.indexOf("kotlin") >= 0){
        var kotlin_sino= "\nLa palabra \"kotlin\" está en la posición ${entrada_e11.indexOf("kotlin")}"
    }

    print("La primera \"e\" se encuentra en la posición: ${entrada_e11.indexOf("e")}\nLa palabra \"elefante\" se encuentra en la posición: ${entrada_e11.indexOf("elefante")}$kotlin_sino")
}