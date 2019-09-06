package com.dicoding.surya.task4DataClass.latihan2

/**
 * Created by suryamudti on 06/09/2019.
 */

fun main() {
    val user = mapOf(
        "name" to "John",
        "age" to 23,
        "address" to "St. Petersburg"
    )

    val name = user.getValue("name")
    val age = user.getValue("age")
    val address = user.getValue("address")

    println(
        """User
            |Name: $name
            |Age: $age
            |Address: $address"""
            .trimMargin()
    )
}