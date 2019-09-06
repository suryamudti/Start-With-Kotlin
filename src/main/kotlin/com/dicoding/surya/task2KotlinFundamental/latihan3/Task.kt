package com.dicoding.surya.task2KotlinFundamental.latihan3


/**
 * Created by suryamudti on 06/09/2019.
 */

fun main() {
    val valueA = 65
    val valueB = 52
    val valueC = 78

    val result = calculate(valueA, valueB, valueC)

    println(result)
}

fun calculate(valueA: Int, valueB: Int, valueC: Int?): Any = generateResult(valueA + (valueB - (valueC ?: 100)))

fun generateResult(result: Int) = "Result is $result"