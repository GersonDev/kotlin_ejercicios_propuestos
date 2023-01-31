fun main(args: Array<String>) {
    var radio = 0.0
    var PI= 3.1415
    tituloPrincipal()
    ingresarRadio()
    radio = readln().toDouble()
    println("El area del circulo es ${calcularArea(radio = radio, PI = PI )}")
}