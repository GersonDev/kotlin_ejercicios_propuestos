fun main(args: Array<String>) {
    var años = 0
    var meses = 0
    var tipoDeContrato = 0
    tituloAños()
    años= readLine()!!.toInt()
    tituloMeses()
    meses = readLine()!!.toInt()
    tituloTipoDeContrato()
    tipoDeContrato = readLine()!!.toInt()
    println("${calcularSueldoTotal(años, meses, tipoDeContrato)}")
}