package com.izelkayacik.degiskenler

fun main() {
    val yas = 17
    val isim = "Mehmet"

    //Int
    if(yas >= 18){
        println("Reşitsiniz.")
    }else{
        println("Reşit değilsiniz.")
    }

    //String
    if (isim == "Ahmet"){
        println("Merhaba Ahmet")
    }else if (isim == "Mehmet"){
        println("Merhaba Mehmet")
    }else{
        println("Tanınmayan Kişi")
    }

    val ka = "admin"
    val s = 123456

    if(ka == "admin" && s == 12345){
        println("Hoşgeldiniz")
    }else{
        println("Hatalı Giriş")
    }

}