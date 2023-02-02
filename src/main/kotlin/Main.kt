fun main(args: Array<String>) {
    var primerNumero: Int = 0
    tituloPrincipal()
    tituloPrimerNumero()
    primerNumero= readln().toInt()
    println("El numero $primerNumero invertido es  -->> ${calcularTercerDigito(primerNumero =primerNumero)}${calcularSegundoDigito(primerNumero =primerNumero)}${calcularPrimerDigito(primerNumero = primerNumero)}")
}