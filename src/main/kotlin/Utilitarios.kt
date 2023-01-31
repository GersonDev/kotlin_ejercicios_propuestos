fun tituloPrincipal(){
    println("Hallar el precio de venta final de un producto")
}
fun calcularIgv(precioProducto:Int,IGV:Int){
    IGV%precioProducto
}
fun calcularPrecioFinal(precioProducto: Int,IGV: Int){
    precioProducto-(IGV%precioProducto)
}

