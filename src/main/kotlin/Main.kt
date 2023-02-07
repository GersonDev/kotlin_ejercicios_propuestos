fun main(args: Array<String>) {
    var primerGrado = 0
    var segundoGrado = 0
    var ceroGrado = 0
    tituloPrincipal()
    tituloSegundoGrado()
    segundoGrado = readln().toInt()
    tituloPrimerGrado()
    primerGrado= readln().toInt()
    tituloCeroGrado()
    ceroGrado = readln().toInt()

    println("Las raices son:")
    println("La raiz 1 es: ${calcularB1(primerGrado=primerGrado)}+v${calcularRaiz(primerGrado, segundoGrado, ceroGrado)}/${calcularA1(segundoGrado = segundoGrado)}")
    println("La raiz 2 es: ${calcularB1(primerGrado=primerGrado)}-v${calcularRaiz(primerGrado, segundoGrado, ceroGrado)}/${calcularA1(segundoGrado = segundoGrado)}")

}