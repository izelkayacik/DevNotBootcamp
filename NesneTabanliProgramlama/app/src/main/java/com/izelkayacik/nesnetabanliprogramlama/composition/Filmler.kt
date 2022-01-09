package com.izelkayacik.nesnetabanliprogramlama.composition


data class Filmler(var film_id:Int,
                   val film_ad:String,
                   var film_yil:Int,
                   var kategori:Kategoriler, //ForeignKey(Composition)
                   var yonetmen: Yonetmenler){
}