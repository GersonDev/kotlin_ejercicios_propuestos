fun tituloPrincipal() {
    println("Pedir una nota 0 a 10 y mostrarla de laforma:Desaprobado,Aprobado y Excelente")
}

fun tituloNota() {
    println("Ingrese nota:")
}

fun calcularEstadoDeNota(primerNota: Int) {
    //Forma mas corta con when
    val estado = when (primerNota) {
        in 0..3 -> "Desaprobado"
        in 4..7 -> "Aprobado"
        in 8..10 -> "Excelente"
        else -> "Respuesta incorrecta"
    }
    println("El estado del examen es $estado")


    //Forma con if y if else
    /* var estado = ""
     if (primerNota < 3) {
         estado = "Desaprobado"
     } else if (primerNota >= 4 && primerNota <= 7) {
         estado = "Aprobado"
     } else if (primerNota >= 8 && primerNota <= 10) {
         estado = "Excelente"
     } else {
         estado = "Respuesta erronea"
     }
     println("El estado del examen es $estado")*/
}