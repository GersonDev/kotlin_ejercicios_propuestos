fun tituloPrincipal() {
    println("Calcular si el aforo de un local es el permitido")
}

fun tituloCantidadPersonas() {
    println("Ingrese cantidad actual de personas:")
}

fun calcularEstadoDeAforo(cantidadPersonas: Int, aforo: Int) {
    val totalPersonas = aforo * 0.4
    //Usando el when
    when {
        totalPersonas > cantidadPersonas -> println("El aforo es aceptable")
        totalPersonas == cantidadPersonas.toDouble() -> println("El aforo esta a tope")
        totalPersonas < cantidadPersonas -> println("El aforo ha sido sobrepasado")
        else -> println("Vuelva a intentarlo")
    }


    //usando if y else if

//    if (totalPersonas > cantidadPersonas) {
//        println("El aforo es aceptable")
//    } else if (totalPersonas == cantidadPersonas.toDouble()) {
//        println("El aforo esta a tope")
//    } else if (totalPersonas < cantidadPersonas) {
//        println("El aforo ha sido sobrepasado")
//    } else {
//        println("Vuelva a intentarlo")
//    }
}
