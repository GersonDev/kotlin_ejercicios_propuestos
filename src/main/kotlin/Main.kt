fun main(args: Array<String>) {
    var primerNumero = 0
    var segundoNumero = 0
    var opcionSeleccionada = 0
    tituloPrincipal()
    tituloMenuDeOpciones()
    tituloQueOpcionEscogera()
    opcionSeleccionada = readln()!!.toInt()
    tituloPrimerNumero()
    primerNumero = readln()!!.toInt()
    tituloSegundoNumero()
    segundoNumero = readLine()!!.toInt()
    calcularOperacion(primerNumero, segundoNumero, opcionSeleccionada)
}