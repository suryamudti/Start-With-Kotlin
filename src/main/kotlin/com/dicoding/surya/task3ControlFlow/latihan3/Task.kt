package com.dicoding.surya.task3ControlFlow.latihan3

/**
 * Created by suryamudti on 06/09/2019.
 */

fun main() {
    val listNumber = 1.rangeTo(30)

    for (number in listNumber) {
        if (number % 2 == 0)
            continue

        if (number > 10)
            break

        val result = ((2 + number) * number)
        println("result is $result")
    }
}