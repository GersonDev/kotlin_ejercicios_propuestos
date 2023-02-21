fun main(args: Array<String>) {
    var aforo = 200
    var cantidadDePersonas = 0
    tituloPrincipal()
    tituloCantidadPersonas()
    cantidadDePersonas = readLine()!!.toInt()
    calcularEstadoDeAforo(cantidadPersonas = cantidadDePersonas, aforo = aforo)
}