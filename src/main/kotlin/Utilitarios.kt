fun tituloPrincipal() {
    println("Realizar un programa que te indique cuantos dias faltan para terminar el mes ingresando el dia,mes y año")
}

fun tituloDia() {
    println("Ingrese dia:")
}

fun tituloMes() {
    println("Ingrese mes:")
}

fun tituloAnio() {
    println("Ingrese año:")
}

fun calcularDiasFaltanDelMes(mes: Int, dia: Int, anio: Int) {
    when (mes) {
        1, 3, 5, 7, 8, 10, 12 -> println("Faltan ${31 - dia} dias para terminar el mes")
        2 -> when {
            anio % 4 == 0 && anio % 100 != 0 -> println("Faltan ${29 - dia} dias para terminar el mes")
            anio % 400 == 0 -> println("Faltan ${29 - dia} dias para terminar el mes")
            else -> println("Faltan ${28 - dia} dias para terminar el mes")
        }

        4, 6, 9, 12 -> println("Faltan ${31 - dia} dias para terminar el mes")
    }
}

