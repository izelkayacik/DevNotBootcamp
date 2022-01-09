package com.izelkayacik.nesnetabanliprogramlama.bolum1

fun main() {
    val bmw = Araba("Kırmızı", 0, false)

    //Okuma İşlemi
    //val r = bmw.renk

    bmw.bilgiAl()

    bmw.hiz = 10
    bmw.calisiyorMu = true

    bmw.bilgiAl()
    bmw.durdur()
    bmw.bilgiAl()
    bmw.calistir()
    bmw.bilgiAl()
    bmw.hizlan(100)
    bmw.bilgiAl()
    bmw.yavasla(50)
    bmw.bilgiAl()

    val sahin = Araba("Beyaz", 100, true)

    sahin.bilgiAl()
    sahin.durdur()
    sahin.bilgiAl()
    sahin.calistir()
    sahin.bilgiAl()
    sahin.hizlan(70)
    sahin.bilgiAl()
    sahin.yavasla(50)
    sahin.bilgiAl()

}