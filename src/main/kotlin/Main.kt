fun main(args: Array<String>) {
    var numeros = 0
    var numerosPares = 0
    var numerosImpares = 0
    tituloPrincipal()
    tituloNumerosAngresar()
    numeros = readLine()!!.toInt()

    for (i in 1..numeros) {
        println("Ingrese el numero $i:")
        numeros = readLine()!!.toInt()
        if (numeros % 5 != 0) {
            if (numeros % 2 == 0) {
                numerosPares++
            } else {
                numerosImpares++
            }
        }
    }
    println("En total hay $numerosPares numeros pares y $numerosImpares numeros impares")
}