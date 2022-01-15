package com.izelkayacik.calismayapisi

import java.io.Serializable

data class Kisiler(var ad:String,
                   var yas:Int,
                   var boy:Double,
                   var bekar:Boolean) : Serializable{
                       //interface -> genellikle 'able'
}