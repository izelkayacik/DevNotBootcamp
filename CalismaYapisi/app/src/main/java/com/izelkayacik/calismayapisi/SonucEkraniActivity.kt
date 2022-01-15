package com.izelkayacik.calismayapisi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.izelkayacik.calismayapisi.databinding.ActivitySonucEkraniBinding

class SonucEkraniActivity : AppCompatActivity() {

    private lateinit var tasarim:ActivitySonucEkraniBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivitySonucEkraniBinding.inflate(layoutInflater)
        setContentView(tasarim.root)
    }

    override fun onBackPressed() {
        //super.onBackPressed() //super -> geri dönüşü sağlıyor.

        Snackbar.make(tasarim.textView3, "Geri dönmek istiyor musunuz?", Snackbar.LENGTH_LONG)
            .setAction("Evet"){
                super.onBackPressed()
            }.show()
    }
}