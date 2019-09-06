package com.dicoding.surya.task2KotlinFundamental.latihan2


/**
 * Created by suryamudti on 06/09/2019.
 */

fun main() {
    val resultMultiple = multiple(10, 10)
    val resultSum = sum(10, 10)

    println(resultMultiple)
    println(resultSum)
}

fun multiple(i: Int, i1: Int): Int = i * i1

fun sum(i: Int, i1: Int): Int = i + i1