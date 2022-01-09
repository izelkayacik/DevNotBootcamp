package com.izelkayacik.nesnetabanliprogramlama.bolum1

fun main() {
    ucretHesapla(100, KonserveBoyut.ORTA)
}

fun ucretHesapla(adet: Int, boyut: KonserveBoyut){
    when(boyut){
        KonserveBoyut.KUCUK ->
            println("Toplam maliyet : ${30 * adet} ₺")
        KonserveBoyut.ORTA ->
            println("Toplam maliyet : ${80 * adet} ₺")
        KonserveBoyut.BUYUK ->
            println("Toplam maliyet : ${140 * adet} ₺")
    }
}