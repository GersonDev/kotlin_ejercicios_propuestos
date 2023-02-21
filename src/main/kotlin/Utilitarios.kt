fun tituloPrincipal() {
    println("Realizar un programa que te indique cuanto tiempo ha pasado en horas y minutos ingresando los minutos transcurridos")
}

fun ingreseTiempo() {
    println("Ingrese tiempo en minutos:")
}
fun convertirTiempo(cantidadDetiempoEnMinutos: Int) {
    var hora = 0
    var minutos = 0

    if (cantidadDetiempoEnMinutos > 59) {
        when {
            cantidadDetiempoEnMinutos % 60 == 0 -> println("El tiempo es: ${mostrarHoras(cantidadDetiempoEnMinutos / 60)}")
            else -> {
                hora = cantidadDetiempoEnMinutos / 60
                minutos = cantidadDetiempoEnMinutos - (hora * 60)
                println("El tiempo es: ${mostrarHoras(hora)} y ${mostrarminutos(minutos)}")
            }
        }
    } else {
        println("El tiempo es: ${mostrarminutos(cantidadDetiempoEnMinutos)}")
    }
}

fun mostrarHoras(horas: Int): String {
    return if (horas > 1) {
        "$horas horas"
    } else {
        "1 hora"
    }
}

fun mostrarminutos(minutos: Int): String {
    return if (minutos > 1) {
        "$minutos minutos"
    } else {
        "1 minuto"
    }
}

