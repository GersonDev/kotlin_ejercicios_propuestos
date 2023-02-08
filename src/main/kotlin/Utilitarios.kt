fun tituloPrincipal() {
    println("Dado 3 longitudes que conforman los lados de un triangulo,devolver el tipo de triangulo de acuerdo a sus lados")
}

fun tituloPrimerLado() {
    println("Ingrese primer lado:")
}

fun tituloSegundoLado() {
    println("Ingrese segundo lado:")
}

fun tituloTercerLado() {
    println("Ingrese tercer lado:")
}

fun calcularTipoDeTriangulo(primerLado: Int, segundoLado: Int, tercerLado: Int) {
    if (primerLado == segundoLado && segundoLado == tercerLado) {
        println("El triangulo es equilatero")
    } else if (primerLado == segundoLado && segundoLado != tercerLado) {
        println("El triangulo es isoceles")
    } else if (primerLado == tercerLado && tercerLado != segundoLado) {
        println("El triangulo es isoceles")
    } else if (segundoLado == tercerLado && tercerLado != primerLado) {
        println("El triangulo es isoceles")
    } else {
        println("El triangulo es escaleno(Ni un lado igual)")
    }
}