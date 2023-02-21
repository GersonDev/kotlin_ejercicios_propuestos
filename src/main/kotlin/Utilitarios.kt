fun tituloPrincipal() {
    println("Hacer un programa que pase de gramos a otras unidades de masa,mostrar en pantalla un menu con los opciones posibles")
}

fun tituloDeIngreseGramos() {
    println("Ingrese Gramos:")
}

fun menuDeOpciones() {
    println("1.Convertir a Kilogramos.")
    println("2.Convertir a Libras.")
    println("3.Convertir a Onzas.")
    println("4.Convertir a Miligramos.")
}

fun tituloOpcionSeleccionada() {
    println("Ingrese opcion :")
}

fun calcularConversion(numeroDeGramos: Double, opcionSelecciponada: Int) {
//Usando el when
    when (opcionSelecciponada) {
        1 -> println(" $numeroDeGramos gramos equivale a ${numeroDeGramos / 1000} Kilogramos ")
        2 -> println(" $numeroDeGramos gramos equivale a ${numeroDeGramos / 453.592} Libras ")
        3 -> println(" $numeroDeGramos gramos equivale a ${numeroDeGramos / 28.3495} Onzas ")
        4 -> println(" $numeroDeGramos gramos equivale a ${numeroDeGramos * 1000} Miligramos ")
        else -> "Alternativa erronea"
    }
//Usando el if y else if
//    if(opcionSelecciponada == 1){
//        println(" $numeroDeGramos gramos equivale a ${numeroDeGramos / 1000} Kilogramos ")
//    }else if(opcionSelecciponada == 2){
//        println(" $numeroDeGramos gramos equivale a ${numeroDeGramos / 453.592} Libras ")
//    }else if (opcionSelecciponada ==3){
//        println(" $numeroDeGramos gramos equivale a ${numeroDeGramos / 28.3495} Onzas ")
//    }else if (opcionSelecciponada ==4){
//         println(" $numeroDeGramos gramos equivale a ${numeroDeGramos * 1000} Miligramos ")
//    }else{
//        "Alternativa erronea"
//    }
}
