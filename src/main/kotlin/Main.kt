fun main(args: Array<String>) {
    var primerLado = 0
    var segundoLado = 0
    var tercerLado = 0
    tituloPrincipal()
    tituloPrimerLado()
    primerLado= readln().toInt()
    tituloSegundoLado()
    segundoLado = readln().toInt()
    tituloTercerLado()
    tercerLado = readln().toInt()
    calcularTipoDeTriangulo(primerLado = primerLado, segundoLado = segundoLado, tercerLado = tercerLado)
}