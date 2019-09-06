package com.dicoding.surya.task8coroutines.latihan2

import kotlinx.coroutines.*

/**
 * Created by suryamudti on 06/09/2019.
 */

fun main() = runBlocking {
    val job = launch {
        delay(6000)
        val result = 100 * 100
        println("Result: $result")
    }

    job.cancel()

    println("Membatalkan Job...")

    if (job.isCancelled) {
        println("Job dibatalkan")
    }
}