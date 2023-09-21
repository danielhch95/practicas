package ejercicios_DAM

fun ejercicios_B2 () {

    // Intro_B2_E1:
    print("Mete un número: ")
    val x: Int = readln().toInt()
    if (x%2 == 0) {
        println("$x es par")
    }
    else {
        println("$x no es par")
    }
    print("\n")

    // Intro_B2_E2:
    print("Mete tu peso: ")
    val peso: Float = readln().toFloat()
    print("Mete tu peso: ")
    val altura: Float = readln().toFloat()
    val IMC: Float = peso/(altura*altura)
    var IMC_es = "Obeso"
    if (IMC < 18.5) {
        IMC_es = "Delgado"
    }
    else if (IMC >= 18.5 && IMC <= 24.9) {
        IMC_es = "Normal"
    }
    else if (IMC > 24.9 && IMC <= 29.9) {
        IMC_es = "Sobrepeso"
    }
    print("Su IMC es $IMC por tanto su estado es: $IMC_es")

    // Intro_B2_E3:


    // Intro_B2_E4:

    // Intro_B2_E5:

    // Intro_B2_E6:

    // Intro_B2_E7:

    // Intro_B2_E8:

}