fun main(args: Array<String>) {
    var precioProducto = 0
    var IGV = 18
    tituloPrincipal()
    tituloPrecioProducto()
    precioProducto = readln().toInt()
    println("El IGV del precio de $precioProducto es ->${calcularIgv(precioProducto =precioProducto, IGV = IGV)}")
    println("El Precio Final del producto es ->${calcularPrecioFinal(precioProducto =precioProducto, IGV = IGV)}")
}