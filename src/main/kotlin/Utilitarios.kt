fun tituloPrincipal() {
    println("Calcular e imprimir el salario quincenal de un empleado a partir de sis horas trabajadas y de su salario por hora")
}
fun  tituloHorasTrabajadas(){
    println("Ingrese sus Horas Trabajadas:")
}
fun tituloSalarioPorHora(){
    println("Ingrese su salario por hora:")
}
fun calcularSalarioQuincenal(cantidadHorasTrabajadas:Int,salarioPorHora:Double): Double {
    return  cantidadHorasTrabajadas*salarioPorHora
}