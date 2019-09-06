package com.dicoding.surya.task6OOP.latihan1


/**
 * Created by suryamudti on 06/09/2019.
 */

class Cat(private val name: String) {
    var sleep: Boolean = false
        get() {
            println("Fungsi getter dipanggil")
            return field
        }
        set(value) {
            println("Fungsi setter dipanggil")
            field = value
        }

    fun toSleep() {
        if (sleep)
            println("$name, sleep!")
        else
            println("$name, let's play!")
    }
}

fun main() {
    val gippy = Cat("Gippy")

    gippy.toSleep()
    gippy.sleep = true
    gippy.toSleep()
}