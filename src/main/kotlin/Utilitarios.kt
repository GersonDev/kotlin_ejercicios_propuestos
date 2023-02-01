fun tituloPrincipal(){
    println("Hallar el precio de venta final de un producto")
}
fun tituloPrecioProducto(){
    println("Ingrese precio de la venta del producto:")
}
fun calcularIgv(precioProducto:Int,IGV:Int):Int{
   return IGV%precioProducto
}
fun calcularPrecioFinal(precioProducto: Int,IGV: Int):Int{
   return precioProducto-calcularIgv(precioProducto,IGV)
}

