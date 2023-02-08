fun tituloPrincipal() {
    println("Ingresar un numero,en caso termine en cifra cero devolver la mitad en caso contrario el doble")
}

fun tituloIngresePrimerNumero() {
    println("Ingrese primerNumero:")
}

fun calcularCifraCero(primerNumero: Int): Any {
    var mitadPrimerNumero = 0
    var doblePrimerNumero = 0
    if (primerNumero % 10 == 0) {
        mitadPrimerNumero = primerNumero / 2
        return println("EL $primerNumero  termina en cero por lo tanto es$mitadPrimerNumero ")
    } else {
        doblePrimerNumero = primerNumero * 2
        return println("\"EL $primerNumero  no termina en cero por lo tanto es$doblePrimerNumero \"")
    }
}