package com.izelkayacik.nesnetabanliprogramlama.bolum1

class Araba(var renk:String, var hiz:Int, var calisiyorMu:Boolean) {

    init {
        println("Araba sınıfından nesne oluşturuldu")
    }


    fun calistir(){
        calisiyorMu = true
        hiz = 5
    }

    fun durdur(){
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(kacKm:Int){
        hiz+=kacKm //hiz = hiz + kacKm
    }

    fun yavasla(kacKm: Int){
        hiz-=kacKm //hiz = hiz - kacKm
    }

    fun bilgiAl(){
        println("***************")
        println("Renk        : ${renk}")
        println("Hız         : ${hiz}")
        println("Çalışıyor Mu: ${calisiyorMu}")
    }

    //this veya self -> bulunduğumuz sınıfı,
    //super -> kalıtım varsa üst sınıfı temsil eder

}