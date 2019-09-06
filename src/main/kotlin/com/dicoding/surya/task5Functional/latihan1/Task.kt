package com.dicoding.surya.task5Functional.latihan1

/**
 * Created by suryamudti on 06/09/2019.
 */

fun main() {
    val text = "Kotlin".getFirstAndLast()

    val firstChar = text["first"]
    val lastChar = text["last"]

    println(firstChar)
    println(lastChar)

}

fun String.getFirstAndLast() = mapOf(
    "first" to this.first(),
    "last" to this.last()
)