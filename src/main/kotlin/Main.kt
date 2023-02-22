fun main(args: Array<String>) {
    var numero = 5
    var contador = 0
    tituloPrincipal()
    while (numero != 0){
        println("Ingrese un numero:")
        numero = readLine()!!.toInt()
        if(numero !=0){
            contador = contador+1
        }
    }
    println("Resultado esperado es: $contador")
}