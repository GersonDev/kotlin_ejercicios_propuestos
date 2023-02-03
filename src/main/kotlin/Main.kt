fun main(args: Array<String>) {
    var primerNumero=0
    var segundoNumero=0
    var tercerNumero=0
    var cuartoNumero=0
    var nTermino =0
    tituloPrincipal()
    tituloPrimerNumero()
    primerNumero = readln().toInt()
    tituloSegundoNumero()
    segundoNumero = readln().toInt()
    titulotercerNumero()
    tercerNumero = readln().toInt()
    tituloCuartoNumero()
    cuartoNumero = readln().toInt()
    tituloNNumero()
    nTermino = readln().toInt()
    println("El termino $nTermino es igual a ${calcularRespuestaTotal(nTermino, segundoNumero, tercerNumero, cuartoNumero, primerNumero)}")
}