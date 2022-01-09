package com.izelkayacik.degiskenler

fun main() {

    var ogrenciAdi = "Ahmet"
    var ogrenciYas = 23
    var ogrenciBoy = 1.98
    var ogrenciBasharf = 'A'
    var ogrenciDevamEdiyorMu = true

    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasharf)
    println(ogrenciDevamEdiyorMu)

    var urun_id:Int = 3416
    var urun_ad:String = "Kol saati"
    var urun_adet:Int = 100
    var urun_fiyat:Double = 149.99
    var urun_tedarikci:String = "rolex"

    println("Ürün id : $urun_id")
    println("Ürün ad : $urun_ad")
    println("Ürün adet : $urun_adet")
    println("Ürün fiyat : $urun_fiyat ₺")
    println("Ürün tedarikci : $urun_tedarikci")

    var a = 10
    var b = 20

    println("$a x $b : ${a*b}")

    //Sabitler
    var sayi = 30
    println(sayi)
    sayi = 100
    println(sayi)

    val numara = 90
    println(numara)

    //Tür Dönüşümü
    //Arayüzde sonuç almak istiyorsak String olmak zorundadır.

    //Sayısaldan Sayısala Dönüşüm
    val i = 42
    val d = 78.95

    val sonuc1 = i.toDouble()
    println(sonuc1)

    //78.95 -> 78'e dönüştüğü için sonuç /tehlikelidir/.
    val sonuc2 = d.toInt()
    println(sonuc2)

    //Sayısaldan metine dönüşüm(En Risksiz)
    val sonuc3 = i.toString()
    val sonuc4 = d.toString()
    println(sonuc3)
    println(sonuc4)


    //Metinden Sayısala Dönüşüm(Ne Riskli Ne Risksiz)
    val yazi = "67.54."

    //Double'a dönüştürmeye çalışacak sorun yaşıyorsa Null yapacak
    val sonuc5 = yazi.toDoubleOrNull()

    if (sonuc5 != null)
    {
        println(sonuc5)
    }else
    {
        print("Dönüşümde hata oluştu ve sayınızı kontrol ediniz.")
    }

}