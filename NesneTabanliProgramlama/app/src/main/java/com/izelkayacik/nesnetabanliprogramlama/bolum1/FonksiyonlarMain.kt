package com.izelkayacik.nesnetabanliprogramlama.bolum1

fun main() {

    val f = Fonksiyonlar()
    f.selamla()

    val gelenDeger = f.selamla1()
    println("Gelen Değer : $gelenDeger")

    f.selamla2("Mehmet")

    f.toplama()

    val gelenToplam = f.toplama1()
    println("Gelen toplam : $gelenToplam")

    val gelenSonuc = f.toplama2(100, 400)
    println("Gelen Sonuç : $gelenSonuc+1")
}