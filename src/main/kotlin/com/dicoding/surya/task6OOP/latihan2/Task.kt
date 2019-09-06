package com.dicoding.surya.task6OOP.latihan2


/**
 * Created by suryamudti on 06/09/2019.
 */

open class Vehicle(val color: String, val wheel: Int, val maxSpeed: Int)

class Motorcycle : Vehicle("Blue", 2, 120)

class Car : Vehicle("Red", 4, 250)

fun main() {
    val car = Car()

    with(car) {
        println(color)
        println(wheel)
        println(maxSpeed)
    }

    val motor = Motorcycle()
    println()

    with(motor) {
        println(color)
        println(wheel)
        println(maxSpeed)
    }
}