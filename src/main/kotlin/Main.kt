fun main(args: Array<String>) {
    var salarioPorHora = 0.0
    var cantidadHorasTrabajadas = 0
    tituloPrincipal()
    tituloSalarioPorHora()
    salarioPorHora = readln().toDouble()
    tituloHorasTrabajadas()
    cantidadHorasTrabajadas = readln().toInt()
    println(
        "El pago de su salario seria --> S/${
            calcularSalarioQuincenal(
                cantidadHorasTrabajadas = cantidadHorasTrabajadas,
                salarioPorHora = salarioPorHora
            )
        }"
    )
}