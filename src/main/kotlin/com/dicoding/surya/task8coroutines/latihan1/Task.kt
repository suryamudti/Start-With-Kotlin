package com.dicoding.surya.task8coroutines.latihan1
import kotlinx.coroutines.*

/**
 * Created by suryamudti on 06/09/2019.
 */


suspend fun sum(valueA: Int, valueB: Int): Int {
    delay(3000L)
    return valueA + valueB
}

suspend fun multiple(valueA: Int, valueB: Int): Int {
    delay(2000L)
    return valueA * valueB
}

fun main() = runBlocking {
    println("Counting...")

    val resultSum = async { sum(10, 10) }
    val resultMultiple = async { multiple(20, 20) }

    println("Result sum: ${resultSum.await()}")
    println("Result multiple: ${resultMultiple.await()}")
}