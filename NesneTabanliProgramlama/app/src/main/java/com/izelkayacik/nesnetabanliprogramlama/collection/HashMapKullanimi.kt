package com.izelkayacik.nesnetabanliprogramlama.collection

fun main() {
    val iller = HashMap<Int, String>()
    iller.put(16, "BURSA")
    iller.put(34, "İSTANBUL")
    iller[6] = "ANKARA"

    println(iller.toString())

    println(iller.get(16))

    iller.put(16, "YENİ BURSA")
    println(iller.toString())

    println(iller.size)
    println(iller.isEmpty())

    for ((anahtar, deger) in iller){
        println("$anahtar -> $deger")
    }

    iller.remove(34)
    println(iller.toString())

    iller.clear()
    println(iller.toString())

}