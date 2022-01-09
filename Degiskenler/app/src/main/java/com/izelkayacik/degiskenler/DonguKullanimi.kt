package com.izelkayacik.degiskenler

fun main() {
    for (i in 1..3){//1,2,3
        println("Döngü 1 : $i")
    }

    //10 ile 20 arasında çalışsın ve 5 er artsın
    for (a in 10..20 step 5){
        println("Döngü 2 : $a")
    }

    //20 den başlasın 10 a doğru geriye 5 er azalsın
    for (b in 20 downTo 10 step 5){
        println("Döngü 3 : $b")
    }

    var sayac = 1

    while (sayac < 6){
        println("Döngü 4 : $sayac")
        //sayac+=1//sayac = sayac + 1
        sayac++
    }

    //Break(Döngüyü Durdurma) - Continue(Pas Geçme)
    //Koşul oluşturmamız gerekir aksi halde döngünün çalışması için engeldir.

    for (i in 1..5){
        if (i == 3){
            break
        }
        println("Döngü 5 : $i")
    }

    for (i in 1..5){
        if (i == 3){
            continue
        }
        println("Döngü 6 : $i")
    }
}