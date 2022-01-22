package com.izelkayacik.kullanicietkilesimi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import com.izelkayacik.kullanicietkilesimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var tasarim:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tasarim = ActivityMainBinding.inflate(layoutInflater)

        setContentView(tasarim.root)

        tasarim.buttonToast.setOnClickListener {
            Toast.makeText(applicationContext, "Merhaba", Toast.LENGTH_SHORT).show()
        }

        tasarim.buttonSnackbar.setOnClickListener {
            val sb = Snackbar.make(it, "İnternet Bağlantısı Yok!", Snackbar.LENGTH_LONG)
                sb.setAction("TEKRAR DENE"){
                    //Snackbar.make(it, "Silindi", Snackbar.LENGTH_SHORT).show()
                }

            sb.setActionTextColor(Color.RED)//Action veya button rengi
            sb.setTextColor(Color.BLUE)//Mesaj rengi
            sb.setBackgroundTint(Color.WHITE)//Arkaplan rengi
            sb.show()

        }

        tasarim.buttonAlert.setOnClickListener {
            val ad = AlertDialog.Builder(this@MainActivity)
            ad.setTitle("Başlık")
            ad.setMessage("İçerik")

            ad.setPositiveButton("Tamam"){s, l ->
                Log.e("Alert", "Tamam seçildi")
            }

            ad.setNegativeButton("Tamam"){s, l ->
                Log.e("Alert", "Tamam seçildi")
            }


        }
    }
}