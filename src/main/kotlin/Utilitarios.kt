fun tituloPrincipal() {
    println("Es Steam se hace un 50% de descuento a las personas cuya compra sea mayor a 100$.Indicar el monto descontado y el descuento")
}
fun  titulodeIngreseCosto() {
    println("Ingrese el costo del juego:")
}
fun calcularMontoFinal(costoDeJuego:Int):Double{
return   costoDeJuego*0.5
}
fun calcularDescuento(costoDeJuego: Int,precioFinal:Double):Double{
    return  costoDeJuego- precioFinal
}

