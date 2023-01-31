fun tituloPrincipal() {
    println("Hallar el area y perimetro de un triangulo")
}
fun tituloBase() {
    println("Ingrese la base:")
}
fun tituloAltura() {
    println("Ingrese la Altura:")
}
fun tituloLado() {
    println("Ingrese un lado:")
}
fun calcularPerimetro(lado:Int):Int{
    return  lado*lado*lado
}
fun calcularArea(base:Int,altura:Int):Int{
    return  (base*altura)/2
}