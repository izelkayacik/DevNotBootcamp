package com.izelkayacik.kisileruygulamasi.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.izelkayacik.kisileruygulamasi.entity.Kisiler
import com.izelkayacik.kisileruygulamasi.repo.KisilerDaoRepository

class AnasayfaFragmentViewModel(application: Application) : AndroidViewModel(application) {
    var kisilerListesi = MutableLiveData<List<Kisiler>>()
    val krepo = KisilerDaoRepository(application)

    init {
        kisileriYukle()
        kisilerListesi = krepo.kisileriGetir()
    }

    fun ara(aramaKelimesi:String){
        krepo.kisiAra(aramaKelimesi)
    }

    fun sil(kisi_id:Int){
        krepo.kisiSil(kisi_id)
    }

    fun kisileriYukle(){
        krepo.tumKisileriAl()
    }

}