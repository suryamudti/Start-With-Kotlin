package com.dicoding.surya.task5Functional.latihan3


/**
 * Created by suryamudti on 06/09/2019.
 */

fun main() {
    val text = formatText("Kotlin is Awesome")

    val lowerCase = text["lowerCase"]
    val upperCase = text["upperCase"]

    println(lowerCase)
    println(upperCase)

}

fun formatText(text: String) = with(text){
    mapOf(
        "lowerCase" to this.toLowerCase(),
        "upperCase" to this.toUpperCase()
    )
}