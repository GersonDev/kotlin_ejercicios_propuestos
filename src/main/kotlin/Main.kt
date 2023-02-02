fun main(args: Array<String>) {
    var primerNumero = 0
    var segundoNumero = 0
    tituloPrincipal()
    tituloPrimerNumero()
    primerNumero = readln().toInt()
    tituloSegundoNumero()
    segundoNumero = readln().toInt()
    println("Los numero que hay entre el $primerNumero y el $segundoNumero son ->  ${calcularCantidadDeNumeros(primerNumero = primerNumero, segundoNumero = segundoNumero)}")
}