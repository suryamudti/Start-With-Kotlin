package com.dicoding.surya.task2KotlinFundamental.latihan1

/**
 * Created by suryamudti on 06/09/2019.
 */

fun main() {
    val now = 6
    val shopOpen = 7
    val shopClose = 17

    val shop = shopIsClose(now, shopOpen, shopClose)

    println("Shop is close : $shop")
}

fun shopIsClose(now: Int, shopOpen: Int, shopClose: Int) = now < shopOpen || now > shopClose
