package com.izelkayacik.calismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import com.izelkayacik.calismayapisi.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var tasarim:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        Log.e("Yaşam Döngüsü", "onCreate çalıştı")

        tasarim.buttonBasla.setOnClickListener {
            val intent = Intent(this@MainActivity, OyunEkraniActivity::class.java)
            intent.putExtra("ad", "Ahmet")
            intent.putExtra("yas", 23)
            intent.putExtra("boy", 1.78)
            intent.putExtra("bekar", true)

            val kisi = Kisiler("Mehmet", 34, 1.70, false)
            intent.putExtra("nesne", kisi)

            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.e("Yaşam Döngüsü", "onStart çalıştı")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Yaşam Döngüsü", "onResume çalıştı")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Yaşam Döngüsü", "onPause çalıştı")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Yaşam Döngüsü", "onStop çalıştı")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Yaşam Döngüsü", "onDestroy çalıştı")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("Yaşam Döngüsü", "onRestart çalıştı")
    }
}