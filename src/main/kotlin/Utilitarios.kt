fun tituloPrincipal() {
    println("Dado un caracter determinar si es una vocal")
}

fun tituloIngreseCaracter() {
    println("Ingrese caracter a verificar:")
}

fun calcularSiEsUnaVocal(caracter: String) {
    /*    when(caracter){
            *//*"a","e","i","o","u"-> println("Es una vocal")
        else-> println("No es una vocal ")
    }*/
    if (caracter == "a" || caracter == "e" || caracter == "i" || caracter == "o" || caracter == "u"){
        println("Es una vocal")
    }else{
        println("No es una vocal ")
    }
}