package com.izelkayacik.nesnetabanliprogramlama.interfacex

class ClassA : Interface1 {
    override val degisken: Int = 10

    override fun metod1() {
        println("Metod1 çalıştı")
    }

    override fun metod2(): String {
        return "Metod2 çalıştı"
    }
}