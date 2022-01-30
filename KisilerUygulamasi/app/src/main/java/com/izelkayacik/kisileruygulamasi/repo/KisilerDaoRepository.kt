package com.izelkayacik.kisileruygulamasi.repo

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.izelkayacik.kisileruygulamasi.entity.Kisiler
import com.izelkayacik.kisileruygulamasi.room.Veritabani
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class KisilerDaoRepository(var application: Application) {

    var kisilerListesi:MutableLiveData<List<Kisiler>>
    var vt:Veritabani

    init {
        kisilerListesi = MutableLiveData()
        vt = Veritabani.veritabaniErisim(application)!!
    }

    fun kisileriGetir(): MutableLiveData<List<Kisiler>>{
        return kisilerListesi
    }

    fun kisiKayit(kisi_ad:String, kisi_tel:String){
        val job = CoroutineScope(Dispatchers.Main).launch{
            val yeniKisi = Kisiler(0, kisi_ad, kisi_tel)
            vt.kisilerDao().kisiEkle(yeniKisi)
        }
    }

    fun kisiGuncelle(kisi_id:Int, kisi_ad:String, kisi_tel:String){
        Log.e("Kişi Güncelle", "$kisi_id - $kisi_ad - $kisi_tel")
    }

    fun kisiAra(aramaKelimesi:String){
        Log.e("Kişi Ara", aramaKelimesi)
    }
    fun kisiSil(kisi_id:Int){
        val job = CoroutineScope(Dispatchers.Main).launch {
            val silinenKisi = Kisiler(kisi_id, "","")
            vt.kisilerDao().kisiSil(silinenKisi)
            tumKisileriAl()
        }
    }

    fun tumKisileriAl(){
        val job = CoroutineScope(Dispatchers.Main).launch {
            kisilerListesi.value = vt.kisilerDao().tumKisiler()
        }
    }

}