package ejercicios_DAM.bloques

fun calculo_radar(){
    val entrada = readln()
    val lista_entrada = entrada.split(" ")
    val distancia_metros = lista_entrada[0].toDouble()
    val kmh_maxima = lista_entrada[1].toDouble()
    val segundos_tardados = lista_entrada[2].toDouble()
    if (distancia_metros>0 && kmh_maxima>0 && segundos_tardados>0){
        val metros_x_segundo_max : Double = (kmh_maxima*1000)/(60*60).toDouble()
        val velocidad_vehiculo: Double = (distancia_metros/segundos_tardados)
        when {
            velocidad_vehiculo < metros_x_segundo_max -> print("OK")
            velocidad_vehiculo > metros_x_segundo_max && velocidad_vehiculo < metros_x_segundo_max*1.2 -> print("MULTA")
            velocidad_vehiculo > metros_x_segundo_max*1.2 -> print("PUNTOS")
        }
    }
    else {
        print("ERROR")
    }
}