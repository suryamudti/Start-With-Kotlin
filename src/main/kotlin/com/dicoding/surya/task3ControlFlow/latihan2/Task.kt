package com.dicoding.surya.task3ControlFlow.latihan2

/**
 * Created by suryamudti on 06/09/2019.
 */

fun main() {
    val range = 1.rangeTo(100) step 10

    for (i in range) {
        println("$i x 10 = ${i * 10}")
    }
}