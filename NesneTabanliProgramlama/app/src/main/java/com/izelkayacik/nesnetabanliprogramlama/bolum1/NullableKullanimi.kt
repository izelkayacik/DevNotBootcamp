package com.izelkayacik.nesnetabanliprogramlama.bolum1

fun main() {
    var str1:String? = null

    str1 = "  merhaba "

    //trim -> sağında ve solunda boşluk varsa temiz halde getiriyor.

    //Yöntem 1 :
    println("Sonuç 1 : ${str1?.trim()}")

    //Yöntem 2 :
    //println("Sonuç 2 : ${str1!!.trim()}")

    //Yöntem 3 *** : If ile Null kontrolu
    if (str1 != null){
        println("Sonuç 3 : ${str1.trim()}")
    }else{
        println("Sonuç nulldur")
    }

    //Yöntem 4 :
    str1?.let {
        println("Sonuç 4 : ${str1.trim()}")
    }
}