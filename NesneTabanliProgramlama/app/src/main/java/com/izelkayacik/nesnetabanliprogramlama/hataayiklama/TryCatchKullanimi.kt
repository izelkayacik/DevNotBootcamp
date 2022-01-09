package com.izelkayacik.nesnetabanliprogramlama.hataayiklama

import java.lang.ArithmeticException

fun main() {
    val x = 10
    val y = 2

    val dizi = Array<Int>(2){0}

    try {
        println("Sonuç : ${x / y}")
        println("İşlem Tamam")
        dizi[4] = 8
    }catch (e: Exception){
        if (e is ArithmeticException){
            println("İkinci sayı sıfır olamaz")
        }
        if (e is ArithmeticException){
            println("Dizinin boyutunu aştınız")
        }
    }
        /*
    }catch (e:ArithmeticException){
        println("İkinci sayı sıfır olamaz")
    }

    catch (e:ArrayIndexOutOfBoundsException){
        println("Dizinin boyutunu aştınız")
    }

         */
}