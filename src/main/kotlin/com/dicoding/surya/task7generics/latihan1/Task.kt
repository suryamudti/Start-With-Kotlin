package com.dicoding.surya.task7generics.latihan1


/**
 * Created by suryamudti on 06/09/2019.
 */

fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    println(stringResult)
    println(intResult)
}

fun <T> getResult (args: T): Int {
    return when (args) {
        is String -> args.length
        is Int -> args * 5
        else -> 0
    }
}