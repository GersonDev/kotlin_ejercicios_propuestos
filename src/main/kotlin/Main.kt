fun main(args: Array<String>) {
    var primerNumero = 0
    tituloPrincipal()
    tituloPrimerNumero()
    primerNumero = readln().toInt()
    println(
        "La suma de los los cuadrados de los $primerNumero primeros numeros son --->>> ${
            calcularSumaDeCuadrados(
                primerNumero = primerNumero
            )
        }"
    )
}