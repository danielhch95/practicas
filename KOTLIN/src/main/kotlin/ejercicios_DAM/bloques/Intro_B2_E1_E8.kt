package ejercicios_DAM.bloques


// Intro_B2_E1:
fun ejercicio_B2_1() {
    print("Mete un número: ")
    val x: Int = readln().toInt()
    if (x%2 == 0) {
        println("$x es par")
    }
    else {
        println("$x no es par")
    }
    print("\n")
}

// Intro_B2_E2:
fun ejercicio_B2_2() {
    print("Mete tu peso: ")
    val peso: Double = readln().toDouble()
    print("Mete tu altura: ")
    val altura: Double = readln().toDouble()
    val IMC: Double = peso / (altura * altura)
    val IMC_es: String = when {
        IMC < 18.5 -> "Delgado"
        IMC in 18.5..24.9 -> "Normal"
        IMC in (24.9-10e-10)..29.9 -> "Sobrepeso"
        else -> "Obeso"
    }
    println("Su IMC es $IMC por tanto su estado es: $IMC_es")
}

// Intro_B2_E3:
fun ejercicio_B2_3(){
    val num1: Int = readln().toInt()
    val num2: Int = readln().toInt()
    if (num1 % num2 == 0) {
        print("$num1 es multiplo de $num2")
    }
    else {
        print("$num1 NO es multiplo de $num2")
    }
}

// Intro_B2_E4:
fun ejercicio_B2_4(){
    val num1: Int = readln().toInt()
    val num2: Int = readln().toInt()
    val num3: Int = readln().toInt()
    if (num1.equals(num2) && num1.equals(num3)){
        println("Los tres son iguales")
    }
    else {
        val lista = mutableListOf(num1, num2, num3)
        lista.sort()
        val menor = lista[0]
        println("El menor: $menor")
    }
}

// Intro_B2_E5:
fun ejercicio_B2_5(){
    print("Comida diaria: ")
    val comida_diaria: Int = readln().toInt()
    print("Numero animales: ")
    val numero_animales: Int = readln().toInt()
    print("Kilos por animal: ")
    val kilos_x_animal: Double = readln().toDouble()
    val excedente: Double = comida_diaria - numero_animales*kilos_x_animal
    if (excedente > 0){
        println("Excedente = $excedente Kg")
    }
    else {
        val racion = comida_diaria/(kilos_x_animal*numero_animales)
        println("Racion = $racion Kg")
    }
}

// Intro_B2_E6:
fun ejercicio_B2_6(){
    val numero_mes: Int = readln().toInt()
    val nombre_mes: String = when (numero_mes) {
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abril"
        5 -> "Mayo"
        6 -> "Junio"
        7 -> "Julio"
        8 -> "Agosto"
        9 -> "Septiembre"
        10 -> "Octubre"
        11 -> "Noviembre"
        12 -> "Diciembre"
        else -> "Número erróneo"
    }
    println("El mes $numero_mes se llama $nombre_mes")
}

// Intro_B2_E7:
fun ejercicio_B2_7(){
    val nombre_mes: String = readln().toString()
    val numero_mes: Int = when (nombre_mes) {
        "Enero" -> 1
        "Febrero" ->2
        "Marzo" ->3
        "Abril" ->4
        "Mayo" ->5
        "Junio" ->6
        "Julio" ->7
        "Agosto" ->8
        "Septiembre" ->9
        "Octubre" -> 10
        "Noviembre" -> 11
        "Diciembre" -> 12
        else -> 404
    }
    println("El mes $nombre_mes es el mes número $numero_mes")
}

// Intro_B2_E8:
fun ejercicio_B2_8(){
    val calificacion_numero: Int = readln().toInt()
    val calificacion: String = when (calificacion_numero) {
        in 0 until 70 -> "D"
        in 70 until 80 -> "C"
        in 80 until 90 -> "B"
        in 90..100 -> "A"
        else -> "F"
    }
    println("La calificación es tipo $calificacion")
}