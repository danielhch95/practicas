package ejercicios_DAM.bloques

import java.time.LocalDate

fun main(){
    //formato fechas "dd/mm/aaaa"
    var edad = calcularEdad("24/09/1968", "25/09/2023")  // calcularEdad(fechaNacimiento, fechaActual)
    println("Tu edad es: $edad años, ${esMayorDeEdad(edad)}")
    edad = calcularEdad("24/09/1968", "24/09/2023")
    println("Tu edad es: $edad años, ${esMayorDeEdad(edad)}")
    edad = calcularEdad("24/09/1968", "23/09/2023")
    println("Tu edad es: $edad años, ${esMayorDeEdad(edad)}")
    edad = calcularEdad("24/09/2020", "24/09/2023")
    println("Tu edad es: $edad años, ${esMayorDeEdad(edad)}")
}

fun calcularEdad(fechaNacimiento : String, fechaActual : String) : Int{
    val lista_fecha_nac = fechaNacimiento.split("/")
    val lista_fecha_act = fechaActual.split("/")
    val fecha_nac : LocalDate = LocalDate.of(lista_fecha_nac[2].toInt(), lista_fecha_nac[1].toInt(), lista_fecha_nac[0].toInt())
    val fecha_act : LocalDate = LocalDate.of(lista_fecha_act[2].toInt(), lista_fecha_act[1].toInt(), lista_fecha_act[0].toInt())
    val edad = when {
        (fecha_act.month > fecha_nac.month) -> fecha_act.year.toInt() - fecha_nac.year.toInt()
        (fecha_act.month == fecha_nac.month) && (fecha_act.dayOfMonth > fecha_nac.dayOfMonth) -> fecha_act.year.toInt() - fecha_nac.year.toInt()
        (fecha_act.month == fecha_nac.month) && (fecha_act.dayOfMonth <= fecha_nac.dayOfMonth) -> fecha_act.year.toInt() - fecha_nac.year.toInt() - 1
        else -> fecha_act.year.toInt() - fecha_nac.year.toInt() - 1
    }
    return edad
}

fun esMayorDeEdad(edad : Int) : String{
    if (edad > 18){
        return "eres mayor de edad"
    } else {return "eres menor de edad"}
}