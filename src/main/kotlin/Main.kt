fun main(args: Array<String>) {
    var cantidadHoras = 0
    tituloPrincipal()
    tituloCantidadDeHoras()
    cantidadHoras = readln().toInt()
    println("$cantidadHoras horas cambiado a minutos es ---> ${calcularTransformacionDeHorasAMinutos(cantidadHoras = cantidadHoras)} minutos")
    println("$cantidadHoras horas cambiado a segundos es ---> ${calcularTransformacionDeHorasASegundos(cantidadHoras = cantidadHoras)} segundos")
}