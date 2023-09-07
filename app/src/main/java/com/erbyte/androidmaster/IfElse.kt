package com.erbyte.androidmaster

fun main() {
    basicIf(26)
}

fun basicIf(age:Int = 18) {
    val isAdult = age >= 18

    if (isAdult) {
        println("Soy mayor de edad")
    } else {
        println("Soy menor de edad")
    }
}