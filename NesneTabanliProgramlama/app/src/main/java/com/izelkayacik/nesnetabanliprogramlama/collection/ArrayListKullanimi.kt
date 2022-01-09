package com.izelkayacik.nesnetabanliprogramlama.collection

fun main() {
    val sayilar = ArrayList<Int>()
    val meyveler = ArrayList<String>()

    //Veri Ekleme
    meyveler.add("Elma")//0.
    meyveler.add("Muz")//1.
    meyveler.add("Kiraz")//2.

    println(meyveler.toString())

    meyveler[1] = "Yeni Muz"
    println(meyveler.toString())

    meyveler.add(1, "Portakal")
    println(meyveler.toString())

    //Okuma İşlemi
    println(meyveler.get(2))
    println(meyveler[3])

    println("Boyut : ${meyveler.count()}")
    println("Boyut : ${meyveler.size}")
    println("Boş kontrol : ${meyveler.isEmpty()}")//Boş mu? içerisi dolu ise true
    println("İçeriyor mu : ${meyveler.contains("Kirazx")}")

    meyveler.reverse()
    println(meyveler.toString())

    meyveler.sort()
    println(meyveler.toString())

    for (meyve in meyveler){
        println("Sonuç 1 : $meyve")
    }

    for ((indeks,meyve) in meyveler.withIndex()){
        println("$indeks. -> $meyve")
    }

    meyveler.removeAt(2)
    println(meyveler)

    meyveler.clear()
    println(meyveler)
}