fun main(args: Array<String>) {
    tituloPrincipal()
    var dia = 0
    var mes = 0
    var anio = 0
    tituloDia()
    dia = readLine()!!.toInt()
    tituloMes()
    mes = readLine()!!.toInt()
    tituloAño()
    anio = readLine()!!.toInt()
    calcularDiasParaQueAcabeElAño(dia, mes, anio)
}