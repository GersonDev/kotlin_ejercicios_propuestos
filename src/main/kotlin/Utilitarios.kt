fun tituloPrincipal(){
    println("Dada una cantidad en horas obtener su equivalente en minutos segundos")
}
fun tituloCantidadDeHoras(){
    println("Ingrese cantidad de Horas:")
}
fun calcularTransformacionDeHorasASegundos(cantidadHoras:Int):Int{
    return cantidadHoras*3600
}
fun calcularTransformacionDeHorasAMinutos(cantidadHoras:Int): Int {
    return cantidadHoras*60
}