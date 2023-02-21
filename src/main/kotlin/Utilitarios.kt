fun tituloPrincipal() {
    println("De una fecha determinar cuantos dias faltan para que acabe el año")
}

fun tituloDia() {
    println("Ingrese Dia:")
}

fun tituloMes() {
    println("Ingrese Mes:")
}

fun tituloAño() {
    println("Ingrese Año:")
}

fun calcularDiasParaQueAcabeElAño(dia: Int, mes: Int, anio: Int) {
    var diasRestantes: Int
    if (mes == 1) {
        diasRestantes = 334 + (31 - dia)
    } else if (mes == 2) {
        diasRestantes = 306 + (28 - dia)
    } else if (mes == 3) {
        diasRestantes = 275 + (31 - dia)
    } else if (mes == 4) {
        diasRestantes = 245 + (30 - dia)
    } else if (mes == 5) {
        diasRestantes = 214 + (31 - dia)
    } else if (mes == 6) {
        diasRestantes = 184 + (30 - dia)
    } else if (mes == 7) {
        diasRestantes = 153 + (31 - dia)
    } else if (mes == 8) {
        diasRestantes = 122 + (31 - dia)
    } else if (mes == 9) {
        diasRestantes = 90 + (30 - dia)
    } else if (mes == 10) {
        diasRestantes = 61 + (31 - dia)
    } else if (mes == 11) {
        diasRestantes = 31 + (30 - dia)
    } else {
        diasRestantes = 31 - dia
    }
    if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
        diasRestantes++
    }
    println("faltan $diasRestantes dias para terminar el año $anio")
}
    //    when (mes) {
//        1 -> diasRestantes = 334 + (31 - dia)
//        2 -> diasRestantes = 306 + (28 - dia)
//        3 -> diasRestantes = 275 + (31 - dia)
//        4 -> diasRestantes = 245 + (30 - dia)
//        5 -> diasRestantes = 214 + (31 - dia)
//        6 -> diasRestantes = 184 + (30 - dia)
//        7 -> diasRestantes = 122 + (31 - dia)
//        8 -> diasRestantes = 122 + (31 - dia)
//        9 -> diasRestantes = 90 + (30 - dia)
//        10 -> diasRestantes = 61 + (31 - dia)
//        11 -> diasRestantes = 31 + (30 - dia)
//        12 -> diasRestantes = 31 - dia
//    }






