package com.dicoding.surya.task5Functional.latihan2

/**
 * Created by suryamudti on 06/09/2019.
 */

fun main() {
    val result = multiply(300, 300)

    println(result)
}

val multiply:  (Int, Int) -> Int = { value1, value2 -> value1 * value2 }