fun tituloPrincipal() {
    println("Realizar un programa que registre dos numeros, y con ayuda de un menu,mostrar la respjuesta de acuerdo a la operacion basica seleccionada(SUMA,RESTA,MULTIPLICACION,DIVISION)")
}

fun tituloMenuDeOpciones() {
    println("1.Suma")
    println("2.Resta")
    println("3.Multiplicacion")
    println("4.Division")
}
fun tituloQueOpcionEscogera(){
    println("Que opcion desea seleccionar:")
}
fun tituloPrimerNumero(){
    println("Dame el primer numero")
}
fun tituloSegundoNumero(){
    println("Dame el segundo numero")
}
fun calcularOperacion(primerNumero: Int, segundoNumero: Int, opcionSeleccionada: Int) {
    val respuesta = when (opcionSeleccionada) {
        1 -> println("La suma es ${primerNumero + segundoNumero}")
        2 -> println("La resta es ${primerNumero - segundoNumero}")
        3 -> println("La multiplicacion es ${primerNumero * segundoNumero}")
        4 -> println("La division es ${primerNumero / segundoNumero}")
        else -> println("Vuelva a intentarlo")
    }

    //usando if y else if
//    if (opcionSeleccionada ==1){
//        println("La suma es ${primerNumero + segundoNumero}")
//    }else if (opcionSeleccionada ==2){
//        ("La resta es ${primerNumero - segundoNumero}")
//    }else if (opcionSeleccionada ==3){
//        println("La multiplicacion es ${primerNumero * segundoNumero}")
//    }else if (opcionSeleccionada ==4){
//        println("La division es ${primerNumero / segundoNumero}")
//    }else{
//        println("Vuelva a intentarlo")
//    }
}