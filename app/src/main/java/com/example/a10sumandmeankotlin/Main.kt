package com.example.a10sumandmeankotlin

// Crear una función main.
fun main() {

    // Tres variables numéricas con los valores 10, 33, 66.
    var num1 = 10
    val num2 = 33
    val num3 = 66

    // Declarar una variable que guardara la suma de las 3 variables.
    var sum = (num1 + num2 + num3)

    // Imprime la variable resultado.
    println("La suma es igual a $sum")

    // Modificar la variable con el valor 10, por el valor 55.
    num1 = 55

    // Como una de las variables cambia, la variable suma también cambiará.
    sum = (num1 + num2 + num3)

    // Imprimir nuevamente variable resultado.
    println("La suma es igual a $sum")

    // Declarar una variable promedio, que calcule el promedio de las 3 variables.
    val mean = (sum/3f)

    // Imprimir promedio.
    println("El promedio es igual a $mean")
}
