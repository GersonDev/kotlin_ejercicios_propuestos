fun main(args: Array<String>) {
    var costoDeJuego = 0
    var precioFinal = 0.0
    var descuento= 0.0
    tituloPrincipal()
    titulodeIngreseCosto()
    costoDeJuego = readln().toInt()

    if (costoDeJuego>100){
        precioFinal = calcularMontoFinal(costoDeJuego = costoDeJuego)
        descuento = calcularDescuento(costoDeJuego = costoDeJuego, precioFinal = precioFinal)
        println("El precio final es igual a $precioFinal")
        println("El descuento final es igual a $descuento")
    }
    println("El producto no cuenta con un descuento disponible")
    println("El precio sin descuento es $costoDeJuego")
}