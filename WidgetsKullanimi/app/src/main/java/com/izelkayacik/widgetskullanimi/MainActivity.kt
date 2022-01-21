package com.izelkayacik.widgetskullanimi

import android.app.DatePickerDialog
import android.app.Dialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.SeekBar
import com.google.android.material.snackbar.Snackbar
import com.izelkayacik.widgetskullanimi.databinding.ActivityMainBinding
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var tasarim:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonResim1.setOnClickListener {
            tasarim.imageView.setImageResource(R.drawable.resim1)
        }

        tasarim.buttonResim2.setOnClickListener {
            tasarim.imageView.setImageResource(resources.getIdentifier("resim2",
                "drawable",
                packageName))
        }

        tasarim.switch1.setOnCheckedChangeListener { s, b ->
            if (b){
                Log.e("MainActivity", "Switch : ON")
            }else{
                Log.e("MainActivity", "Switch : OFF")
            }
        }

        tasarim.checkBoxKotlin.setOnCheckedChangeListener { s, b ->
            if (b){
                Log.e("MainActivity", "Kotlin seçildi")
            }
        }

        tasarim.radioButtonRealmadrid.setOnCheckedChangeListener { s, b ->
            if (b){
                Log.e("Widgets", "Real Madrid seçildi")
            }
        }

        tasarim.buttonBasla.setOnClickListener {
            tasarim.progressBar.visibility = View.VISIBLE
        }
        tasarim.buttonBasla.setOnClickListener {
            tasarim.progressBar.visibility = View.INVISIBLE

        }

        tasarim.slider.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                tasarim.textViewSonuc.text = progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}

        } )

        tasarim.buttonSaat.setOnClickListener {
            val calendar = Calendar.getInstance()
            val saat = calendar.get(Calendar.HOUR_OF_DAY)
            val dakika = calendar.get(Calendar.MINUTE)

            val tp = TimePickerDialog(this, TimePickerDialog.OnTimeSetListener{ t, s, dk ->
                tasarim.editTextSaat.setText("$s : $dk")
            },saat,dakika, true)

            tp.setButton(DialogInterface.BUTTON_POSITIVE, "Seç",tp)
            tp.setButton(DialogInterface.BUTTON_NEGATIVE, "İptal",tp)
            tp.show()
        }

        tasarim.buttonTarih.setOnClickListener {
            val calendar = Calendar.getInstance()
            val yil = calendar.get(Calendar.YEAR)
            val ay = calendar.get(Calendar.MONTH)
            val gun = calendar.get(Calendar.DAY_OF_MONTH)

            val dp = DatePickerDialog(this,DatePickerDialog.OnDateSetListener{d,y,a,g ->
                tasarim.editTextTarih.setText("$g/${a+1}/$y") //ay her zaman 1 eksiğini verdiği için +1 dedik
            },yil,ay,gun)

            dp.setButton(DialogInterface.BUTTON_POSITIVE, "Seç",dp)
            dp.setButton(DialogInterface.BUTTON_NEGATIVE, "İptal",dp)
            dp.show()
        }

        val ulkeler = ArrayList<String>()
        ulkeler.add("Türkiye")
        ulkeler.add("İtalya")
        ulkeler.add("Japonya")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,android.R.id.text1,ulkeler)

        tasarim.spinner.adapter = adapter

        tasarim.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View, position: Int, id: Long) {
                Snackbar.make(view, "${ulkeler.get(position)} seçildi", Snackbar.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        tasarim.buttonGoster.setOnClickListener {
            Log.e("MainActivity", "Switch en son durum : ${tasarim.switch1.isChecked}")
            Log.e("MainActivity", "Kotlin en son durum : ${tasarim.checkBoxKotlin.isChecked}")
            Log.e("MainActivity", "Java en son durum : ${tasarim.checkBoxJava.isChecked}")
            Log.e("MainActivity", "Barcelona son durum : ${tasarim.radioButtonBarcelona.isChecked}")
            Log.e("MainActivity", "Real Madrid son durum : ${tasarim.radioButtonRealmadrid.isChecked}")
            Log.e("MainActivity", "Real Madrid son durum : ${tasarim.slider.progress}")
            Log.e("Widgets", "Spinner en son durum: ${ulkeler.get(tasarim.spinner.selectedItemPosition)}")

        }
    }
}