package com.izelkayacik.nesnetabanliprogramlama.bolum1

class Fonksiyonlar {

    //Geri dönüş değeri olan, olmayan || return olan, olmayan

    //void
    fun selamla(){
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }

    //return
    fun selamla1() : String{
        val sonuc = "Merhaba Ahmet"
        return sonuc
    }

    //parametreli
    fun selamla2(isim:String){
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    fun toplama(){
        val toplam = 10 + 20
        println("Toplam : $toplam")
    }

    fun toplama1() : Int {
        val toplam = 18 + 20
        return toplam
    }

    fun toplama2(sayi1:Int, sayi2: Int):Int{
        val toplam = sayi1 + sayi2
        return toplam
    }
}