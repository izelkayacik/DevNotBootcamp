package com.izelkayacik.nesnetabanliprogramlama.collection

fun main() {
    val meyveler = HashSet<String>()

    meyveler.add("Elma")
    meyveler.add("Kiraz")
    meyveler.add("Muz")
    println(meyveler.toString())

    meyveler.add("Amasya Elması")
    println(meyveler.toString())

    println(meyveler.elementAt(1))
    println(meyveler.size)
    println(meyveler.isEmpty())

    for (m in meyveler){
        println("Sonuç: $m")
    }

    meyveler.remove("Elma")
    println(meyveler.toString())

    meyveler.clear()
    println(meyveler.toString())
}