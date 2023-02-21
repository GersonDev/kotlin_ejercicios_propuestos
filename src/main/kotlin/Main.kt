fun main(args: Array<String>) {
    var primerNota = 0
    tituloPrincipal()
    tituloNota()
    primerNota = readLine()!!.toInt()
    calcularEstadoDeNota(primerNota = primerNota)
}