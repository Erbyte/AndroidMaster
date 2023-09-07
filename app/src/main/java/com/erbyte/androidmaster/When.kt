package com.erbyte.androidmaster

fun main() {
    println(getTrimester(11))
}

fun result(value: Any) {
    when (value) {
        is Int -> println("Es un entero")
        is String -> println("Es un String")
        is Char -> println("Es un caracter")
        is Boolean -> println("Es un booleano")
        else -> println("No se que es")
    }
}

fun getMonth(month: Int) {
    when (month) {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> {
            println("Noviembre")
            println("Noviembre")
        }

        12 -> println("Diciembre")
        else -> println("No existe ese mes")
    }
}

fun getTrimester(month: Int): String {
    return when (month) {
        1, 2, 3 -> "Primer trimestre"
        4, 5, 6 -> "Segundo trimestre"
        in 7..9 -> "Tercer trimestre"
        in 10..12 -> "Cuarto trimestre"
        else -> "No existe ese mes"
    }
}