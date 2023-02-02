fun tituloPrincipal() {
    println("Calcule la suma de  los cuadrados de los N primeros numeros naturales")
}

fun tituloPrimerNumero() {
    println("Ingrese el numero que desee calcular la suma de sus cuadrados:")
}

fun calcularSumaDeCuadrados(primerNumero: Int): Int {
    return (primerNumero * (primerNumero + 1)) * (2 * primerNumero + 1) / 6
}