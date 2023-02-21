fun main(args: Array<String>) {
    var dia = 0
    var mes = 0
    var anio = 0
    tituloPrincipal()
    tituloDia()
    dia = readLine()!!.toInt()
    tituloMes()
    mes = readLine()!!.toInt()
    tituloAnio()
    anio = readLine()!!.toInt()
    calcularDiasFaltanDelMes(dia = dia, mes = mes, anio = anio)
}