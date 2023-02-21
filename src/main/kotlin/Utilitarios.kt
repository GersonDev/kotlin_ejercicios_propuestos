fun tituloAños() {
    println("Ingrese los años que lleva trabajando")
}

fun tituloMeses() {
    println("Ingrese los meses que lleva trabajando")
}

fun tituloTipoDeContrato() {
    println("Tipo de Contrato:")
    println("1:Full Time (48 horas)")
    println("1:Part Time (24 horas)")
}

fun calcularSueldoTotal(años: Int, meses: Int, tipoDeContrato: Int): Int {
    return when (tipoDeContrato) {
        1 -> (años * 48 * 12 * 30) + (meses * 48 * 30)
        else -> (años * 24 * 12 * 30) + (meses * 12 * 30)
    }
    val sueldoPagado =calcularSueldoTotal(años, meses, tipoDeContrato)

    val sueldoFinal = when(años){
        in 0..5->sueldoPagado*0.6
        in 6..10->sueldoPagado*0.8
        else->sueldoPagado
    }
    println("La cantidad a pagar sera de $sueldoFinal")
}
