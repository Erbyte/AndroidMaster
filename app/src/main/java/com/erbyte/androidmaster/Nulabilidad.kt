package com.erbyte.androidmaster

fun main() {
    val name:String? = null

    // !! Indica que nunca sera null
    println(name!!.get(2))

    // ? Indica que puede ser null
    println(name?.get(2))

    // ?: Indica que si es null, se le asigna un valor
    println(name?.get(2) ?: "No hay valor")
}