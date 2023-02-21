fun main(args: Array<String>) {
    var cantidadDetiempoEnMinutos = 0
    tituloPrincipal()
    ingreseTiempo()
    cantidadDetiempoEnMinutos = readLine()!!.toInt()
    convertirTiempo(cantidadDetiempoEnMinutos = cantidadDetiempoEnMinutos)

}