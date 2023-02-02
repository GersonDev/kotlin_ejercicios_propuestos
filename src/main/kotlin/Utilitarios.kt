fun tituloPrincipal(){
    println("Hallar el termino de la sucesion de segundo grado")
}
fun tituloPrimerNumero(){
    println("Ingrese primer Numero:")
}
fun tituloSegundoNumero(){
    println("Ingrese segundo Numero:")
}
fun titulotercerNumero(){
    println("Ingrese tercer Numero:")
}
fun tituloCuartoNumero(){
    println("Ingrese cuarto Numero:")
}
fun tituloNNumero(){
    println("Ingresar que termino desea hallar?:")
}
fun calcularLaPrimeraRazon(segundoNumero:Int,tercerNumero:Int,cuartoNumero:Int):Int{
    return (cuartoNumero-tercerNumero)-(tercerNumero-segundoNumero)
}
fun calcularLaSegundaRazon(primerNumero:Int,segundoNumero:Int,tercerNumero:Int,cuartoNumero:Int):Int{
    return (segundoNumero-primerNumero)-calcularLaPrimeraRazon(segundoNumero, tercerNumero , cuartoNumero )
}
fun calcularTermino0(primerNumero:Int,segundoNumero:Int,tercerNumero:Int,cuartoNumero:Int):Int{
    return primerNumero - calcularLaSegundaRazon(primerNumero,segundoNumero,tercerNumero,cuartoNumero)
}