package com.erbyte.androidmaster


fun main() {
    val firstNumber = 3f
    val secondNumber = 2f

    add(firstNumber, secondNumber)
    substract(firstNumber, secondNumber)
    multiply(firstNumber, secondNumber)
    divide(firstNumber, secondNumber)
}

// Calculator
fun add(firstNumber: Float = 0f, secondNumber: Float = 0f) {
    println(firstNumber + secondNumber)
}

fun addCool(firstNumber: Float, secondNumber: Float) = println(firstNumber + secondNumber)

fun substract(firstNumber: Float, secondNumber: Float) {
    println(firstNumber - secondNumber)
}

fun multiply(firstNumber: Float, secondNumber: Float) {
    println(firstNumber * secondNumber)
}

fun divide(firstNumber: Float, secondNumber: Float) {
    println(firstNumber / secondNumber)
}

fun showMyAge(currentAge: Int) {
    println("Tengo $currentAge")
}

/**
 * Variables numericas
 */
fun variablesNumericas() {
    // Int -2,147,483,648 to 2,147,483,647
    val intExample = 26 // Val cannot be reassigned
    var intExample2 = 26

    // Long -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    val longExample: Long = 26

    // Float 7 decimal digits
    val floatExample = 30.5f

    // Double 14 decimal digits
    val doubleExample = 30.5
}

/**
 * Variables alfanumericas
 */
fun variableAlfanumericas() {
    // Char 1 character
    val charExample = 'A'

    // String 1 or more characters
    val stringExample = "Hello World"
}

/**
 * Variables booleanas
 */
fun variablesBoolenas() {
    // Boolean true or false
    val booleanExample = true
}