fun main(args: Array<String>) {
    val tituloPrincipal = ""
    val tituloBase = ""
    val tituloAltura = ""
    val tituloLado = ""
    var base = 0
    var altura = 0
    var lado = 0

    tituloPrincipal()
    tituloBase()
    base = readln().toInt()
    tituloAltura()
    altura = readln().toInt()
    tituloLado()
    lado = readln().toInt()
    println("El Area es ${calcularArea(base = base,altura=altura)}")
    println("El Perimetro es ${calcularPerimetro(lado=lado)}")
}