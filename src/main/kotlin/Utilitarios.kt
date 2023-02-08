fun tituloPrincipal(){
    println("Hallar si un numero es PAR o IMPAR")
}
fun tituloIngresePrimerNumero(){
    println("Ingrese primer numero:")
}
fun calcularParOImPAR(primerNumero:Int):Unit{
    if (primerNumero%2==0){
        return println("El $primerNumero es un numero Par")
    }else{
        return println("El $primerNumero es un numero ImPar")
    }
}