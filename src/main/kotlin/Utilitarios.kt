fun tituloPrincipal(){
    println("Determinar si un numero es multiplo de 3 y 5")
}
fun tituloPrimerNumero() {
    println("Ingrese primer numero:")
}
fun calcularSiEsMultiploDe3y5(primerNumero:Int):Any{
     if (primerNumero%3 == 0 && primerNumero%5==0){
         return println("El $primerNumero si es multiplo de 3 y 5")
     }else{
         return  println("El $primerNumero no es multiplo de 3 y 5")
     }
}