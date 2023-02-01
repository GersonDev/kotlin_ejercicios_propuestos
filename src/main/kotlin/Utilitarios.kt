fun tituloPrincipal() {
    println("Dado 2 numeros enteros determinar cuantos numeros enteros estan incluidos entre ellos")
}

fun tituloPrimerNumero() {
    println("Ingrese primer numero:")
}

fun tituloSegundoNumero() {
    println("Ingrese segundo numero:")
}

fun calcularCantidadDeNumeros(primerNumero: Int, segundoNumero: Int):Int {
     if (primerNumero > segundoNumero) {
         return (primerNumero-segundoNumero)-1
    }else if(primerNumero < segundoNumero) {
         return (segundoNumero-primerNumero)-1
    }else{
         return error("Los numeros son iguales")
    }
}