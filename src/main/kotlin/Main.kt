fun main(args: Array<String>) {
    var numeroGramos = 0.0
    var opcionSeleccionada = 0
    tituloPrincipal()
    menuDeOpciones()
    tituloOpcionSeleccionada()
    opcionSeleccionada = readLine()!!.toInt()
    tituloDeIngreseGramos()
    numeroGramos = readLine()!!.toDouble()
    calcularConversion(opcionSelecciponada = opcionSeleccionada, numeroDeGramos = numeroGramos)
}