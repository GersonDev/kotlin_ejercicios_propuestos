fun main(args: Array<String>) {
    var numeros: Int
    var suma: Int = 0
    tituloPrincipal()
    for (i in 1..10) {
        println("Ingrese el nuero $i:")
        numeros = readln()!!.toInt()
        suma = suma + numeros
    }
    println("la suma es:$suma")
}