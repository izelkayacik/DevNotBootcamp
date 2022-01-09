package com.izelkayacik.nesnetabanliprogramlama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var str1:String = "merhaba"
    var str2:String? = null

    lateinit var str3:String

    var sayi:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}