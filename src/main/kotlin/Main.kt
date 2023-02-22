fun main(args: Array<String>) {
    var primerNumero = 0
    tituloPrincipal()
    tituloIngreseNumero()
    primerNumero = readLine()!!.toInt()
    for (i in  primerNumero-1 downTo  1){
        primerNumero *= i
    }
    println("Su factorial es -> $primerNumero")
}