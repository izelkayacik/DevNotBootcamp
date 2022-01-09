package com.izelkayacik.degiskenler

fun main() {
    val a = 10
    val b = 10
    val x = 40
    val y = 5


    println(a == b)
    println(a != b)
    println(a > b)
    println(a >= b)
    println(a < b)
    println(a <= b)

    //AND : VE : HEM SOL TARAF HEM DE SAĞ TARAF TRUE OLURSA ÇALIŞIR. AKSİ HALDE FALSE DÖNER
    println(a == b && x > y)

    //OR : VEYA : İKİSİNDEN BİRİNİN TRUE OLMASI YETERLİ.
    println(a == b || x > y)
}