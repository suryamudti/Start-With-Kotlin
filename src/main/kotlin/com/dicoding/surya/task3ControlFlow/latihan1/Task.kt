package com.dicoding.surya.task3ControlFlow.latihan1

/**
 * Created by suryamudti on 06/09/2019.
 */

fun main() {
    val value = 1
    val range = 1..100

    println("In Range : ${inRange(value, range)}")
}

fun inRange(value: Int, range: IntRange): Boolean {
    return when(value) {
        in range -> true
        !in range -> false
        else -> false
    }
}