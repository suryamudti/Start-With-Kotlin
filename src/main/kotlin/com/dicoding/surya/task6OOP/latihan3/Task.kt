package com.dicoding.surya.task6OOP.latihan3


/**
 * Created by suryamudti on 06/09/2019.
 */

fun main() {
    val resultA = sum(10.9, 19.1)
    val resultB = sum(19, 28)
    val resultC = sum("27", "19")

    println(resultA)
    println(resultB)
    println(resultC)
}

fun sum(valueA: Double, valueB: Double) = valueA + valueB
fun sum(valueA: Int, valueB: Int) = valueA + valueB
fun sum(valueA: String, valueB: String) = valueA.toInt() + valueB.toInt()

