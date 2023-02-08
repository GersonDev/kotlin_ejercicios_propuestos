fun tituloPrincipal() {
    println("Ingresar tres numeros y devolver los numeros ordenados en forma ascendente y en forma descendente")
}

fun tituloPrimerNumero() {
    println("Ingrese primer numero:")
}

fun tituloSegundoNumero() {
    println("Ingrese segundo numero:")
}

fun tituloTercerNumero() {
    println("Ingrese tercer numero:")
}

fun calcularNumerosAscendenteYDescendente(primerNumero: Int, segundoNumero: Int, tercerNumero: Int) {
    var mayor = 0
    var medio = 0
    var menor = 0
    if (primerNumero > segundoNumero && segundoNumero > tercerNumero) {
        mayor = primerNumero
        medio = segundoNumero
        menor = tercerNumero
    } else if (primerNumero > tercerNumero && tercerNumero > segundoNumero) {
        mayor = primerNumero
        medio = tercerNumero
        menor = segundoNumero
    } else if (segundoNumero > primerNumero && primerNumero > tercerNumero) {
        mayor = segundoNumero
        medio = primerNumero
        menor = tercerNumero
    } else if (segundoNumero > tercerNumero && tercerNumero > primerNumero) {
        mayor = segundoNumero
        medio = tercerNumero
        menor = primerNumero

    } else if (tercerNumero > primerNumero && primerNumero > segundoNumero) {
        mayor = tercerNumero
        medio = primerNumero
        menor = segundoNumero
    }else{
        mayor = tercerNumero
        medio = segundoNumero
        menor = primerNumero
    }
    println("ASCENDENTE: $tercerNumero $segundoNumero $primerNumero")
    println("DESCENDENTE: $primerNumero $segundoNumero $tercerNumero")
}