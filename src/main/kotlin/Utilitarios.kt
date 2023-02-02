fun tituloPrincipal() {
    println("Invertir un numero de 3 cifras")
}

fun tituloPrimerNumero() {
    println("Ingrese numero de 3 cifras:")
}

fun calcularPrimerDigito(primerNumero: Int):Int {
   return  primerNumero / 100
//    val b = (primerNumero % 100) / 10
//    val c = primerNumero % 10
//    return println("$a$b$c")

}

fun calcularSegundoDigito(primerNumero: Int): Int {
    return (primerNumero % 100) / 10
}

fun calcularTercerDigito(primerNumero: Int): Int {
    return primerNumero % 10
}