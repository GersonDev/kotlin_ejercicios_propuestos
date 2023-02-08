fun main(args: Array<String>) {
    var primerNumero=0
    var segundoNumero=0
    var tercerNumero=0
    tituloPrincipal()
    tituloPrimerNumero()
    primerNumero= readln().toInt()
    tituloSegundoNumero()
    segundoNumero = readln().toInt()
    tituloTercerNumero()
    tercerNumero = readln().toInt()
    calcularNumerosAscendenteYDescendente(primerNumero, segundoNumero, tercerNumero)
}