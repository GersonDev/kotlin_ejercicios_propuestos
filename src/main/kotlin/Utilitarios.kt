fun tituloPrincipal(){
    println("Calcular las raices de una ecuacion de segundo grado")
}
fun tituloPrimerGrado(){
    println("Ingrese el coeficiente de primer grado")
}
fun tituloSegundoGrado(){
    println("Ingrese el coeficiente de segundo grado")
}
fun tituloCeroGrado(){
    println("Ingrese el coeficiente de primer grado")
}
fun calcularRaiz(primerGrado:Int,segundoGrado:Int,ceroGrado:Int):Int{
return (segundoGrado*segundoGrado)-4*(primerGrado*ceroGrado)
}
fun calcularB1(primerGrado:Int): Int {
    return primerGrado*(-1)
}
fun calcularA1(segundoGrado:Int):Int{
   return 2*segundoGrado
}
